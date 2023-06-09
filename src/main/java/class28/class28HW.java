package class28;

public class class28HW {

    public static void main(String[] args) {

        // Create a method to check age eligibility that will throw a runtime
        // exception. Method should throw an exception age is less than 16.
        //Create a method checkUserName that will throw a runtime exception.
        // Method should throw an exception when entered username is less than
        // 5 characters.

        int age = 15;
        String username = "Tsanita";

        try {
            checkAgeEligibility(age);
            System.out.println("Eligible");
        } catch (RuntimeException e) {
            System.out.println("Exception : " + e.getMessage());
        }

        try {
            checkUserName(username);
            System.out.println("valid username");
        } catch (RuntimeException e) {
            System.out.println("Exception : " + e.getMessage());
        }
    }

    public static void checkAgeEligibility(int age) {
        if (age < 16) {
            throw new RuntimeException("Age is less than 16");
        }
    }

    public static void checkUserName(String username) {
        if (username.length() < 5) {
            throw new RuntimeException("Username is less than 5 characters");
        }














    }

}
