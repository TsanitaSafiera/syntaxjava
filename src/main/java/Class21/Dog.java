package Class21;

class Animal{
    String name;
    String color;
    String breed;

    public Animal(String name, String color, String breed) {
        this.name = name;
        this.color = color;
        this.breed = breed;
    }

    void printInfo(){
        System.out.println(name+" "+color+" "+breed);
    }
    void speak(){
        System.out.println("Animal Speak");
    }
    void sleep(){
        System.out.println("Animal sleep from 1 to 20 nhours a day");
    }
    void eat(){
        System.out.println("Animal eat many different thing");
    }

}
class Cat extends Animal {
    public Cat(String name, String color, String breed) {
        super(name, color, breed);
    }
    @Override
    void speak(){
        System.out.println("Meow meow...");

    }
    @Override
    void sleep(){
        System.out.println("Cat sleep 15 hours on average");
    }
    @Override
    void eat(){
        System.out.println("Cats eat fish");
    }

}
public class Dog extends Animal {
    public Dog(String name, String color, String breed) {
        super(name, color, breed);
    }
    @Override
    void speak() {
        System.out.println("woof woof...");
    }
    @Override
    void sleep(){
        System.out.println("Dogs sleeps 8 hours");
    }
    @Override
    void eat(){
        System.out.println("Dogs like to chew the bones");
    }
    void run(){
        System.out.println("Dog can run fast");
    }

}
class Horse extends Animal{
    Horse(String name, String color, String breed) {
        super(name, color, breed);
    }
    @Override
    void speak(){
        System.out.println("neigh.. neigh....");
    }
    @Override
    void sleep(){
        System.out.println("Horses sleeps 2-3 hours");
    }
    @Override
    void eat(){
        System.out.println("Horses like carrots+ grass");
    }
}
class AnimalTester{
    public static void main(String[] args) {


        Dog dog = new Dog("shaggy","black","German");
        dog.printInfo();

        Animal dog1=new Dog("shaggy","black","German");
        dog1.printInfo();

        Animal [] animals={new Dog("shaggy","black","German"),new Cat("Tom","blue","Persian")};
        for (Animal animal:animals){
            animal.printInfo();
        }

        //type casting (widening)
        double d=10;
        Animal dog2=new Dog("shaggy","black","German");

        //type casting (narrowing)
        int g = (int)10.5;
        // although we already type casting it but it only work if its a dog class
        Dog dog3=(Dog)new Animal("shaggy","black","German");
        // Dog dog3= Animal("shaggy","black","German"); // not allowed
    }


}
