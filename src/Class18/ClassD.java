package Class18;

public class ClassD {
    // Write program to inherit class A that has method printF which is
    // static and call or reuse that method into class B

    static void print() {
        System.out.println("Hello world");
    }
}

class ClassE extends ClassD{

}

class ETester extends ClassE {
    public static void main(String[] args) {
        ClassE.print();
    }

}

