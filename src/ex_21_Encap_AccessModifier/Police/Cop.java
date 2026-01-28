package ex_21_Encap_AccessModifier.Police;

public class Cop {

    private int gun;
    private String iCard;

    public Cop(int bullet)
    {
        this.gun = bullet;
    }

   // private void canIShoot()
    protected void canIShoot()
    {
        System.out.println("Yes you can !!");
    }
    void thisDefaultF1() {
        System.out.println("Hi, Cop!");
    }

}

