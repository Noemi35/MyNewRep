package AnnotationsTestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertionsDemo {
//static methods-hard assertions
    @Test
    void test() {

//        Assert.assertEquals("xzy", "xzy1");
//        Assert.assertEquals("xzy", 123);
//        Assert.assertNotEquals("xzy", 123);
//        Assert.assertTrue(true); //pass
//        Assert.assertTrue(1==2); //false
          Assert.assertFalse(1==2); //PASS
          Assert.fail();


   }
}
