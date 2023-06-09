package class28;

import java.util.Scanner;

public class Main {
    public static void main(String []args){

        Scanner scanner=new Scanner(System.in);
        int grade= scanner.nextInt();

        try{
            gradeCheck(grade);
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
    static void gradeCheck(int grade)throws SyntaxStudentException{

        if (grade >90){
            throw new SyntaxStudentException("You are an exceptionally awesome student");
        }
        else{
            System.out.println("You are a great student");
        }
    }
}
