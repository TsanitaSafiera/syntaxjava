package Class7;

import java.util.Scanner;
import java.util.SortedMap;

public class E13WhileLoop {
    public static void main(String[] args) {
        //ask the user for the number then print all the numbers from 1 till that number

        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter any number greater than 1");
        int num=scanner.nextInt();

        int counter=1;
        while (counter<=num){
            System.out.print(counter + " ");
            counter++;
        }

    }
}
