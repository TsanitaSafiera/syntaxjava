package Class6;

import java.util.Scanner;
import java.util.SortedMap;

public class HW6 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter your country");
        String country=scanner.next();
        System.out.println("Your Country is : "+country);

        if(country.equals("USA") || country.equals("UK")){
            System.out.println("You speak English");
        }else if(country.equals("Spain") || country.equals("Mexico")){
            System.out.println("You speak Spanish");
        }else{
            System.out.println("Not registered");
        }
        System.out.println("Please enter your grade (A,B,C or D)");
        char grade=scanner.next().charAt(0);
        System.out.println("Your Grade is :"+grade );

        switch(grade){
            case 'A':
                System.out.println("A-Excellent");
                break;
            case 'B':
                System.out.println("B-Good");
                break;
            case 'C':
                System.out.println("C-Average");
                break;
            case 'D':
                System.out.println("D-Bad");
                break;
            default :
                System.out.println("Not Acceptable");



        }
    }
}
