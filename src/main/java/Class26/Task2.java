package Class26;

import java.util.TreeMap;

public class Task2 {
    // Create a map of countries with its capital that will store countries in alphabetical order.
    //Print all keys and values from a country map using for each loop.
    //Print all values from a country map using for each loop.

    public static void main(String[] args) {

        TreeMap<String,String> countries= new TreeMap<>();
        countries.put("USA","Washington DC");
        countries.put("Pakistan", "Lahore");
        countries.put("Indonesia", "Jakarta");
        countries.put("Kenya","Nairobi");

        //Set<String> countrySet=countries.keySet();
        for (String s:countries.keySet()) {
            System.out.println(s);

        }
        System.out.println("......................");
        for (String v : countries.values()) {
            System.out.println(v);

        }
        System.out.println("......................");
        // for(Map<String,String> e: countries.entrySet())
        // var keywords is used here instead of typing
        // for(Map<String,String> e: countries.entrySet())
        for(var e:countries.entrySet()){
            System.out.println(e.getKey()+" "+e.getValue());
        }

        /*for(Map.Entry<String, String> c: countries.entrySet()){
            System.out.println(c);
        }
        System.out.println(countries);
        for (String s : countries.keySet()) {
            System.out.println(s);
        }*/
        }
}
