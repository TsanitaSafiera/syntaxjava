package Class12;

public class DogTester {
    public static void main(String[] args) {
        Dog actualDog= new Dog();
        actualDog.name="Jacky";
        actualDog.age=15;
        actualDog.breed="German";
        actualDog.color="black";
        actualDog.weight=50;

        actualDog.bark();
        Dog object=new Dog();
        object.name="Tesla";
        object.age=1;
        object.breed="Poodle";
        object.color="Brown";
        object.weight=10;
        object.bark();
    }
}
