package exam_10Feb2026;
/*
Abstract Shape Implementation
Implement an abstract class "Shape" with an abstract method "getArea()".
Create subclasses "Rectangle" and "Circle" and implement "getArea()" for each.

Input: Rectangle: length=5, width=3; Circle: radius=4
Output: Rectangle Area: 15.0 Circle Area: 50.26548245743669

Explanation:Abstract classes cannot be instantiated but can define common behavior.
Subclasses must implement all abstract methods.
 */
abstract class Shape{
    abstract void getArea();
}
class Rectangle extends Shape{

    @Override
    void getArea() {
        int l=5;
        int w=3;
        double area=l * w;
        System.out.println("Rectangle Area: " + area);
    }
}
class Circle extends Shape{

    @Override
    void getArea() {
        int r = 4;
        double area = Math.PI * r * r;
        System.out.println("Circle Area: " + area);
    }
}
public class Ch08 {
    public static void main(String[] args) {
        Rectangle r1=new Rectangle();
        r1.getArea();
        Circle c1=new Circle();
        c1.getArea();
    }
}
