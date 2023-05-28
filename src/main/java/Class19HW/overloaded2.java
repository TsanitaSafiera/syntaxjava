package Class19HW;

public class overloaded2 {
    // Create 1 class with a public method that has 3 overloaded forms.
    // Then call each overloaded method with specific arguments and observe
    // result.

    private static void multiply(int a, int b){
        System.out.println(a*b);
    }
    private static void multiply(int a, double b){
        System.out.println(a*b);
    }
    private static void multiply(double a, double b){
        System.out.println(a*b);

}
    public static void main (String [] args){
        multiply(2,3);
        multiply(3,4.3);
        multiply(2.1,4.2);
    }
}
