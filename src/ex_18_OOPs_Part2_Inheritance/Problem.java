package ex_18_OOPs_Part2_Inheritance;

public class Problem {
    public static void main(String[] args) {
        Animal a1=new Dog();
        a1.sound(); //Dog Barks "Jiske laati usi bhains" Here object is Dog's class
    }
}
class Animal {
    void sound(){
        System.out.println("Animal makes sound");
    }
}

class Dog extends Animal{
    void sound(){
        System.out.println("Dog Barks");
    }
}