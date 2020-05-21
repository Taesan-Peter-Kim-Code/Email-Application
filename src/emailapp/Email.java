/**
 * @author [Taesan Peter Kim]
 * @email [peterkim3002@gmail.com]
 * @create date 2020-05-21 15:51:20
 * @modify date 2020-05-21 15:51:20
 * @desc [I got an instruction from https://www.youtube.com/watch?time_continue=397&v=U3Ibvu0htNs&feature=emb_logo to complete this project. This is an email application to generate an email with a given syntax.]
 */
package emailapp;

import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private String email;
    private int mailboxCapacity = 500;
    private int defaultPasswordLength = 10;
    private String alternateEmail;
    private String companySuffix = "tscompany.com";

    //constructor to receive the firt name and last name
    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
       

        //call a method asking for the department - return the department
        this.department = setDepartment();
       

        //call a method that returns a random password
        this.password = randomPassword(defaultPasswordLength);
        System.out.println("Your password is: " + this.password);

        //combine elements to generate an email format
        email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "." + companySuffix;

    }

    //ask for the departmemt of the worker
    private String setDepartment() {
        System.out.println("New Worker: " + firstName + " " + lastName + "\nEnter the department codes: \n1 for Sales\n2 for Development\n3 for Accounting\n0 for none\nEnter department code: ");
        Scanner in = new Scanner(System.in);
        int depChoice = in.nextInt();
        switch (depChoice) {
            case 1: 
                return "sales";
            case 2:
                return "development";
            case 3:
                return "accounting";
            default:
                return "";
        }
    }

    //generate a random password
    private String randomPassword(int length) {
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%";
        char[] password = new char[length];
        for (int i = 0; i < length; i++) {
            int randomValue = (int) (Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(randomValue);
        }
        return new String(password);
    }
    
    //set the mailbox capacity
    public void setMailboxCapacity(int capacity) {
        this.mailboxCapacity = capacity;
    }

    //set the alternate email
    public void setAlternateEmail(String altEmail) {
        this.alternateEmail = altEmail;
    }

    //change the password
    public void changePassword(String password) {
        this.password = password;
    }

    public int getMailboxCapacity() {
        return mailboxCapacity;
    }

    public String getAlternateEmail() {
        return alternateEmail;
    }

    public String getPassword() {
        return password;
    }
    
    public String showInfo() {
        return "Company Email: " + email + "\nMailbox Capacity: " + mailboxCapacity + "mb";
    }
}