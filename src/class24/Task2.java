package class24;

import java.util.ArrayList;

public class Task2 {
    public static void main(String[] args) {
        // Create an arrayList of names. Remove every word that ends with “e”.

        ArrayList<String> names = new ArrayList<>();
        names.add("Paste");
        names.add("Copy");
        names.add("Coffee");
        names.add("Tea");

        names.removeIf(X -> X.endsWith("e"));

        /*for(String word:names){  // this enhanced loop will never work
            if(word.endsWith("e")){
                names.remove(word);
            }
        }
*/
        /*for (int i = 0; i <names.size(); i++) { // its not safe to use loop

            String word= names.get(i);
            if(word.endsWith("e")){
                names.remove(i);
                i--; // to adjust the index number after removal because
                // the size is changing after removal
            }
        }
        System.out.println(names);
        }

         */

        /*Iterator<String> iterator=names.iterator();
        while(iterator.hasNext()){
            String word=iterator.next();
                if(word.endsWith(("e"))){
                iterator.remove();
            }
        }

         */

        System.out.println(names);



    }
}
