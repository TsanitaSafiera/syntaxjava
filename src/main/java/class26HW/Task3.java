package class26HW;

import java.util.TreeSet;

public class Task3 {

    // Create the collection that will store single uniques Objects
    // of a String type in which order is preserved.
    //Write a logic to concatenate all string from the collection.

    public static void main(String[] args) {
        TreeSet<String> sentence = new TreeSet<>();
        sentence.add("I");
        sentence.add("Love");
        sentence.add("Monday");

        for (var sentences : sentence)
        System.out.print(sentences+" ");
    }

}
