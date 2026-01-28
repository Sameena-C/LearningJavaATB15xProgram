package ex_20_OOPs_Encapsulation;

public class Lab182_REAL_BANK {
    public static void main(String[] args) {
        ICICIBank amit=new ICICIBank("Amit", 100);
        long bal= amit.getBal();
        System.out.println(bal);
      //  System.out.println(amit.bal); //<- not allowed
        System.out.println(amit.getBal()); //allowed

        amit.setBal(200, false);
        System.out.println(amit.getBal());
    }
}

class ICICIBank{
    private String name;
    private long bal;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getBal() {
        return bal;
    }

    public void setBal(long bal, boolean isCashier) {
        if(isCashier) {
            this.bal = bal;
        }
        else {
            System.out.println("Not allowed to modify the bal");
        }
    }
public ICICIBank(String name, long bal)
{
    this.name=name;
    this.bal=bal;
}
}

