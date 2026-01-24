package ex_18_OOPs_Part2_Inheritance.multilevel;
public class Lab175_MutiLevel {
    public static void main(String[] args) {
        Son pramod=new Son();
        pramod.home();
        pramod.bhk3();
        pramod.gf();
        pramod.extraMoney();

        Father f=new Father();
        f.gf();
        f.home();
      //  f.extraMoney();

        GrandFather gf = new GrandFather();
        gf.gf();
        gf.home();

        //Dynamic Dispatch
        GrandFather g1=new Son(); //Relationship should be present
      //  System.out.println(g1.gf());
        Father f1=new Son(); //Relationship should be present

        //Son s1=new GrandFather();
        //Son s2=new Father();

    }
}
