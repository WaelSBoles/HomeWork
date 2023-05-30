package Class26;

import java.util.HashMap;
import java.util.Map;
/*2)Create a Map that will store Employee name and salary.
Write a logic to retrieve an employee who gets the highest salary. Output should be in the below format
John Smith=$100000*/

public class Task2 {
    public static void main(String[] args) {
        Map<String,Double> employee=new HashMap<>();
        employee.put("Mike Alan",20358.2);
        employee.put("Thomas James",56834.2);
        employee.put("John Smith ",100000.00);
        employee.put("Adam Elija",53569.3);
        employee.values().removeIf(x->x<100000.00);
        System.out.println(employee);

    }
}
