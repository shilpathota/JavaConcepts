package Basics;
final class Circle extends Shape{
	
}
final class Rectangle extends Shape{
	
}
final class Triangle extends Shape{
	
}
sealed class Shape permits Circle, Rectangle, Triangle {
    // class definition
}
public class SealedClass{
	
}