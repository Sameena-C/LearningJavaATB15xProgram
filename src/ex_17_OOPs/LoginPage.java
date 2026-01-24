package ex_17_OOPs;

public class LoginPage {
    String email;
    String password;
    String submitButton;

    LoginPage()
    {
        System.out.println("DC");
    }
    public LoginPage(String email, String password) {
        this.email=email;
        this.password = password;
    }

    public LoginPage(String email, String password, String submitButton) {
        this(email, password); //Constructor Chaining
        this.submitButton = submitButton;
    }





}
