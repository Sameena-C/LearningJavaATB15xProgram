package exam_10Feb2026;
/*
Vehicle Inheritance Hierarchy
Create a Vehicle base class with start() method.
Create Car and Bike subclasses that override the start() method.

Input: Vehicle[] vehicles = {new Car(), new Bike()}; call start() on each
Output: Car engine starts with a roar! Bike engine starts with a purr!

 Explanation:Demonstrate runtime polymorphism
 where the actual method called depends on the object type, not the reference type.
 */

class Vehicle{
    void start()
    {
        System.out.println("Vehicle is starting.....");
    }
}
class Car extends Vehicle{
    void start()
    {
        System.out.println("Car engine starts with a roar!");
    }
}
class Bike extends Vehicle{
    void start()
    {
        System.out.println("Bike engine starts with a purr!");
    }
}
public class Ch06 {
    public static void main(String[] args) {
        //Vehicle[] vehicles = {new Car(), new Bike()};

        Vehicle car=new Car();
        Vehicle bike=new Bike();

        car.start();
        bike.start();
    }
}
