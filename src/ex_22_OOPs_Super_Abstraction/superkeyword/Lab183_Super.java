package ex_22_OOPs_Super_Abstraction.superkeyword;

public class Lab183_Super {

}
class BaseClass{

    private String browser;
    public String getBrowser() {
        return browser;
    }

    public void setBrowser(String browser) {
        this.browser = browser;
    }

    BaseClass(){
        System.out.println("DC - Parent");
    }
    void openBrowser(String browserName)
    {
        System.out.println("Open Browser!! -> "+ browserName);
    }

    void closeBrowser()
    {
        System.out.println("Close Browser!!");
    }
    int aa;
    BaseClass(String browser){
        this.browser = browser;
        System.out.println("P Const");
    }
}
class TestCase extends BaseClass {
    void test(){}
    String a;

    TestCase()
    {
       // super();
      //  super("Chrome");

        super.openBrowser("Chrome");
        super.closeBrowser();
        System.out.println(super.getBrowser());
        super.setBrowser("firefox");
        System.out.println(super.aa);
        this.test();
        System.out.println(this.a);
    }
}