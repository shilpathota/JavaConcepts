package Basics.Collections;

import java.util.LinkedList;

public class LinkedListExample {
	public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        // Inserting elements at the beginning
        linkedList.addFirst("Apple");
        linkedList.addFirst("Banana");
        // Inserting elements at the end
        linkedList.addLast("Cherry");
        linkedList.addLast("Durian");
        // Inserting an element at a specific position
        linkedList.add(2, "Grape");
        // Removing an element from the beginning
        linkedList.removeFirst();
        // Removing an element from the end
        linkedList.removeLast();
        // Removing an element from a specific position
        linkedList.remove(1);
        // Searching for an element
        boolean containsDurian = linkedList.contains("Durian");
        // Get an element by index
        String elementAtIndex = linkedList.get(2);
        // Find the index of an element
        int index = linkedList.indexOf("Cherry");
        
        System.out.println("LinkedList contains 'Durian': " + containsDurian);
        System.out.println("LinkedList after inserting at the beginning: " + linkedList);
        System.out.println("LinkedList after removing from position 1: " + linkedList);
        System.out.println("LinkedList after removing from the end: " + linkedList);
        System.out.println("LinkedList after removing from the beginning: " + linkedList);
        System.out.println("LinkedList after inserting at position 2: " + linkedList);
        System.out.println("LinkedList after inserting at the end: " + linkedList);
        System.out.println("Element at index 2: " + elementAtIndex);
        System.out.println("Index of 'Cherry': " + index);




    }
}

