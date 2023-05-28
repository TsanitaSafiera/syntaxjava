package Class25;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.util.Collection;
import java.util.TreeMap;

public class E11Maps {
    public static void main(String[] args) {

        TreeMap<String, Double> makeup= new TreeMap<>();
        makeup.put("Lipstick",100.00);
        makeup.put("BlushOn",68.00);
        makeup.put("Eyeliner",80.00);
        makeup.put("Foundation",120.00);
        makeup.put("Base",25.00);

        Collection<Double> values =makeup.values();
        values.removeIf(v -> v>80);
        System.out.println(makeup);

        XSSFWorkbook xssfWorkbook;

    }
}
