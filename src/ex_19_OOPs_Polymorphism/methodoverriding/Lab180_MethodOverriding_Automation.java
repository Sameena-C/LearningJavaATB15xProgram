package ex_19_OOPs_Polymorphism.methodoverriding;

public class Lab180_MethodOverriding_Automation {
    public static void main(String[] args) {
        ChromeTC c1=new ChromeTC();
        c1.openBrowser();

        FirefoxTC f1=new FirefoxTC();
        f1.openBrowser();

        CommontoAll commontoAll=new CommontoAll();
        commontoAll.openBrowser();

        //Dynamic Dispatch

        CommontoAll c2=new ChromeTC();
        c2.openBrowser();

        CommontoAll c3=new FirefoxTC();
        c3.openBrowser();

        //WebDriver driver=new ChromeDriver(); /*In Real life this is used because
        // we want to utilise the common methods or function between WebDriver & ChromeDriver
    }
}
class CommontoAll
{
    void openBrowser()
    {
        System.out.println("Starting the IE browser");
    }

}
class ChromeTC extends CommontoAll
{
    @Override
    void openBrowser()
    {
        System.out.println("Starting the CHROME browser");
    }
}
class FirefoxTC extends CommontoAll
{
    @Override
    void openBrowser()
    {
        System.out.println("Starting the FIREFOX browser");
    }
}
