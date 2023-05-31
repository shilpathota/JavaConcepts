package Basics;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class ReflectionExample {
    public static void main(String[] args) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
        Class<Student> studentClass = Student.class;
        // Get class name
        String className = studentClass.getName();
        // Get class modifiers
        int modifiers = studentClass.getModifiers();
        // Get declared methods
        Method[] methods = studentClass.getDeclaredMethods();
        for (Method method : methods) {
            System.out.println("Method: " + method.getName());
        }
        // Get declared fields
        Field[] fields = studentClass.getDeclaredFields();
        for (Field field : fields) {
            System.out.println("Field: " + field.getName());
        }
        Class<Calculator> calculatorClass = Calculator.class;
        Calculator calculator = calculatorClass.getDeclaredConstructor().newInstance();
        // Invoke a public method
        Method addMethod = calculatorClass.getDeclaredMethod("add", int.class, int.class);
        int result = (int) addMethod.invoke(calculator, 5, 3);
        // Invoke a private method
        Method multiplyMethod = calculatorClass.getDeclaredMethod("multiply", int.class, int.class);
        multiplyMethod.setAccessible(true);
        int product = (int) multiplyMethod.invoke(calculator, 4, 2);
        
        System.out.println("Multiplication Result: " + product);
        System.out.println("Class Name: " + className);
        System.out.println("Modifiers: " + Modifier.toString(modifiers));
        System.out.println("Addition Result: " + result);



    }
}

class Student {
    private String name;
    public int age;

    public void study() {
        System.out.println("Student is studying.");
    }

    private void sleep() {
        System.out.println("Student is sleeping.");
    }
}

class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    private int multiply(int a, int b) {
        return a * b;
    }
}


