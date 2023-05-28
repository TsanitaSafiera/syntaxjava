package class24;

import java.util.ArrayList;

public class E12ArrayList {
    public static void main(String[] args) {
        // Create an arrayList of drinks. If any drink has letter
        // “a” or “e” replace it with water.

        ArrayList<String> drinks = new ArrayList<>();
        drinks.add("coke");
        drinks.add("sodas");
        drinks.add("Coffee");
        drinks.add("Tea");

        for (int i = 0; i < drinks.size(); i++) {

            String word=drinks.get(i);
            if(word.contains("e")|| word.contains("a")){
                drinks.set(i,"Water");
                // drinks.replaceAll(a -> a.contains("a") || a.contains("e")? "water" :a);
            }

        }
        System.out.println(drinks);



    }
}