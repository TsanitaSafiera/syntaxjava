package Class18;

public class VehicleTester {
    // CabnFly:
    //    create 3 classes Audi BMW and Honda create 4
    //    fields and two methods in each class.

    public static void main(String[] args) {
        Honda honda=new Honda();
        BMW bmw=new BMW();
        Audy audy=new Audy();

        honda.start();
        bmw.stop();
        audy.start();
    }
}
