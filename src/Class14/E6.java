package Class14;

public class E6 {
    // create a method which returns true or false and takes an int
    // number as a parameter if number is
    // even it return true otherwise it returns false call the method isEven

    boolean isEven(int num) {

        //boolean isTrue = false;

        //if (num % 2 == 0) {
         //   isTrue = true;

        //}
        //return isTrue;
        return num%2==0;

    }

    public static void main(String[] args) {
        E6 obj=new E6();
        System.out.println(obj.isEven(15));

    }
}
