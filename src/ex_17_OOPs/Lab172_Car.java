package ex_17_OOPs;

public class Lab172_Car {
    public static void main(String[] args) {
        Car t= new Car();
        System.out.println(t.name);

        Car p=new Car("xuv");
        System.out.println(p.name);

        Car p1=new Car("tesla", "2016");
        System.out.println(p1.name);
        System.out.println(p1.model);
        System.out.println(p1.year); //0 default value of int

        LoginPage l1=new LoginPage("s@gmail.com", "123");
        LoginPage l2=new LoginPage("abc@gmail.com", "s143", "Yes");
    }
}
class Car
{
    String name;
    int year;
    String model;

    Car()
    {
        name = "Unknown Car";
        year = 1991;
        model = "XX";
    }

    Car(String nameGiven){
        this.name = nameGiven;
    }

    Car(String nameGiven, String modelGiven){
        this.name = nameGiven;
        this.model = modelGiven;
    }
}








