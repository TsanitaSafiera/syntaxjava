package HomeWork;

import java.util.Scanner;

public class DMV {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter your age");
        int age=scanner.nextInt();

        if(age>=18){
            System.out.println("You can have a driver licence");
        }else{
            System.out.println("You can Have a permit");
        }
    }
}
