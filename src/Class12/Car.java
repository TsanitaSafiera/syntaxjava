package Class12;

public class Car {
    // define 5 properties and 3 methods

    String color;
    String make;
    String model;
    int mileage;
    int year;
    boolean isAutomatic;

    void playMusic(){
        System.out.println("Playing Justin Timberlake");
    }
    void move(){
        System.out.println("Starting the engine");
    }
    void pressAccelerate(){
        System.out.println("Speed is going up");
    }
    void pressBrake() {
        System.out.println("Car starts to slow down and stop");

    }
    void startCar(){
        System.out.println("Starting "+ model+ " the car");
    }
}
