package HomeWork;

public class Variables {
    public static void main(String[] args) {
        String name="Tsanita";
        String lastName="Safiera";
        char grade='A';
        String city="Tampa";
        String state="Florida";
        String phoneNumber="+1-781-158-1234";
        System.out.println("My name is " + name + " and my last name is " + lastName);
        System.out.println("I am " + grade + " student");
        System.out.println("I live in " + city + ", " + state);
        System.out.println("And my phone number is " + phoneNumber);

        city="Alpharetta";
        state="Georgia";
        phoneNumber="+1-123-456-7891";

        System.out.println("My name is " + " " + name + " " + "And i Moved to " + city + "," + state );
        System.out.println("My new phone number is " + " " + phoneNumber);
    }
}
