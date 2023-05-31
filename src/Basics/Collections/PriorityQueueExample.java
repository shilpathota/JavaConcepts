package Basics.Collections;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueExample {
    public static void main(String[] args) {
        Queue<Integer> queue = new PriorityQueue<>();

        // Adding elements to the queue
        queue.add(30);
        queue.offer(10);
        queue.add(20);

        // Removing and printing elements from the queue
        while (!queue.isEmpty()) {
            int element = queue.poll();
            System.out.println("Removed element: " + element);
        }
    }
}