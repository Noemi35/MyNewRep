package End2EndApiTesting;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.specification.RequestSpecification;
import org.testng.Assert;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;

public class ECommerceAPITest {
    //deserialization -response body converted in java object
    public static void main (String [] args) {
        //get token
        RequestSpecification request= new RequestSpecBuilder().setBaseUri("https://rahulshettyacademy.com").setContentType(ContentType.JSON).build(); //create object

        LoginRequestPojo loginRequest=new LoginRequestPojo();
        loginRequest.setUserEmail("noemi.pohrib@gmal.com");
        loginRequest.setUserPassword("IamKing124@");
         //SSL certification - relaxedHTTPSValidation() for trusting every host
        //login
        //we used deserialization -convert payload in java object
       RequestSpecification reqLogin= given().relaxedHTTPSValidation().log().all().spec(request).body(loginRequest);
      LoginResponse loginResponse= reqLogin.when().post("/api/ecom/auth/login").then().log().all().extract().response().as(LoginResponse.class);
      System.out.println(loginResponse.getToken());
      System.out.println(loginResponse.getUserID());
      String userID=loginResponse.getUserID();
      System.out.println(loginResponse.getMessage());


        //add product
        RequestSpecification addProductBaseReq= new RequestSpecBuilder().setBaseUri("https://rahulshettyacademy.com").addHeader("authorization", "token").build();
        RequestSpecification reqAddProduct=given().log().all().spec(addProductBaseReq).param("token", "laptop")
                .param("productAddedBy", userID) //id generated after login with credentials
                .param("productCategory", "fashion").param("productSubCategory", "shirts")
                .param("productPrice", "11500")
                .param("productDescription", "Addias Originals")
                .param("productFor", "women")
                .multiPart("productImage", new File("//home//noemi//Downloads//newsman_emails sent.png")); //attachments
             String addProductResponse= reqAddProduct.when().post("/api/ecom/product/add-product").then().log().all().extract().response().asString();
        JsonPath js=new JsonPath(addProductResponse);
        String productId=js.get("productId");


        //create order
       //serialization -convert java object in payload
        RequestSpecification createOrderBaseReq= new RequestSpecBuilder().setBaseUri("https://rahulshettyacademy.com").setContentType(ContentType.JSON).addHeader("authorization", "token").build();
        OrderDetail orderDetail=new OrderDetail();
        orderDetail.setCountry("romania");
        orderDetail.setProductOrderedId(productId);

        List<OrderDetail> orderDetailList=new ArrayList<>();
        orderDetailList.add(orderDetail);

        Orders orders=new Orders();
        orders.setOrders(orderDetailList);
        RequestSpecification createOrderRequest= given().log().all().spec(createOrderBaseReq).body(orders);
       String responseAddOrder= createOrderRequest.when().post("/api/ecom/order/create-order").then().log().all().extract().response().asString();
       System.out.println(responseAddOrder);


       //delete product

        RequestSpecification deleteProductBaseReq= new RequestSpecBuilder().setBaseUri("https://rahulshettyacademy.com").addHeader("authorization", "token").build();

      RequestSpecification reqDeleteProduct= given().log().all().spec(deleteProductBaseReq).pathParam("productId", productId);
     String deleteProductResponse= reqDeleteProduct.when().delete("/api/ecom/product/delete-product/{{productId}}").then().log().all().extract().response().asString();
        JsonPath js1=new JsonPath(deleteProductResponse);
       Assert.assertEquals("Product Deleted Successfully ", js1.get("message"));
    }
}
