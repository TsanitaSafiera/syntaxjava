package Class12;

public class Hw02 {
    public static void main(String[] args) {
        /*
        Create a String and print it in reverse order (Sunday --> yadnuS)
         */
        String strWord = "Sunday";
        for (int i = strWord.length() - 1; i >= 0; i--) {
            System.out.print(strWord.charAt(i));
        }
    }
}
