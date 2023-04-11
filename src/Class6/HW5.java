package Class6;

import java.util.Scanner;

public class HW5 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please Enter a Quiz score");
        int quiz=scanner.nextInt();

        System.out.println("Enter a Mid Term score");
        int midTerm=scanner.nextInt();

        System.out.println("Enter a final score");
        int finalScore=scanner.nextInt();

        int average=(quiz+midTerm+finalScore)/3;

        if(average>=90){
            System.out.println("Grade A");
        }else if(average>=70 && average<90){
            System.out.println("Grade B");
        }else if(average>=50 && average<70){
            System.out.println("Grade C");
        }else if(average<50){
            System.out.println("Grade F");
        }

    }
}
