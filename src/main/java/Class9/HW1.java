package Class9;

public class HW1 {
    public static void main(String[] args) {

        // Create an array of chars and store grades into it: A,B,C,D. Then print a grade B
        // (use 2 different ways of creating an array).

        char [] grades={'A', 'B', 'C', 'D'};
        System.out.println(grades[1]);

        char [] num=new char[4];
        num[0]='A';
        num[1]='B';
        num[2]='C';
        num[3]='D';

        System.out.println(num[1]);


    }
}
