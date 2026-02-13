package exam_10Feb2026;
/*
Method Overriding Demo
Write a program to demonstrate method overriding
by creating parent and child classes with the same method signature.

Input: Parent and Child objects calling display() method
Output: Parent class display method Child class display method

Explanation:Method overriding allows a subclass to provide a specific
implementation of a method defined in its parent class.
 */
class Parent{
    void display()
    {
        System.out.println("Parent class display method");
    }
}
class Child extends Parent{
    @Override
    void display() {
        super.display();
        System.out.println("Child class display method");
    }
}
public class Ch12 {
    public static void main(String[] args) {
        Child c1=new Child();
        c1.display();
    }
}
