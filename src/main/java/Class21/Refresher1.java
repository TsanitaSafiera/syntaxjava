package Class21;

public class Refresher1 {
    public static void main(String[] args) {


        Dog [] dogs={new Dog("Lal","Black","Persian"), new Dog("Papi","White","Chinese")};
        //Dog d=dogs[0];// accessing manually not a good practice cos one by one
        //d.printInfo();

        // use this instead
        //for (int i = 0; i < dogs.length; i++) {
           // dogs[i].printInfo()
        //}
        for(Dog d:dogs){    // with enhanced for loops
            d.printInfo(); // because it has a void as return type so you cant put it in sout
        }

    }
}
