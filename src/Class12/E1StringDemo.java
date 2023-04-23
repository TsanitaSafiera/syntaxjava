package Class12;

public class E1StringDemo {
    public static void main(String[] args) {

        // create the object of that class
        // the same syntax when we create scanner class
        // when we want to create the object of a class the syntax is the same
        // Scanner scanner=new Scanner(System.in)
        // ClassName objectName = new ClassName()
        // String string=new String("Ana");
        String string1 = "Ana"; // most widely used one
        System.out.println(string1.length());
        // the output will be 3 because there are 3 letters in Ana

        String name="Justin Chukwudiuche";

        if(name.length()>8){
            System.out.println("Only 8 characters allowed");
        }
    }
}
