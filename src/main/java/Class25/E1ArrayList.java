package Class25;



import java.util.ArrayList;

public class E1ArrayList {
    public static void main(String[] args) {
        /*
        ArrayList=> a class (its part of the collection's framework)
        <> these are called anle brackets of diamond operators we write
        the name of the class whose objects we are planning to store in
        arraylist
         */
        // // Creating object of car class and storing it in a variable car1
        Car car1=new Car("Toyota", "Prius");
        Car car2=new Car("Honda", "Civic");
        Car car3=new Car("BMW", "17");
        ArrayList<Car> arrayList= new ArrayList<>();
        // Creating object of car class and storing it in arraylist
        arrayList.add(car1);
        arrayList.add(car2);
        arrayList.add(car3);

        for(Car c:arrayList){
            c.printInfo();
        }



    }
}
class Car{
    String make;
    String model;

    public Car(String make, String model) {
        this.make = make;
        this.model = model;
    }
    void printInfo() {
        System.out.println(make + " " + model);
    }

}