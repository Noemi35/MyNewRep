package AnnotationsTestNG.TestsAnnotations;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class C3 {

    @Test
    void CVB() {
        System.out.println("cvb completed");
    }

    @BeforeSuite
    void BeforeSuite() {
        System.out.println("before suite completed");
    }

    @AfterSuite
    void afterSuite() {
        System.out.println("after suite completed");
    }
}
