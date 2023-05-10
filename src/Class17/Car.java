package Class17;

public class Car {
    // Write a java class that will have a constructor: one with
    // parameters and second without any parameters. Create a separate
    // Test class where you will execute both of the constructors 1 by 1.

    String make;
    String model;
    int year;

    Car(){
        System.out.println("No parameter");

    }
    Car(String carMake){
        make=carMake;
        System.out.println("With parameter");

    }



}
