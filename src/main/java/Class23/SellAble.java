package Class23;

public interface SellAble {

    // fields only allowed public static final
    int PRICE = 12000;

    // methods are only public abstract by default
    // -------------------------------------------------
    // static method allowed because you can just directly call the class without
    // creating an object
    static void sell(){
        System.out.println("Allowed");
    }
}
class Tester1{
    public static void main(String[] args) {
        SellAble.sell();
    }
}
