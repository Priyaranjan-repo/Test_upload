package Interview;
import java.util.*;




public class FruitMapExample {
	
	
    public static void main(String[] args) {
        // Create a Map with key as String and value as List of Strings
        
    	Map<String, List<String>> fruitMap = new LinkedHashMap<>();

     
      fruitMap.put("fruit", new ArrayList<>());
        
        fruitMap.get("fruit").add("apple");
        fruitMap.get("fruit").add("mango");
        fruitMap.get("fruit").add("orange");
        fruitMap.get("fruit").add("Banana");

        // Print all values for the key "fruit"
        System.out.println("Fruits:");
       
        for (String frt : fruitMap.get("fruit")) {
            System.out.println(frt);
        }
    }
}
