package ex_22_OOPs_Super_Abstraction.superkeyword;

public class Lab184_Abs {
}
class Vehicle{
    public int maxSpeed = 100;

    Vehicle(){
        System.out.println("Default Constructor");
    }

    Vehicle(int a){
        System.out.println("Param Constructor");
    }
    Vehicle(int a, int b){
        System.out.println("Param Constructor with 2 parameters");
    }

//Method Overloading - same, same name function with different arguments
    void message(){
        System.out.println("No Return, No Argument");
    }

    void message(int a){
        System.out.println("No Return, with Argument");
    }

    void drive(){
        System.out.println("Vehicle - Parent ");
    }

    void noTest(){
        System.out.println("Empty!!");
    }
}

class Car extends Vehicle{
    private int maxSpeed=281;

    Car(){
        super(100);
    }

    Car(int a){
        System.out.println("PC Car");
    }
    void test(){

    }
    @Override
    void drive(){
        super.drive();
        this.test();
        super.noTest();
    }
}













