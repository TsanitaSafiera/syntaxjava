package Class19HW;

public class OverLoaded {
    // Create 1 class with a static method that has 3 overloaded forms.
    // Then call each overloaded method with specific arguments and observe
    // result.

    static void multiply(int a, int b){
        System.out.println(a*b);
    }
    static void multiply(int a, double b){
        System.out.println(a*b);
    }
    static void multiply(double a, double b){
        System.out.println(a*b);

}
    public static void main (String [] args){
        multiply(2,3);
        multiply(3,4.3);
        multiply(2.1,4.2);
    }
}
