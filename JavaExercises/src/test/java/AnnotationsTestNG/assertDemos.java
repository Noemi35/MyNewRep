package AnnotationsTestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class assertDemos

{
@Test
    void testDemo() {

        String act_title="Opencart";
        String exp_title="Opencartj";

//        Assert.assertEquals(exp_title, act_title); //we can't use if condition, it will not return the accurate result


     if(exp_title.equals(act_title)) {
         Assert.assertTrue(true);
     } else {
         Assert.assertTrue(false);

     }
    }
}
