import java.util.HashMap;
import java.util.Map;
import.java.util.Collection;

public class MapBasics {
    public static void main(String[] args) {
        
        System.out.println("=== Task 1: Map Initialization and Basic Operations ===");

        Map<String, Integer> fruitStock = new HashMap<>();
        fruitStock.put("Apple", 1);
        fruitStock.put("Orange", 2);
        fruitStock.put("Banana", 3);
        fruitStock.put("Grape", 4);
        
        
        System.out.println("Initial Map: " + fruitStock);
        System.out.println();
        
        
        System.out.println("=== Task 2: Exploring Map Functions ===");
        
        
        System.out.println("Map size: " + fruitStock.size());
        System.out.println("Is the map empty? " + fruitStock.isEmpty());
        String keyToCheck = "Apple";
        System.out.println("Does the map contain key '" + keyToCheck + "'? " + fruitStock.containsKey(keyToCheck));
        Integer valueToCheck = 2;
        System.out.println("Does the map contain value " + valueToCheck + "? " + fruitStock.containsValue(valueToCheck));
        System.out.println();
        
        
        System.out.println("=== Task 3: Modification of a Map ===");

        fruitStock.put("Banana", 5);
        System.out.println("Updated 'Banana' stock quantity to 5");
        fruitStock.put("Mango", 6);
        System.out.println("Added 'Mango' with stock quantity 6");
        fruitStock.remove("Grape");
        System.out.println("Removed 'Grape' entry");

        System.out.println("Updated Map: " + fruitStock);
        System.out.println("Current map size: " + fruitStock.size());
        System.out.println();
        
        
        System.out.println("=== Task 4: Iteration Over a Map ===");

        System.out.println("Iteration using keySet():");
        for (String key : fruitStock.keySet()) {
            Integer value = fruitStock.get(key);
            System.out.println("  " + key + " => " + value);
        }
        System.out.println();
        System.out.println("Iteration using entrySet():");
        for (Map.Entry<String, Integer> entry : fruitStock.entrySet()) {
            System.out.println("  " + entry.getKey() + " => " + entry.getValue());
        }
        System.out.println();
        
        System.out.println("Comparison of iteration methods:");
        System.out.println("  - keySet() iterates only over keys and requires get() to retrieve values");
        System.out.println("  - entrySet() provides both key and value directly, more efficient for accessing both");
        System.out.println();
        
        
        System.out.println("=== Task 5: Working with Map Values ===");
        
        Collection<Integer> values = fruitStock.values();
        System.out.println("Collection of map values: " + values);
        
        Integer numberToFind = 3;
        boolean containsNumber = values.contains(numberToFind);
        System.out.println("Does the collection of values contain " + numberToFind + "? " + containsNumber);
        System.out.println();
    }
}
