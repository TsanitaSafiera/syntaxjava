package Class22;

public abstract class Animals {
    /*
    create 3 animals like Dog Cat and Horse
    define 3 common methods in each class like speak eat and sleep.
    create the object of all the classes and call the methods.
 */
    private String name;
    private String color;
    final private String breed;

    abstract void speak();
    abstract void sleep();
    abstract void eat();

    public Animals(String name, String color, String breed) {
        this.name = name;
        this.color = color;
        this.breed = breed;
    }
    void printInfo(){
        System.out.println(name+" "+ color + " "+ breed);
    }
}
class Dog extends Animals {
    public Dog(String name, String color, String breed) {
        super(name,color,breed);
    }
    @Override
    void speak(){
        System.out.println("Dog speaks");
    }
    @Override
    void sleep(){
        System.out.println("Dog is sleeping");
    }
    @Override
    void eat(){
        System.out.println("Dog is eating");
    }


}
class Cat extends Animals{
    public Cat(String name, String color, String breed) {
        super(name,color,breed);
    }
    @Override
    void speak(){
        System.out.println("Cat speaks");
    }
    @Override
    void sleep(){
        System.out.println("Cat is sleeping");
    }
    @Override
    void eat(){
        System.out.println("Cat is eating");
    }

}
class Horse extends Animals{
    public Horse (String name, String color, String breed) {
        super(name,color,breed);
    }
    @Override
    void speak(){
        System.out.println("Horse speaks");
    }
    @Override
    void sleep(){
        System.out.println("Horse is sleeping");
    }
    @Override
    void eat(){
        System.out.println("Horse is eating");
    }

}
class AnimalsTester {
    public static void main(String[] args) {


        Animals[] animal = {new Dog("Doggy","White","Husky"),
                new Cat("Tom","Blue","Persian"),
                new Horse("Beauty","Black","Turkish")};
        for (Animals a: animal) {
            a.eat();
            a.sleep();
            a.speak();
            a.printInfo();

        }
    }
}