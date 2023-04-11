package Class6;

import java.util.Scanner;

public class HW8 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter first number you want to use ");
        int num1=scanner.nextInt();

        System.out.println("Enter second number you want to use ");
        int num2=scanner.nextInt();

        System.out.println("Enter operator you want to use (+,-,*,/");
        char operator=scanner.next().charAt(0);

        if(operator == '+'){
            System.out.println(num1 + "+" + num2 + "=" + (num1+num2));
        }else if(operator == '-'){
            System.out.println(num1 + "-" + num2 + "=" + (num1-num2));
        }else if(operator == '*'){
            System.out.println(num1 + "*" + num2 + "=" + (num1*num2));
        }else if(operator == '/'){
            System.out.println(num1 + "/" + num2 + "=" + (num1/num2));
        }




    }
}
