package Basics;

public class WrapperExample {
    public static void main(String[] args) {
        // Creating an Integer object
        Integer myInteger = 42;

        // Converting Integer to int
        int intValue = myInteger.intValue();
        // Performing operations on Integer objects
        Integer sum = myInteger + 10;
        Integer difference = myInteger - 5;

        // Converting int to Integer
        Integer newInteger = Integer.valueOf(intValue);

        System.out.println("intValue: " + intValue);
        System.out.println("sum: " + sum);
        System.out.println("difference: " + difference);
        System.out.println("newInteger: " + newInteger);
    }
}