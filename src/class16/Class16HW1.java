package class16;

public class Class16HW1 {

    // Create a method that will take a String as a
    // parameter and returns reversed String. Method should be available
    // to all classes within your project and accessible by class name

    public String sentence (String word){
        String reversed="";
        for (int i = word.length()-1; i >= 0; i--) {
            reversed=reversed+word.charAt(i);
        }
        return reversed;
    }

    public static void main(String[] args) {
        Class16HW1 obj=new Class16HW1();
        String result= obj.sentence("lets go shopping");
        System.out.println(result);
    }
}
