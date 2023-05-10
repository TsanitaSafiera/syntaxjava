package Class19HW;
public class CalculateArea {
    // Create 1 class in which create a methods that will calculate the
    // area of Method name must be called calculateArea
    //Rectangle
    //Square
    //Use separate class to test your code
    int width;
    int length;

    public CalculateArea(int width, int length) {
        this.width = width;
        this.length = length;
    }

    void print() {
        if (length == width) {
            System.out.println("Square : " + width * length);
        } else {
            System.out.println("Rectangle : " + width * length);
        }


    }
}
class CalculateAreaTester {
    public static void main(String[] args) {

        CalculateArea obj1 = new CalculateArea(2, 4);
        CalculateArea obj2 = new CalculateArea(2,2);
        obj1.print();
        obj2.print();

    }
}

