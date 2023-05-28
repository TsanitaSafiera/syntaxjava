package GroupProjectArray;

public class Task5 {
    public static void main(String[] args) {

        //Write a program to swap 2 numbers without a
        //temporary variable?

        int a=20;
        int b=30;

        a = a + b; // 50
        b = a - b; // 20
        a = a - b; // 30

        System.out.println("After swap : ");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
