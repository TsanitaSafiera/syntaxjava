package Class17;

public class Zebra {
    String name;
    String color;
    int age;
    double weight;
    static int noOfLegs=4;

    public Zebra(String name, String color, int age, double weight) {
        this.name = name;
        this.color = color;
        this.age = age;
        this.weight = weight;
        // to automatically generate constructor (right click=>
        // generates=> constructor=> hold down Shift button and press
        // down button to select the instances
    }
    void printInfo(){
        System.out.println(name+" "+color+" "+age+" "+weight);
    }
   static void speak(){
        System.out.println("moooooo bahahahaha");
        // use the static method if does not involve instance variable
    }
}
