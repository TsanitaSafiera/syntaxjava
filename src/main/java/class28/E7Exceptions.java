package class28;

import java.util.InputMismatchException;
import java.util.Scanner;

public class E7Exceptions {
    public static void main(String[] args) {
        // How would handle InputMismatchException? Input Mismatch Exception
        // when user enters mismatch value then programmer expected

        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Please Enter an int");
            scanner.nextInt();
        } catch (InputMismatchException ime) {
            System.out.println("Enter the proper type of data");
        }

    }
}
