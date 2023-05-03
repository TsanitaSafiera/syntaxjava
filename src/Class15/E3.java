package Class15;

public class E3 {
    String color="blue"; // instance
    public static void main(String[] args) {
        double weight=30; // local variable because inside the main methode
        if (10>20){
            int sum=10; // sum is local variables to if statement and
            // can only be accessed inside the block of code
        }
        //System.out.println(sum); => sum cant be accessed because sum
        // is local variable and the print is outside the block of code

        //String Breed; => local
    }
    String name; // instance variables => codes that are created
    // outside of any block of code like method, loop, if statement etc
    // but they are inside a class

    static String year;// => //static, static is with key words static
    // local can't be static, only instance can
}
