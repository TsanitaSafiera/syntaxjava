package HomeWork;

import java.util.Scanner;

public class LoanSpecialist {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter the amount of loan");
        int loan= scanner.nextInt();

        if(loan<=200000){
            System.out.println("You are approved");
        }else{
            System.out.println("You are not approved");
        }

    }
}
