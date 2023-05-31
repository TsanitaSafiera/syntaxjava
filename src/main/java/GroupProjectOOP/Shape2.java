package GroupProjectOOP;

public interface Shape2 {
     /* Create an Interface 'Shape' with undefined methods as calculateArea and calculatePerimeter.
    Create 2 classes Circle & Square that implements functionality defined in the Shape Interface.
    Test your code.
     */

    void calculateArea();
    void calculatePerimeter();
}
class Circle2 implements Shape2 {
    double area=3.142;
    int radius=6;
    @Override
    public void calculateArea() {
        System.out.println("Area of Circle: "+area*radius*radius);
    }

    @Override
    public void calculatePerimeter() {
        System.out.println("Perimeter of Circle: "+2*Math.PI*radius);
    }
}
class Square2 implements Shape2 {
    double length = 2.6;
    double width = 4.8;

    @Override
    public void calculateArea() {
        System.out.println("Area of Square: " + length * width);
    }

    @Override
    public void calculatePerimeter() {
        System.out.println("Perimeter of Square: " + 4 * length * width);
    }

    public static void main(String[] args) {
        Circle2 circle=new Circle2();
        circle.calculateArea();
        circle.calculatePerimeter();

        Square2 square=new Square2();
        square.calculateArea();
        square.calculatePerimeter();

    }

}
