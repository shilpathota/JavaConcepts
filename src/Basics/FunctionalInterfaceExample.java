package Basics;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class FunctionalInterfaceExample {
	Predicate<Integer> isEven = num -> num % 2 == 0;
	boolean result = isEven.test(6); // true
	
	Consumer<String> printUpperCase = str -> System.out.println(str.toUpperCase());
	printUpperCase.accept("hello"); // prints "HELLO"
	
	Function<Integer, String> intToString = num -> String.valueOf(num);
	String result2 = intToString.apply(10); // "10"
	
	Supplier<Double> getRandomNumber = () -> Math.random();
	double number = getRandomNumber.get();
	
	UnaryOperator<Integer> square = num -> num * num;
	int result3 = square.apply(5); // 25
	
	BiFunction<Integer, Integer, Integer> sum = (a, b) -> a + b;
	int result4 = sum.apply(3, 4); // 7
}
