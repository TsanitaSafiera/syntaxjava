package Class17;

public class DogTester {
    public static void main(String[] args) {
       /* Dog obj=new Dog();
        Dog obj1=new Dog();
        Dog obj2=new Dog();
        Dog obj3=new Dog();
        Dog obj4=new Dog();

        obj.name="Ringgo";
        obj.color="Black";
        obj.breed="Poodle";
        obj.age=2;

        obj1.name="Bull";
        obj1.color="Black";
        obj1.breed="Bulldog";
        obj1.age=3;

        obj2.name="Luis";
        obj2.color="White";
        obj2.breed="Poodle";
        obj2.age=3;

        obj.printInfo();
        obj1.printInfo();
        obj2.printInfo();*/

        // below code will create the object of dog class
        // Dog dog1=new Dog("jack","Black","Persian",12);

        Dog dog1=new Dog("jack","Black","Persian",12);
        Dog dog2=new Dog("shaggy","white","Husky",8);
        Dog dog3=new Dog("fluffy","Pink","British", 8);

        dog1.printInfo();
        dog2.printInfo();
        dog3.printInfo();
    }
}
