package Basics.Collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetExample {
    public static void main(String[] args) {
        // Creating a HashSet
        Set<String> hashSet = new HashSet<>();
        // Adding elements to the HashSet
        hashSet.add("Apple");
        hashSet.add("Banana");
        hashSet.add("Cherry");
     // Check if an element exists in the HashSet
        boolean containsApple = hashSet.contains("Apple");
        System.out.println("HashSet contains Apple: " + containsApple);
        // Remove an element from the HashSet
        boolean removedBanana = hashSet.remove("Banana");
        System.out.println("Removed Banana from HashSet: " + removedBanana);
        // Iterate over the elements of the HashSet
        System.out.println("HashSet elements:");
        for (String element : hashSet) {
            System.out.println(element);
        }
        // Creating a LinkedHashSet
        Set<String> linkedHashSet = new LinkedHashSet<>();
        // Adding elements to the LinkedHashSet
        linkedHashSet.add("Apple");
        linkedHashSet.add("Banana");
        linkedHashSet.add("Cherry");
        // Check if an element exists in the LinkedHashSet
        boolean containsMango = linkedHashSet.contains("Mango");
        System.out.println("LinkedHashSet contains Mango: " + containsMango);
        // Remove all elements from the LinkedHashSet
        linkedHashSet.clear();
        System.out.println("LinkedHashSet is empty: " + linkedHashSet.isEmpty());
    }
}



