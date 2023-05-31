package Basics.Collections;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        // Creating a HashMap
        Map<String, Integer> hashMap = new HashMap<>();

        // Adding entries to the HashMap
        hashMap.put("Apple", 10);
        hashMap.put("Banana", 5);
        hashMap.put("Cherry", 8);

        // Retrieving the value for a key
        int appleQuantity = hashMap.get("Apple");
        System.out.println("Apple quantity: " + appleQuantity);

        // Checking if a key exists
        boolean containsBanana = hashMap.containsKey("Banana");
        System.out.println("Contains Banana: " + containsBanana);

        // Removing an entry
        hashMap.remove("Cherry");

        // Iterating over the entries
        for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
            String key = entry.getKey();
            int value = entry.getValue();
            System.out.println(key + ": " + value);
        }

        // Getting the number of entries
        int size = hashMap.size();
        System.out.println("HashMap size: " + size);
    }
}