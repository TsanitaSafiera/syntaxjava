package Class17HW;

public class Levels {
    // Write a java class that have 4 constructors with 4 different access
    // levels of constructors(private,public,default,protected) and create
    // 4 objects of this class: 1 - inside same class; 2 - from outside
    // the class; 3 - from different class inside different package
    // and observe result.
    //Write program that have static constructor and observe result.

    private Levels() {
        System.out.println("Private constructor called.");
    }
    public Levels(int x) {
        System.out.println("Public constructor called with parameter: " + x);
    }
    Levels(double s) {
        System.out.println("Default constructor called with parameter: " + s);
    }
    protected Levels(String b) {
        System.out.println("Protected constructor called with parameter: " + b);
    }

    public static void main(String[] args) {
        Levels obj1 = new Levels();

        Levels obj2 = new Levels(66);

        Levels obj3 = new Levels(20.5);

        Level2 obj4 = new Level2();
        obj4.printProtected();


    }
}
class Level2 {
    void printProtected() {
        Levels obj = new Levels ("Move");
    }
}


// Write program that have static constructor and observe result.
/*class Level3 {
    String name;
    int age;

    static Level3(String name, int age) {
        // can not create static constructor
    }
}
*/
