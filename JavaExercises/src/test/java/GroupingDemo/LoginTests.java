package GroupingDemo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTests {

    @Test(priority = 1, groups={"sanity"})
    void loginEmail() {
      System.out.println("Login email successfully");
    }

    @Test(priority = 2,groups={"sanity"})
    void loginFB() {
        System.out.println("Login facebook successfully");
    }

    @Test(priority = 3,groups={"sanity"})
    void loginTwitter() {
        System.out.println("Login twitter successfully");
    }

}
