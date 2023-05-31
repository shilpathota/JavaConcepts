package Basics;

public class Singleton {
	    private static Singleton instance;
// Private constructor to prevent instantiation from outside the class
	    private Singleton() {
	        // Initialization code
	    }
	    // Public static method to get the instance
	    public static Singleton getInstance() {
	        if (instance == null) {
	            // Create a new instance if it doesn't exist
	            instance = new Singleton();
	        }
	        return instance;
	    }
}
