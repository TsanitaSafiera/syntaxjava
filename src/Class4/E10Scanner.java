package Class4;

import java.util.Scanner;

public class E10Scanner {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter your gender");
        /* there is no direct methode for char datatype in scanner class
            we use a work around we first use the next methode to take a String from
            the user and from that string we extract the first letter by passing
            0 to the charAt()methode
         */
        char gender=scanner.next().charAt(0);
        System.out.println("you entered "+gender);

    }
}
