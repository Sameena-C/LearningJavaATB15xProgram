package ex_17_OOPs;

import org.w3c.dom.ls.LSOutput;

public class Lab170_Cats_OOPs {
    public static void main(String[] args) {
        Cat c1=new Cat();
        Cat c2=new Cat("mufasa");
        Cat c3=new Cat("lucy");
        Cat c4=new Cat("juli");
        Cat c5=new Cat("Minna");

        System.out.println(c2.name);
        System.out.println(c3.name);
    }

}
class Cat{
    String name;

    Cat(){
        System.out.println("DC");
        System.out.println(this.name);
    }

    Cat(String nameGiven){
        this.name=nameGiven;
      //  name=nameGiven;
      //  name="Kitty";
    }


    void running(){
        int local_var = 10;
        System.out.println("Who is running -> " + this.name);
    }
}
