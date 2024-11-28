import java.lang.*;
import java.util.*;

class Parent {

    public void show() {
        System.out.println("Parent's show()");
    }
}

class Child extends Parent {
    
    @Override
    public void show() {
        System.out.println("Child's show()");
    }
}

public class Overriding1 {
    public static void main(String[] args) {
        // Create an object of the Parent class and call the show method
        Parent obj1 = new Parent();
        obj1.show(); // Expected output: Parent's show()

        // Create an object of the Child class and call the show method
        Parent obj2 = new Child();
        obj2.show(); // Expected output: Child's show()
    }
}
