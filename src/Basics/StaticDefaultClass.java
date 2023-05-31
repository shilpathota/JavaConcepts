package Basics;


	interface MyInterface {
	    default void defaultMethod() {
	        System.out.println("Default method implementation");
	    }
	  
	    static void staticMethod() {
	        System.out.println("Static method implementation");
	    }
	}

	class MyClass2 implements MyInterface {
	    // Override the default method if needed
	    @Override
	    public void defaultMethod() {
	        System.out.println("Custom implementation of default method");
	    }
	    public void staticMethod() {
	    	//method hiding
	    	System.out.println("Static method of myclass2");
	    }
	}

	public class StaticDefaultClass {
	    public static void main(String[] args) {
	        MyClass2 obj = new MyClass2();
	        obj.defaultMethod(); // Custom implementation of default method
	        obj.staticMethod();//Static method of myclass2
	        MyInterface.staticMethod(); // Static method implementation
	    }
	}
