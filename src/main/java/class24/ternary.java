package class24;

import java.util.ArrayList;

public class ternary {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Coke");
        names.add("coffee");
        names.add("Water");
        names.add("juice");

        names.removeIf(x -> x.endsWith("e"));

        /*
          Iterator<String> iterator= names.iterator();
        while (iterator.hasNext()){
            String word=iterator.next();
            if(word.endsWith("e")){
                iterator.remove();
            }
        }
         */
        /*names.replaceAll((X->{
            if(X.contains("a")||X.contains("e")){
                return "Water";
            }else{
                return X;
            }
        }));
        System.out.println(names);


    }

         */
        names.replaceAll((x -> x.contains("a") || x.contains("e") ? "Water" : x));
        System.out.println(names);
    }
}
