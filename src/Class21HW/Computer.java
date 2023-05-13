package Class21HW;

public class Computer {
    // Create a Class Computer that will have 4 subclasses as Apple, Lenovo, HP, Dell.
    //Define common behavior within and some fields in parent class and override some
    // of the methods in child classes
    //Define some methods specific to child classes
    //Create objects of child classes and store them into array. Loop through each object
    // and execute available methods.

    String name;
    String model;
    int price;

    void type(){
        System.out.println("Computer can type words");
    }
    void browsInternet(){
        System.out.println("We can use computer to browse the internet ");
    }

}

class Apple extends Computer{
    @Override
    void type(){
        System.out.println("Apple Computer can type words");
    }
    @Override
    void browsInternet(){
        System.out.println("We can use Apple to browse the internet ");
    }
    void videoCall(){
        System.out.println("We can use Apple computer to vide call");
    }

}
class Lenovo extends Computer{
    @Override
    void type(){
        System.out.println("Lenovo Computer can type words");
    }
    @Override
    void browsInternet(){
        System.out.println("We can use Lenovo to browse the internet ");
    }
    void playMusic(){
        System.out.println("We can use Lenovo to play music");
    }
}
class HP extends Computer{
    @Override
    void type(){
        System.out.println("HP Computer can type words");
    }
    @Override
    void browsInternet(){
        System.out.println("We can use HP to browse the internet ");
    }

}
class Dell extends Computer{
    @Override
    void type(){
        System.out.println("Dell Computer can type words");
    }
    @Override
    void browsInternet(){
        System.out.println("We can use Dell to browse the internet ");
    }

}
class ComputerTester {
    public static void main(String[] args) {

        Computer [] computers={ new Apple(),new Lenovo(),new HP(), new Dell()};

        for (Computer computer:computers) {
            computer.type();
            computer.browsInternet();
        }

            Computer computer= new Apple();
            Apple apple=(Apple) computer;
            apple.videoCall();

            Computer computer1= new Lenovo();
            Lenovo lenovo=(Lenovo) computer1;
            lenovo.playMusic();


    }
}