package GroupProjectOOP;

public class Task3 {
    public static void main(String[] args) {
        // Count the Number of Words in a String: Write a function to count the
        //number of words in a given string. Words are separated by spaces or
        //punctuation. For example, the input "Hello, world!" should return 2
        String str="Hello, World!";
        String [] strArr1=str.split(" ");
        //String [] strArr=str.split("[.!?]");
        System.out.println(strArr1.length);
    }
}
