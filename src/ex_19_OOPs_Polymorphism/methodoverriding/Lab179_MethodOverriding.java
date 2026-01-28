package ex_19_OOPs_Polymorphism.methodoverriding;

public class Lab179_MethodOverriding {
    public static void main(String[] args) {
        Pramod p1=new Pramod();
        p1.home();

        Father f1=new Father();
        f1.home();
    }

}

class Father{
    void home(){
        System.out.println("2BHK");
    }
}

class Pramod extends Father{
    @Override
    void home()
    {
        System.out.println("3BHK");
    }
}