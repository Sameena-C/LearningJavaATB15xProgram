package ex_19_OOPs_Polymorphism.methodoverloading;

public class Lab178_Real_MethodOverloading {
    public static void main(String[] args) {
        WebAutomation t1=new WebAutomation();
        t1.openBrowser();
        t1.openBrowser("Firefox");
    }
}

class WebAutomation{
    void openBrowser(){
        System.out.println("Default Browser!!");
    }

    void openBrowser(String browser)
    {
        System.out.println("Starting browser!! " + browser);
    }

}
