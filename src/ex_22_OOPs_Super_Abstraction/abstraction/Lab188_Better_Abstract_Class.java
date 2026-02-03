package ex_22_OOPs_Super_Abstraction.abstraction;

public class Lab188_Better_Abstract_Class {
    public static void main(String[] args) {
        Alto car=new Alto();
        car.drive();
    }
}
class Alto extends Car1{
    void drive(){
        startCar();
        System.out.println("We are driving a car");
        stopCar();
    }

    @Override
    void startCar() {
        System.out.println("Startng a car Alto");
    }

    @Override
    void stopCar() {
        System.out.println("Stopping a car Alto");
    }
}
abstract class Car1{
    abstract void startCar();
    abstract void stopCar();
}