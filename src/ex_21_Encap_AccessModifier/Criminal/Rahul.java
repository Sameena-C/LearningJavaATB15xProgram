package ex_21_Encap_AccessModifier.Criminal;

import ex_21_Encap_AccessModifier.Police.Cop;

public class Rahul extends Cop {

    public Rahul(int bullet) {
        super(bullet);
    }

    public static void main(String[] args) {
        Cop rahul=new Cop(100);
      //  rahul.canIShoot;
       // rahul.thisDefaultF1();
    }
}
