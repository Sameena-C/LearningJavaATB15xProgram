package exam_10Feb2026;
/*
Drawable Interface Implementation
Create an interface "Drawable" with a method "draw()".
Implement this interface in classes "Circle" and "Rectangle".

Input: Create Circle and Rectangle objects, call draw() method
Output: Drawing a Circle Drawing a Rectangle

Explanation:Interfaces define contracts that implementing classes must follow.
All methods in an interface are implicitly abstract.
 */
interface Drawable{
    void draw();
}
class circle implements Drawable{

    @Override
    public void draw() {
        System.out.println("Drawing a Circle");
    }
}
class rectangle implements Drawable{

    @Override
    public void draw() {
        System.out.println("Drawing a Rectangle");
    }
}
public class Ch09 {
    public static void main(String[] args) {
        circle c1 = new circle();
        c1.draw();
        rectangle r1 = new rectangle();
        r1.draw();
    }
}
