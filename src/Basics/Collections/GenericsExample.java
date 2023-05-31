package Basics.Collections;

//Generic class example
class Box<T> {
 private T value;

 public void setValue(T value) {
     this.value = value;
 }
 public T getValue() {
     return value;
 }
}

//Generic method example
class Utility {
 public static <T> void printArray(T[] array) {
     for (T element : array) {
         System.out.println(element);
     }
 }
}

public class GenericsExample {
 public static void main(String[] args) {
     // Generic class usage
     Box<Integer> integerBox = new Box<>();
     integerBox.setValue(10);
     int value = integerBox.getValue();
     System.out.println("Value: " + value);

     Box<String> stringBox = new Box<>();
     stringBox.setValue("Hello, Generics!");
     String message = stringBox.getValue();
     System.out.println("Message: " + message);

     // Generic method usage
     Integer[] numbers = { 1, 2, 3, 4, 5 };
     Utility.printArray(numbers);

     String[] names = { "Alice", "Bob", "Charlie" };
     Utility.printArray(names);
 }
}