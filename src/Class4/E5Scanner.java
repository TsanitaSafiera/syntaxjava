package Class4;

import java.util.Scanner;

public class E5Scanner {
    public static void main(String[] args) {

        /* Scanner is a class(which knows how to take the input from the keyboard)
        scan=> is variable of type scanner just like we create a variable of type String
        new => is special keywords which create object of class
        System.in=> means we want to use the scanner class for taking user input
         */
        //whenever we need to take the input from user we need this code

        Scanner scan= new Scanner(System.in);
        System.out.println("Please enter your name");
        // Calling the next methode to take the string from the user
        String name=scan.next();
        System.out.println("You are amazing "+name);
    }
}
