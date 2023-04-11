package Class6;

import java.util.Scanner;

public class HW7 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.print("Which operation do you want (+,-,*,/): ");
        String temp=scanner.nextLine();

        switch (temp){
            case"+":
                System.out.print("First number you want to add: ");
                int add1=scanner.nextInt();
                System.out.print("Second number you want to add: ");
                int add2= scanner.nextInt();

                System.out.print("Answer is: "+(add1 + add2));
                break;

            case"-":
                System.out.print("First number you want to subtract: ");
                int sub1=scanner.nextInt();
                System.out.print("Second number you want to subtract: ");
                int sub2= scanner.nextInt();

                System.out.print("Answer is: "+(sub1 - sub2));
                break;


            case"*":
                System.out.print("First number you want to multiply: ");
                int mul1=scanner.nextInt();
                System.out.print("Second number you want to multiply: ");
                int mul2= scanner.nextInt();

                System.out.print("Answer is: "+(mul1 * mul2));
                break;

            case"/":
                System.out.print("First number you want to divide: ");
                int div1=scanner.nextInt();
                System.out.print("Second number you want to divide: ");
                int div2= scanner.nextInt();

                System.out.print("Answer is: "+(div1 / div2));
                break;

            default:
                break;
        }



    }
}
