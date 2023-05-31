package Basics;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@interface MyAnnotation {
    String value();
    int count() default 1;
}
@MyAnnotation(value = "Hello", count = 5)
class MyClass {
    @MyAnnotation("World")
    public void myMethod() {
        // Method implementation
    }
}
public class AnnotationExample {
    public static void main(String[] args) throws Exception {
        Class<MyClass> myClass = MyClass.class;
        // Check if class is annotated
        if (myClass.isAnnotationPresent(MyAnnotation.class)) {
            MyAnnotation classAnnotation = myClass.getAnnotation(MyAnnotation.class);
            System.out.println("Class Annotation Value: " + classAnnotation.value());
            System.out.println("Class Annotation Count: " + classAnnotation.count());
        }

        // Check if method is annotated
        Method method = myClass.getDeclaredMethod("myMethod");
        if (method.isAnnotationPresent(MyAnnotation.class)) {
            MyAnnotation methodAnnotation = method.getAnnotation(MyAnnotation.class);
            System.out.println("Method Annotation Value: " + methodAnnotation.value());
            System.out.println("Method Annotation Count: " + methodAnnotation.count());
        }
    }
}


