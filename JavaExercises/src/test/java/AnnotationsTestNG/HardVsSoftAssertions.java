package AnnotationsTestNG;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class HardVsSoftAssertions {

    //if the assert is failed the other print statements are not executed
    //OBJECTS created just on local methods, not on class for soft assertions; we do not have main method
@Test
    void test_hard() {
    System.out.println("testing");
    System.out.println("testing");
    Assert.assertEquals(1,1);

    System.out.println("testing");
    System.out.println("testing");
    }

@Test
    void test_soft() {
        System.out.println("testing");
        System.out.println("testing");

        SoftAssert assertS=new SoftAssert(); //we need object; we cannot access directly throw method; non-static methods this is why we need object
        assertS.assertEquals(1,2);


        System.out.println("testing");
        System.out.println("testing");
        assertS.assertAll(); //MANDATORY

    }
}
