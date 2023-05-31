package Basics;

//Abstract class example
abstract class Shape {
 protected String color;
 public Shape(String color) {
     this.color = color;
 }
 public abstract double getArea();

 public void display() {
     System.out.println("This is a " + color + " shape.");
 }
}
//Concrete subclass of Shape
class Circle extends Shape {
 private double radius;

 public Circle(String color, double radius) {
     super(color);
     this.radius = radius;
 }
 @Override
 public double getArea() {
     return Math.PI * radius * radius;
 }
}
//Concrete subclass of Shape
class Rectangle extends Shape {
 private double length;
 private double width;

 public Rectangle(String color, double length, double width) {
     super(color);
     this.length = length;
     this.width = width;
 }

 @Override
 public double getArea() {
     return length * width;
 }
}

public class AbstractClassExample {
 public static void main(String[] args) {
     Shape circle = new Circle("Red", 5.0);
     System.out.println("Area of Circle: " + circle.getArea());
     circle.display();

     Shape rectangle = new Rectangle("Blue", 3.0, 4.0);
     System.out.println("Area of Rectangle: " + rectangle.getArea());
     rectangle.display();
 }
}
