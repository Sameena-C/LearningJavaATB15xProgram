package ex_22_OOPs_Super_Abstraction.abstraction;

public class Lab187_Abstract {
    public static void main(String[] args) {
        Son s1=new Son();
        s1.loan50K();
        s1.loan10K();
    }
}

abstract class Father{
    abstract void loan50K();

//Concrete - complete method

    void loan10K(){
        System.out.println("Given!");
    }
}

class Son extends Father{

    @Override
    void loan50K() {
        System.out.println("Given by Son!!");
    }
}


