package Class26;

import java.util.HashMap;
import java.util.Map;

public class Task1 {
    // Create a map of a building. Store floor number and its associated company name. (Example: 1= Google, 2=Syntax etc..). Insert 7 entries with duplicate keys and values.
    //Check how many entries you have?
    //Update company on a 4th floor
    //Remove company on the 7th floor
    //Print your map
    public static void main(String[] args) {
        Map<Integer, String> building = new HashMap<>();

        building.put(1,"google");
        building.put(2,"Syntax");
        building.put(3,"Amazon");
        building.put(4,"Best buy");
        building.put(5,"Target");
        building.put(6,"Target");
        building.put(7,"Walmart");

        System.out.println(building.size());
        building.replace(4, "Facebook");
        building.remove(7);
        System.out.println(building);


    }
}
