package Basics.Collections;

import java.util.ArrayDeque;
import java.util.Queue;

public class ArrayDequeExample {
    public static void main(String[] args) {
        Queue<Integer> queue = new ArrayDeque<>();

        // Adding elements to the queue
        queue.add(10);
        queue.offer(20);
        queue.add(30);

        // Accessing the front element of the queue
        int frontElement = queue.peek();
        System.out.println("Front element: " + frontElement);

        // Removing and printing elements from the queue
        while (!queue.isEmpty()) {
            int element = queue.poll();
            System.out.println("Removed element: " + element);
        }
    }
}
