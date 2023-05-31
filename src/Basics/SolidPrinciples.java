package Basics;

public class SolidPrinciples {
	public class VehiclePrintDetails{
		
	}
	public class VehicleCalculateValue{
		
	}
	public class VehicleDatatoDB{
		
	}
	public class Vehicle{
		public static double getValue() {
			return 1.0;
		}
		double calculateValue() {
			return 0.0;
		}
	}
	public class Car extends Vehicle{
		@Override
		double calculateValue() {
			return Vehicle.getValue()*0.8;
		}
	}
	public class Truck extends Vehicle{
		@Override
		double calculateValue() {
			return Vehicle.getValue()*0.9;
		}
	}
//	public class Vehicle{
//		public void printDetails() {}
//		public double calculateValue() {
//			return 0;}
//		public void addVehicleToDB() {}
//		int getValue() {
//			return 2;
//		}
//	}
//	class Car extends Vehicle{
//
//	}
//	class Bike extends Vehicle{
//
//	}
//	public class VehicleCalculations {
//	    public double calculateValue(Vehicle v) {
//	        if (v instanceof Car) {
//	            return v.getValue() * 0.8;
//	        if (v instanceof Bike) {
//	            return v.getValue() * 0.5;
//
//	    }
//	}
	class Bird {
	    public void fly() {
	        // Fly implementation for a generic bird
	    }
	}

	class Penguin extends Bird {
	    // Penguins cannot fly, so fly() method is not applicable
	    // This violates the Liskov Substitution Principle
	}

	public class LSPExample {
	    public static void main(String[] args) {
	        Bird bird = new Penguin();
	        bird.fly(); 
	        // Penguins cannot fly, but the code expects them to
	    }
	}
	abstract class Bird {
	    public abstract void fly();
	}

	class Eagle extends Bird {
	    @Override
	    public void fly() {
	        // Fly implementation for an eagle
	    }
	}

	class Penguin extends Bird {
	    @Override
	    public void fly() {
	        // Penguins cannot fly, so fly() method is not implemented
	    }
	}

	public class LSPExample {
	    public static void main(String[] args) {
	        Bird eagle = new Eagle();
	        eagle.fly(); // Performs the fly() implementation for an eagle

	        Bird penguin = new Penguin();
	        penguin.fly(); // Penguins do not fly, so no action is taken
	    }
	}

}
