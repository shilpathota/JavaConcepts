package Basics.Collections;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedListQueueExample {
	    public static void main(String[] args) {
	        Queue<String> queue = new LinkedList<>();

	        // Adding elements to the queue
	        queue.add("Apple");
	        queue.offer("Banana");
	        queue.add("Cherry");

	        // Removing and printing elements from the queue
	        while (!queue.isEmpty()) {
	            String element = queue.poll();
	            System.out.println("Removed element: " + element);
	        }

	        // Checking if the queue is empty
	        boolean isEmpty = queue.isEmpty();
	        System.out.println("Is queue empty? " + isEmpty);
	    }
}
