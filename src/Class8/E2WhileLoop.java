package Class8;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class E2WhileLoop {
    public static void main(String[] args) {

        // in a while loop ask the user to enter numbers if user enters any number
        // other than -1 print "Hello world" and keep on asking the user for number
        // the moment user enters the number -1 the loop should stop

        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter a number");
        int number=scanner.nextInt();

        while(number!=-1){
            System.out.println("Hello World");
            number=scanner.nextInt();
        }
    }
}
