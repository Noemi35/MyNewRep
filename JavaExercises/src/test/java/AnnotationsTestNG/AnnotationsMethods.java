package AnnotationsTestNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

//repeated before and after each method of the class
public class AnnotationsMethods {
    @BeforeMethod
    void login() {
        System.out.println("Login completed");
    }

    @AfterMethod
    void logout() {
        System.out.println("Logout completed");
    }

    @Test(priority = 1)
    void search() {
        System.out.println("Search completed");
    }
    @Test(priority = 2)
    void advancedSearch() {
        System.out.println("Advanced search completed");
    }


}
