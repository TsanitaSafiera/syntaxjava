package class16;

public class Class16HW2 {
    // Create a method that will accept a String as a parameter and
    // return a new String that consist only of vowels.
    // Method should be available inside the class only
    // where it was declared and executed by calling it is name

    private String str(String word){
        return word.replaceAll("[^aiueo]","");
    }

    public static void main(String[]args){
        Class16HW2 obj=new Class16HW2();
        System.out.println(obj.str("i want to go home"));



    }



}
