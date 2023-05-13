package Class21;

public class E1Poly {
    public static void main(String[] args) {

   /* Animal[] animals = new Animal[3];
    animals[0] = new Dog("Jack", "black", "German");
    animals[1] = new Cat("Tom", "blue", "Persian");
    animals[2] = new horse("Spirit", "brown", "Arabian Horse");

        for (int i = 0; i < animals.length; i++) {
        animals[i].printInfo();
        animals[i].eat();
        animals[i].sleep();
        animals[i].speak();
    }*/
    // general calling
    Animal [] animals= {new Dog("Shaggy","Black","German"),
            new Cat("Tom", "White", "Persian"),
            new Horse("Stallion","Black","Turkish")
    };

        for (Animal animal:animals){
        animal.speak();
        animal.eat();
        animal.sleep();
    }
    // specific calling
    Animal dogStoredInAnimal=new Dog("Shaggy","Black","German");
    // we must type cast the animal back to a dog to call the run method
     // as this run method only exist in the Dog class
     // int num = (int) 10.5 => type casting from double to int
     // the same concept for animal type cast to Dog using type casting
    Dog d = (Dog) dogStoredInAnimal;
    d.run();
    // direct way without using a variable
    ((Dog)dogStoredInAnimal).run();
    }



}
