package exam_10Feb2026;
/*
Animal Sound Polymorphism
Create a class "Animal" and subclasses "Dog" and "Cat".
Override a method to make each animal make a sound.

Input: Create Dog and Cat objects and call makeSound()
Output: Dog says: Woof! Woof! Cat says: Meow! Meow!

 Explanation:Demonstrate method overriding where each
 subclass provides its own implementation of the makeSound() method.
 */
class Animal {
    void makeSound()
    {
        System.out.println("Animal makes Sound");
    }
}
class Dog extends Animal
{
    void makeSound()
    {
        System.out.println("Dog says: Woof! Woof!");
    }
}
class Cat extends Animal
    {
        void makeSound()
        {
            System.out.println("Cat says: Meow! Meow!");
        }

    }
public class Ch05 {
    public static void main(String[] args) {
        Dog d1=new Dog();
        d1.makeSound();
        Cat c1= new Cat();
        c1.makeSound();

    }
}
