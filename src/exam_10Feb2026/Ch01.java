package exam_10Feb2026;
/*
Person Class Implementation
Create a class "Person" with attributes "name" and "age". Create two instances and print their details.

Input: Create Person objects with names "John" (25) and "Alice" (30)
Output: Name: John, Age: 25 Name: Alice, Age: 30

Explanation:Create a Person class with constructor parameters for name and age,
then create two instances and call a display method for each.
 */
class Person{
    String name;
    int age;
    Person(String name, int age)
    {
        this.name = name;
        this.age = age;
    }
    void display()
    {
        System.out.println("Name: " + name + ", " + "Age: " + age);
    }
}
public class Ch01 {
    public static void main(String[] args) {
        Person p1=new Person("John", 25);
        Person p2=new Person("Alice", 30);

        p1.display();
        p2.display();
    }

}
