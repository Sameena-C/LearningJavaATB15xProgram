package ex_19_OOPs_Polymorphism.methodoverloading;

public class Lab177_Poly_MethodOverloading {
    public static void main(String[] args) {
        MathOperations m1=new MathOperations();
        int r1 = m1.add(10, 4);
        int r2 = m1.add(10, 20, 30);
        double r3 = m1.add(12.345, 45.67);
        String r4 = m1.add("pramod", "dutta");
    }

}

class MathOperations{

    //In the same class, When you have a method with same name
    //Same name methods but different arguments and different return type.

    int add(int a, int b)
    {
        return a+b;
    }

    int add(int a, int b, int c)
    {
        return a+b+c;
    }

    double add(double a, double b)
    {
        return a+b;
    }

    String add(String a, String b)
    {
        return a+b;
    }
}
