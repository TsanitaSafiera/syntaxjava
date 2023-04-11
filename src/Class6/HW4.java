package Class6;

import java.util.Scanner;

public class HW4 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter your birth month ");
        String num=scanner.next();

        if(num.equals("March") || num.equals("April") || num.equals("May")){
            System.out.println("You were born in spring Season");
        }else if(num.equals("June") || num.equals("July") || num.equals("August")){
            System.out.println("You were born in Summer Season");
        }else if(num.equals("September") || num.equals("October") || num.equals("November")){
            System.out.println("You were born in fall season");
        }else if(num.equals("December") || num.equals("January") || num.equals("February")){
            System.out.println("You were born in winter season");
        }


    }
}
