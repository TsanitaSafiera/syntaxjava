package Class19;

public class Animal {
    // create 3 classes like dog cat horse define 5 properties (use default access
    // level in each class
    // and one printInfo method that will print the values of these variables.
    // create constructors as well in each child class to initiate those
    // properties create one object of each class and call the printInfo method

    private String color;
    private int age;
    private double weight;
    private String breed;
    private String name;

    public Animal(String color, int age, double weight, String breed, String name) {
        this.color = color;
        this.age = age;
        this.weight = weight;
        this.breed = breed;
        this.name = name;
    }

    void printInfo(){
        System.out.println(name+" "+ age+" "+ weight+" "+breed+" "+color);
    }


}
class Dog extends Animal {
    double price;
    public Dog(String color, int age, double weight, String breed, String name,double price){
        super(color,age,weight,breed,name);
        this.price=price; // assigning the price
}
   void printInfo(){
        super.printInfo(); //reusing the printInfo method from parent class by using
       // super keywords
       System.out.println(price);

    }

}
class Cat extends Animal{


    public Cat(String color, int age, double weight, String breed, String name) {
        super(color, age, weight, breed, name);
    }
}
class Horse extends Animal{


    public Horse(String color, int age, double weight, String breed, String name) {
        super(color, age, weight, breed, name);
    }
}
class AnimalTester{
    public static void main(String[] args) {


        Dog dog = new Dog ("black", 2, 3.1, "persian", "Tom",200);
        dog.printInfo();
    }
}