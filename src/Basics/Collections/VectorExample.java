package Basics.Collections;

import java.util.Vector;

public class VectorExample {
    public static void main(String[] args) {
        Vector<String> vector = new Vector<>();
        // Adding elements
        vector.add("Apple");
        vector.addElement("Banana");
        vector.add("Cherry");
        vector.addElement("Durian");
        // Accessing elements
        String firstElement = vector.firstElement();
        String lastElement = vector.lastElement();
        // Inserting elements
        vector.insertElementAt("Grape", 2);
        vector.setElementAt("Kiwi", 1);
        // Removing elements
        vector.remove("Cherry");
        vector.removeElementAt(0);
        // Checking if vector is empty
        boolean isEmpty = vector.isEmpty();
        // Searching for an element
        int index = vector.indexOf("Durian");
        // Getting size and capacity
        int size = vector.size();
        int capacity = vector.capacity();
        // Iterating over elements
        System.out.println("Elements in the vector:");
        for (String element : vector) {
            System.out.println(element);
        }
        
        System.out.println("First element: " + firstElement);
        System.out.println("Last element: " + lastElement);
        System.out.println("Size of vector: " + size);
        System.out.println("Capacity of vector: " + capacity);
        System.out.println("Index of 'Durian': " + index);
        System.out.println("Is vector empty? " + isEmpty);
        System.out.println("Vector after removing elements: " + vector);
        System.out.println("Vector after inserting elements: " + vector);




    }
}