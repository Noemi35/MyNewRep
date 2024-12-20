package Pojo;

import io.restassured.RestAssured;
import io.restassured.response.Response;

import java.util.ArrayList;
import java.util.List;

import static io.restassured.RestAssured.given;

public class Serialization {
    public static void main (String [] args) {
        AddPlaceSerialization addplace=new AddPlaceSerialization();
        addplace.setAccuracy(50);
        addplace.setAddress("29, side layout, cohen 09");
        addplace.setName("Frontline house");
        addplace.setLanguage("French-IN");
        addplace.setPhone_number("0744567867");
        addplace.setWebsite("https://rahulshettyacademy.com");
        List<String> myList=new ArrayList<>();
        myList.add("shoe park");
        myList.add("shoes");
        addplace.setTypes(myList);
        Location l=new Location();
        l.setLat(123445.4677);
        l.setLng(244.577);

        addplace.setLocation(l);
        RestAssured.baseURI="https://rahulshettyacademy.com";
      Response res=  given().log().all().queryParam("key", "qaclick123").body(addplace)
                .when().post("/maps/api/place/add/json")
                .then().assertThat().statusCode(200).extract().response();
        String responseString=res.asString();
        System.out.println(responseString);


    }
}
