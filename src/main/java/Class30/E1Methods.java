package Class30;

public class E1Methods {
    /*
    write code to print hello world 3 times
    hello java 3 times
    hello batch16 3 times
     */

    public static void main(String[] args) {
        /*for (int i = 0; i < 3 ; i++) {
            System.out.println("Hello world");

        }

        for (int i = 0; i < 3 ; i++) {
            System.out.println("hello java");

        }
        for (int i = 0; i < 3 ; i++) {
            System.out.println("Hello batch16");
        }*/

        printWord("Hello World");
        printWord("Hello Java");
        printWord("Hello Batch16");
    }

    static void printWord(String word) {
        for (int i = 0; i < 3; i++) {
            System.out.println(word);
        }
    }
}
