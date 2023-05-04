package class16;

public class Class16HW2 {
    // Create a method that will accept a String as a parameter and
    // return a new String that consist only of vowels.
    // Method should be available inside the class only
    // where it was declared and executed by calling it is name

    private String str(String word){
        System.out.println(word);
        return word;
    }

    public static void main(String[]args){
        Class16HW2 obj=new Class16HW2();
        String word="i want to go home";
        obj.str(word.replaceAll("[^aiueo]",""));



    }



}
