package Class25;

import java.util.TreeSet;

public class E5Sets {

    public static void main(String[] args) {
        // no duplication but it will short based on
        // the first character in alphabetical(ASCII) order,
        // and for number sorted in natural order (123 so on)
        TreeSet<String> fruit = new TreeSet<>();
        fruit.add("Mango");
        fruit.add("Apple");
        fruit.add("Orange");
        fruit.add("Kiwi");
        fruit.add("Banana");
        fruit.add("Banana");
        System.out.println(fruit);

        /*
        fruit.add("8");
        fruit.add("6");
        fruit.add("3");
        fruit.add("2");
        fruit.add("3");
        fruit.add("9");
         */

    }
}
