package Class18;

public class TV {

    // private members of the superclass can't be inherited
    // default members can't be accessed from another package
    private int size;
    protected String make;
    String model;

}

class SamsungTV extends TV{

}

class TVTester{
    public static void main(String[] args) {
        SamsungTV sm=new SamsungTV();
    }
}