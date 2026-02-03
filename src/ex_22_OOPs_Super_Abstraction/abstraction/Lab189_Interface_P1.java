package ex_22_OOPs_Super_Abstraction.abstraction;

public class Lab189_Interface_P1 {
    public static void main(String[] args) {
        Car2 car2=new Car2();
        car2.drive();
    }
}

class Car2 implements Brakes, Engine1{

    void drive(){
        startEngine();
        applyBrake();
        testEngine();
        Engine1.testEngineStatic();
        stopEngine();
    }
    @Override
    public void applyBrake() {
        System.out.println("Apply Brake");
    }

    @Override
    public void applyBrake2() {

    }

    @Override
    public void startEngine() {
        System.out.println("Start Engine");
    }

    @Override
    public void stopEngine() {
        System.out.println("Stop Engine");
    }
}


interface Brakes{
    void applyBrake();
    void applyBrake2();
}
interface Engine1{
    void startEngine();
    void stopEngine();

    /*These methods are allowed in interface be never used*/
    private void testEngine1(){
        System.out.println("Concrete complete");
    }

    default void testEngine(){
        System.out.println("Concrete default");
    }

    static void testEngineStatic(){
        System.out.println("Concrete static");
    }


}