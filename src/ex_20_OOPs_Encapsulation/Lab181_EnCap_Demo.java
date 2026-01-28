package ex_20_OOPs_Encapsulation;

public class Lab181_EnCap_Demo {
    public static void main(String[] args) {
        VWOLogin vwoLogin=new VWOLogin("admin", "pass123");
        System.out.println(vwoLogin.password);
        vwoLogin.password="345";
        System.out.println(vwoLogin.password);

        GoodVWOLogin goodVWOLogin=new GoodVWOLogin("admin", "pwd123");
        //System.out.println(goodVWOLogin.password); //not allowed because encapsulated

        System.out.println(goodVWOLogin.getPassword()); //Now allowed
        //goodVWOLogin.setPassword("P123");

    }
}

class VWOLogin{
    public String username;
    public String password;

    public VWOLogin(String username, String password){
        this.password = password;
        this.username = username;
    }
}

class GoodVWOLogin{
    private String username;
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return password;
    }

//    public void setPassword(String password) {
//        this.password = password;
//    }





    public GoodVWOLogin(String username, String password){
        this.password = password;
        this.username = username;
    }
}