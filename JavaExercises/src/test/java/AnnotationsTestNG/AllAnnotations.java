package AnnotationsTestNG;

import org.testng.annotations.*;

public class AllAnnotations {

    @BeforeSuite
    void afSuite() {
        System.out.println("before suite completed");
    }

    @AfterSuite
    void bSuite() {
        System.out.println("after suite completed");
    }

    @AfterTest
    void afterTest() {
        System.out.println("after test completed");
    }

    @BeforeTest
    void beforeTest() {
        System.out.println("before test completed");
    }


    @BeforeClass
    void beforeClass() {
        System.out.println("before class completed");
    }

    @AfterClass
    void afterClass() {
        System.out.println("after class completed");
    }


    @BeforeMethod
    void beforeMethod() {
        System.out.println("before method completed");

    }

    @AfterMethod
    void afterMethod() {
        System.out.println("after method completed");
    }

    @Test
    void abc() {
        System.out.println("abc completed");
    }

    @Test
    void xzy() {
        System.out.println("xzy completed");
    }


}
