package GroupingDemo;

import org.testng.annotations.Test;

public class SignupTest {

    @Test(priority = 1,groups={"regression"})
    void signUpEmail() {
        System.out.println("Sign up email successfully");
    }

    @Test(priority = 2,groups={"regression"})
    void signUpFacebook() {
        System.out.println("Sign up facebook successfully");
    }

    @Test(priority = 3,groups={"regression"})
    void signUpTwitter() {
        System.out.println("Sign up twitter successfully");
    }
}
