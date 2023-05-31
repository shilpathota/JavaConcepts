package Basics.Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListExample {
	 public static void main(String[] args) {
	        // Create an ArrayList of integers
	        List<Integer> numbers = new ArrayList();
	        // Adding elements to the ArrayList
	        numbers.add(10);
	        numbers.add(20);
	        numbers.add(30);
	        // Accessing elements using index
	        int firstNumber = numbers.get(0);
	        // Updating an element
	        numbers.set(1, 25);
	        // Checking if an element exists
	        boolean contains = numbers.contains(30);
	        // Removing an element
	        numbers.remove(0);
	        // Checking the size of the ArrayList
	        int size = numbers.size();
	        // Checking if the ArrayList is empty
	        boolean isEmpty = numbers.isEmpty();
	        // Sorting the ArrayList
	        Collections.sort(numbers);
	        // Clearing the ArrayList
	        numbers.clear();
	    }
}
