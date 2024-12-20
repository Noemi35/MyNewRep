package AnnotationsTestNG.TestsAnnotations;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

//executed one before test and after test executed once after test and we include multiple classes
//if we have multiple classes in one test, after each test the before and after test is executed
public class C1 {

    @Test
    void abc() {
        System.out.println("abc completed");
    }

    @BeforeTest
    void bt() {
        System.out.println("before test completed");
    }

}
