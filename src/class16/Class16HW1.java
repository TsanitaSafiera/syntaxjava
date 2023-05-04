package class16;

public class Class16HW1 {

    // Create a method that will take a String as a
    // parameter and returns reversed String. Method should be available
    // to all classes within your project and accessible by class name
    StringBuilder str(StringBuilder word){

        System.out.println(word);
        return word;
    }

    public static void main(String[]args){
        Class16HW1 obj=new Class16HW1();
        String word="test";
        StringBuilder word1=new StringBuilder(word);

        obj.str(word1.reverse());
    }


}
