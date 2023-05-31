package Basics;

public class DecoratorPattern {
	// Component
	public interface Coffee {
	    double getCost();
	}
	// Concrete Component
	public class SimpleCoffee implements Coffee {
	    @Override
	    public double getCost() {
	        return 1.0;
	    }
	}
	// Decorator
	public abstract class CoffeeDecorator implements Coffee {
	    protected Coffee decoratedCoffee;

	    public CoffeeDecorator(Coffee decoratedCoffee) {
	        this.decoratedCoffee = decoratedCoffee;
	    }
	    public double getCost() {
	        return decoratedCoffee.getCost();
	    }
	}
	// Concrete Decorator
	public class MilkDecorator extends CoffeeDecorator {
	    public MilkDecorator(Coffee decoratedCoffee) {
	        super(decoratedCoffee);
	    }
	    @Override
	    public double getCost() {
	        return super.getCost() + 0.5;
	    }
	}
	// Concrete Decorator
	public class WhippedCreamDecorator extends CoffeeDecorator {
	    public WhippedCreamDecorator(Coffee decoratedCoffee) {
	        super(decoratedCoffee);
	    }
	    @Override
	    public double getCost() {
	        return super.getCost() + 0.7;
	    }
	}


	public static void main(String[] args) {
		// Usage
		Coffee coffee = new SimpleCoffee();
		coffee = new MilkDecorator(coffee);
		coffee = new WhippedCreamDecorator(coffee);
		System.out.println(coffee.getCost()); // Output: 2.2
	}

}
