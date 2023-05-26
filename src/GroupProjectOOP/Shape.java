package GroupProjectOOP;

public interface Shape {
    //Create an Interface 'Shape' with undefined methods as calculateArea
    //and calculate Parameter. Create 2 classes Circle & Square that
    //implements functionality defined in the Shape Interface. Test your
    //code.

    void calculateArea();
    void calculateParameter();

}
class Circle implements Shape{

    public void calculateArea(){
        System.out.println("Circle Area");
    }
    public void calculateParameter(){
        System.out.println("Circle Parameter");
    }

}
class Square implements Shape {

    public void calculateArea(){
        System.out.println("Square Area");
    }
    public void calculateParameter(){
        System.out.println("Square Parameter");
    }
}

class ShapeTester {
    public static void main(String[] args) {
        Circle circle= new Circle();
        circle.calculateArea();
        circle.calculateParameter();

        Square square=new Square();
        square.calculateArea();
        square.calculateParameter();


    }
}
