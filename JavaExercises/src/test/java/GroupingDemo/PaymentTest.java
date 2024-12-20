package GroupingDemo;

import org.testng.annotations.Test;

public class PaymentTest {

    @Test(priority = 1,groups={"regression", "sanity","functional"})
    void paymentRupees() {
        System.out.println("Payment rupees successfully");
    }


    @Test(priority = 2,groups={"regression", "sanity", "functional"})
    void paymentDollars() {
        System.out.println("Payment dollars successfully");
    }

}
