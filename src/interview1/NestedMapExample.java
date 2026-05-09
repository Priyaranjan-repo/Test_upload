package interview1;
import java.util.HashMap;
import java.util.Map;

public class NestedMapExample {

    public static Map<String,Map<String, Integer>> getDepartmentEmployeeData() {
        // Outer map: Department -> (Employee Name -> Age)
        Map<String, Map<String, Integer>> departmentMap = new HashMap<>();

        // HR Department employees
        Map<String, Integer> hrEmployees = new HashMap<>();
        hrEmployees.put("Alice", 30);
        hrEmployees.put("Bob", 28);

        // IT Department employees
        Map<String, Integer> itEmployees = new HashMap<>();
        itEmployees.put("Charlie", 25);
        itEmployees.put("David", 32);

        // Add inner maps to the outer map
        departmentMap.put("HR", hrEmployees);
        departmentMap.put("IT", itEmployees);

        return departmentMap;
    }

    public static void main(String[] args) {
        Map<String, Map<String, Integer>> data = getDepartmentEmployeeData();

        // Print the nested map
        for (String department : data.keySet()) {
            System.out.println("Department: " + department);
            Map<String, Integer> employees = data.get(department);
            for (String name : employees.keySet()) {
                System.out.println("  Name: " + name + ", Age: " + employees.get(name));
            }
        }
    }
}
