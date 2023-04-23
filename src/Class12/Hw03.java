package Class12;

import java.util.Scanner;

public class Hw03 {
    public static void main(String[] args) {
        /*
        Write a program that reads two people's first names and
        if they're expecting boy or girl?
        Based on the input suggests a name for a baby:
        Example Output:
        Mom’s first name? Mary
        Dad’s first name? Daniel

        if boy, suggested baby name: DANRY
        if girl, suggested baby name: MAIEL
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Mom's first name?");
        String mom = scan.next();
        System.out.println("Dad's first name?");
        String dad = scan.next();
        System.out.println("boy or girl?");
        String gender = scan.next();

        String suggestedBabyName = null;
        if (gender.equals("boy")) {
            suggestedBabyName = dad.substring(0, 3) + mom.substring(mom.length() - 2);
        } else if (gender.equals("girl")) {
            suggestedBabyName = mom.substring(0, 2) + dad.substring(dad.length() - 3);
        }
        System.out.println("Suggested baby name: " + suggestedBabyName.trim().toUpperCase());
    }
}
