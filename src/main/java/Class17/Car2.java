package Class17;

public class Car2 {
    String make;
    String model;
    int engineCC;
    String color;

    Car2(String make, String model,int engineCC, String color){
        this.make=make;
        this.model =model;
        this.engineCC =engineCC;
        this.color =color;
    }
    void printInfo(){
        System.out.println(make+" "+model+" "+engineCC+" "+color);
    }

    public static void main(String[] args) {
        Car2 car=new Car2("Honda","Civic type R", 1800, "White");
        car.printInfo();
    }
}

