package class26HW;

import java.util.ArrayList;

public class Task4 {
    public static void main(String[] args) {
        // Create a collection of integers in which you can keep duplicates.
        //Write a logic to find sum of all integers

            ArrayList<Integer> numbers=new ArrayList<>();
            numbers.add(10);
            numbers.add(20);
            numbers.add(100);
            numbers.add(100);

        int sum=0;
            for (Integer num:numbers) {
               sum = sum+num;

            }
        System.out.println(sum);
    }

}
