import java.util.HashMap;

public class Hashmap {
    public void examplehash(String key , int valores) {
        // Create a HashMap
        HashMap<String, Integer> map = new HashMap<>();

        // Add key-value pairs to the HashMap
        map.put("Apple", 10);
        map.put("Banana", 20);
        map.put("Orange", 30);
        map.put(key,valores);


        // Display the HashMap
        System.out.println("HashMap: " + map);

        // Access a value using its key
        int value = map.get("Apple");
        System.out.println("Value for key 'Apple': " + value);

        // Remove a key-value pair
        map.remove("Banana");
        System.out.println("HashMap after removing 'Banana': " + map);

        // Check if a key exists
        boolean hasOrange = map.containsKey("Orange");
        System.out.println("Contains key 'Orange': " + hasOrange);

        // Iterate over the HashMap
        for (String mapKey : map.keySet()) {
            System.out.println("Key: " + mapKey + ", Value: " + map.get(mapKey));
        }
    }
}