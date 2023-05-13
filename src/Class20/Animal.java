package Class20;

public class Animal {
    // Create 3 animal classes(Dog,Cat,Horse) create 5 methods in each class. create
    //3 fields and constructors as well in each class. Create the object of all 3 classes
    //and call 2 methods from each class. Yuo must use inheritance to avoid code duplication

    String name;
    String color;
    int age;


    Animal(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;

    }

    void speak() {
        System.out.println("Speaking");
    }

    void sleep() {
        System.out.println("ZZZZzzzzzz");
    }

    void eat() {
        System.out.println("eating");
    }
}

class Dog extends Animal {
    Dog(String name, String color, int age) {
        super(name, color, age);
    }
    @Override
    void sleep() {
        System.out.println("I like to sleep for 10.6 hours a day");

    }
}
class Cat extends Animal {

    Cat (String name,String color,int age){
        super(name, color,age);}
}
class Horse extends Animal {

    Horse (String name,String color,int age){
        super(name, color,age);}
}
class AnimalTester{
    public static void main(String[] args) {

        Dog dog = new Dog("Jam", "Brown", 10);
        Cat cat = new Cat("tom", "White", 5);
        Horse horse = new Horse("Jam", "Brown", 10);

        //dog.eat();
        dog.sleep();
        /*dog.speak();

        cat.eat();
        cat.sleep();
        cat.speak();

        horse.eat();
        horse.sleep();
        horse.speak();*/

    }

}
