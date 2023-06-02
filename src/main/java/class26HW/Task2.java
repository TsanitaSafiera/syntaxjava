package class26HW;

import java.util.HashMap;
import java.util.Map;

public class Task2 {

    // Create a Map that will store Employee name and salary.
    // Write a logic to retrieve an employee who gets the highest salary.
    // Output should be in the below format
    //John Smith=$100000

    public static void main(String[] args) {
        Map<String, Integer> employee = new HashMap<>();

        employee.put("Vincent Brown", 95000);
        employee.put("Nora Smith", 120000);
        employee.put("Diego Santiago", 100000);

        int highestSalary=0;
        String empWithHighestSal="";

        for (var high :employee.entrySet()){
            String name = high.getKey();
            int salary = high.getValue();

            if ( salary > highestSalary){
                highestSalary=salary;
                empWithHighestSal=name;
            }

        }
        System.out.println("Employee with highest salary "+ empWithHighestSal + " and the salary is "+ highestSalary);


    }
}
