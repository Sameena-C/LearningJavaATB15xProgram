package ex_22_OOPs_Super_Abstraction.abstraction;

public class Lab193_Interface_Variables {
}

interface Pramod{
    final int a = 10;
    String notes = "JAVA";
    void display();
}

class Dutta implements Pramod{
    int aa = 10;
    @Override
    public void display() {
      //  System.out.println(super.a); // a cannot be accessed as it is final in nature;
        // interface variables we are unable to access

        System.out.println(a); //directly we can access
        System.out.println(aa);
        System.out.println(this.aa);
    }
}

class Somya implements Pramod
{

    @Override
    public void display() {
        System.out.println(notes);
    }
}


interface B{

}

//interface A implements B{
//
//}