package AnnotationsTestNG.TestsAnnotations;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class C2 {

    @Test
    void xzy() {
        System.out.println("xzy completed");
    }

    @AfterTest
    void af() {
        System.out.println("after test completed");
    }

}

