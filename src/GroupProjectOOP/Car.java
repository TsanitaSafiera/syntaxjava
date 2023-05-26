package GroupProjectOOP;

public  abstract class Car {
    // Create a Class Car that would have the following fields: carPrice and
    //color and method calculateSalePrice() which should be returning a
    //price of the car.
    //Create 2 sub classes: Sedan and Truck. The Truck class has a field
    //as weight and has its own implementation of calculateSalePrice()
    //method in which returned price is calculated as following: if
    //weight>2000 then returned price car should include 10% discount,
    //otherwise 20% discount.
    //The Sedan class has field as length and also does it is own
    //implementation of calculateSalePrice(): if length of sedan is >20 feet
    //then returned car price should include 5% discount, otherwise 10% discount

    double carPrice;
    String color;

    public Car(double carPrice, String color) {
        this.carPrice = carPrice;
        this.color = color;
    }

    abstract double calculateSalePrice();
}

class Truck extends Car{

    double weight;
    public Truck(double carPrice, String color, double weight) {
        super(carPrice,color);
        this.weight = weight;
    }
    @Override
    double calculateSalePrice() {
        if (weight>2000) {
            double price = (carPrice - ((carPrice * 10) / 100));
            System.out.println("The truck price is : " + price);
            return price;
        }else{
            double price = (carPrice - ((carPrice * 20) / 100));
            System.out.println("The truck price is : " + price);
            return price;
        }
    }
}
class Sedan extends Car{

    double length;
    public Sedan(double carPrice, String color, double length) {
        super(carPrice,color);
        this.length = length;
    }
    @Override
    double calculateSalePrice() {
        if (length>20) {
            double price = (carPrice - ((carPrice * 5) / 100));
            System.out.println("The Sedan price is : " + price);
            return price;
        }else{
            double price = (carPrice - ((carPrice * 10) / 100));
            System.out.println("The Sedan price is : " + price);
            return price;
        }
    }

}

class CarTester {
    public static void main(String[] args) {

        Truck truck = new Truck(80000.50, "White", 2000);
        Sedan sedan = new Sedan(30000.50, "yellow", 10);

        truck.calculateSalePrice();
        sedan.calculateSalePrice();
    }
}
