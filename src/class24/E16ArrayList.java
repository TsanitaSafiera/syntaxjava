package class24;

import java.util.LinkedList;
import java.util.List;

public class E16ArrayList {
    public static void main(String[] args) {

        long start = System.currentTimeMillis();
        List<Integer> numbers = new LinkedList<>();
        for (int i = 0; i < 1000000; i++) {
            numbers.add(0,i);
        }
        long end = System.currentTimeMillis();
        System.out.println(end - start);

        /*
        methods from the arrayList class
        do not use Iterators use removeif();

        ArrayList:
        if in your code 80% of the times you use get method 20% add(index,
        element), remove.
        LinkedList
        if 70-80% you use remove method or adding the data in-between you
        should use linkedlist

         */
    }
}
