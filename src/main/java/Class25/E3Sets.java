package Class25;

import java.util.ArrayList;
import java.util.HashSet;

public class E3Sets {
    public static void main(String[] args) {
        ArrayList<String> names=new ArrayList<>();
        names.add("farwa");
        names.add("farwa");
        System.out.println(names);

        // HasSet does not allow duplication
        //hasSet also doesn't remember the insertion order
        HashSet<String> uniqNames=new HashSet<>();
        uniqNames.add("AA");
        uniqNames.add("BB");
        uniqNames.add("AA");
        // there is no get method in sets uniqNames.get();
        // we can't use indexes to get the value, so we can't use for loops
        // but we can use enhanced for loop
        System.out.println(uniqNames);
        for(String name:uniqNames){
            System.out.println(name);
        }

    }
}
