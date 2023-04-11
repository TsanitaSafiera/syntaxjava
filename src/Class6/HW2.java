package Class6;

import java.util.Scanner;

public class HW2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter a number");
        int num=scanner.nextInt();

        if(num>=1 && num<=10){
            System.out.println("Number is Small");
        }else if(num>=11 && num<=100){
            System.out.println("Number is Medium");
        }else if(num>=101 && num<=1000){
            System.out.println("Number is Large");
        }
    }
}
