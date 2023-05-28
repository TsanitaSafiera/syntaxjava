package class16;

public class Replit125 {
    // Declare a static variable **number** that will hold an integer value:
    //Access **number** from the main method and assign value to it
    //Create an Object of the class, access **number** in a nonstatic way and assing value of 200.
    //Print out **number** using class name and using instance
    //**Expected Output**
    //200
    //200

    static int num;
    void print(){
        System.out.println(num);
    }


    public static void main (String [] args){
        Replit125 obj=new Replit125();
        Replit125.num=200;
        System.out.println(Replit125.num);

        int result=Replit125.num;
        System.out.println(result);


    }

}