package emailapp;

public class App {
    public static void main(String[] args) throws Exception {
        Email em1 = new Email("Taesan", "Kim");

        //em1.setAlternateEmail("ts@gmail.com");

        System.out.println(em1.showInfo());
    }
}
