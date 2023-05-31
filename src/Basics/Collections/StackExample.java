package Basics.Collections;
import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        // Pushing elements to the stack
        stack.push("Apple");
        stack.push("Banana");
        stack.push("Cherry");
        // Popping and printing elements from the stack
        while (!stack.isEmpty()) {
            String element = stack.pop();
            System.out.println("Popped element: " + element);
        }
        // Pushing elements to the stack again
        stack.push("Durian");
        stack.push("Elderberry");
        // Peeking at the top element
        String topElement = stack.peek();
        System.out.println("Top element: " + topElement);

        // Checking if the stack is empty
        boolean isEmpty = stack.isEmpty();
        System.out.println("Is stack empty? " + isEmpty);
    }
}