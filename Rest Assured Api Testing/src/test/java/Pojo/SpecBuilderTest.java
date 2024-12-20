package Pojo;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

import java.util.ArrayList;
import java.util.List;

import static io.restassured.RestAssured.given;

public class SpecBuilderTest {
    public static void main (String [] args) {
        AddPlaceSerialization addplace=new AddPlaceSerialization();
        addplace.setAccuracy(50);
        addplace.setAddress("29, sidH layout, cohen 09");
        addplace.setName("Frontline house");
        addplace.setLanguage("French-IN");
        addplace.setPhone_number("0744267867");
        addplace.setWebsite("https://rahulshettyacademy.com");
        List<String> myList=new ArrayList<>();
        myList.add("shoe park");
        myList.add("shoes");
        addplace.setTypes(myList);
        Location l=new Location();
        l.setLat(123445.4677);
        l.setLng(244.577);
        addplace.setLocation(l);

//Request Spec builder is like a static variable to avoid duplication of data; we need to create object; requestspecification-object type; requestspec builder is a class
       RequestSpecification req= new RequestSpecBuilder().setBaseUri("https://rahulshettyacademy.com")
                        .addQueryParam("key", "qaclick123").setContentType(ContentType.JSON).build();


//        RestAssured.baseURI="https://rahulshettyacademy.com";
       ResponseSpecification resSpec =new ResponseSpecBuilder().expectStatusCode(200).expectContentType(ContentType.JSON).build();
      RequestSpecification res=  given().spec(req);
             Response response=   res.when().log().all().post("/maps/api/place/add/json")
                .then().spec(resSpec).extract().response();
        String responseString=response.asString();
        System.out.println(responseString);


    }
}
