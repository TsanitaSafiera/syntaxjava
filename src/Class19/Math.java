package Class19;

public class Math {
    static void add(int num1, int num2){
        System.out.println(num1+num2);
    }
    static void add(int num1, double num2){
        System.out.println(num1+num2);
    }
    static void add(long num1, long num2){
        System.out.println(num1+num2);
    }
    static void add(double num1, int num2){
        System.out.println(num1+num2);
    }
    static void add(double num1, double num2) {
        System.out.println(num1 + num2);
    }
    static void add(double num1, double num2, int num3){
        System.out.println(num1+num2+num3);
    }
    // we must have 1) number of parameters,
    // 2)different data types of parameters
    //3) sequence of data types
    public static void main (String[]args){
        add(10,10);
        add(10,20.5);
        add(2.5,2.5);
        add(1111111111L,333333L);
        add(10.5,20);
    }


}
