package exam_10Feb2026;
/*
Outer and Inner Class Implementation
Create a class "Outer" with an inner class "Inner".
Access the inner class from the outer class and demonstrate their interaction.

Input: Outer class with variable x=10, Inner class accessing x
Output: Outer class variable x: 10 Inner class accessing outer variable: 10

 Explanation:Inner classes have access to all members of the outer class,
 including private members. They are useful for helper classes.
 */
public class Ch13 {
    public static void main(String[] args) {
        Outer o = new Outer();
        System.out.println("Outer class with variable x="+ o.x + " Inner class accessing outer variable: "+o.x);
    }
}
class Outer{
    static int x = 10;
    private int y = 20;
    class Inner {
         int z = x + y;
    }

}