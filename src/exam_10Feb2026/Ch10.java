package exam_10Feb2026;
interface Flyable{
    void fly();
}
interface Swimmable {
    void swim();

}
class Duck implements Flyable, Swimmable
{

    @Override
    public void fly() {
        System.out.println("Duck is flying in the sky!");
    }

    @Override
    public void swim() {
        System.out.println("Duck is swimming in the water!");
    }
}
public class Ch10
{
    public static void main(String[] args) {
        Duck d=new Duck();
        d.fly();
        d.swim();
    }
}
