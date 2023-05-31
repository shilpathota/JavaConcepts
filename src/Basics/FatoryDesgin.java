package Basics;

public class FatoryDesgin {
	// Abstract Product
	interface Product {
	    void doSomething();
	}

	// Concrete Products
	class ConcreteProduct1 implements Product {
	    @Override
	    public void doSomething() {
	        System.out.println("Doing something in ConcreteProduct1");
	    }
	}

	class ConcreteProduct2 implements Product {
	    @Override
	    public void doSomething() {
	        System.out.println("Doing something in ConcreteProduct2");
	    }
	}

	// Factory
	class ProductFactory {
	    public Product createProduct(String type) {
	        if (type.equals("Type1")) {
	            return new ConcreteProduct1();
	        } else if (type.equals("Type2")) {
	            return new ConcreteProduct2();
	        } else {
	            throw new IllegalArgumentException("Invalid product type: " + type);
	        }
	    }
	}
}
