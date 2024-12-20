import files.Payload;
import io.restassured.path.json.JsonPath;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SumValidation {

    @Test
    public void sumOfValidation() {
        int sum=0;
        JsonPath js=new JsonPath(Payload.cousePrice());
        int count= js.getInt("courses.size()");

        for(int i=0; i<count; i++) {
          int price= js.getInt("courses["+i+"].price");
          int copies=js.getInt("courses["+i+"].copies");
          int amount=price * copies;
          System.out.println(amount);
          sum=sum+amount; //0+300; 300+160..and so on

        }
        System.out.println(sum); //1278
        int purchaseAmount=js.getInt("dashboard.purchaseAmount");
        Assert.assertEquals(sum, purchaseAmount);
    }
}
