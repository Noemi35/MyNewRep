import files.Payload;
import files.ReusableMethods;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.testng.Assert;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class Basics {
    public static void main (String[] args) throws IOException {
        //validate if Add place Api is working as expected

        //given
        //when
        //then
       //content to the file to string -> content of the file can be converted into Byte -> Byte data into string
        RestAssured.baseURI="https://rahulshettyacademy.com";
       String response= given().log().all().queryParam("key","qaclick123").header("Content-Type", "application/json").body(new String(Files.readAllBytes(Paths.get("/home/noemi/Desktop/Project IntelliJ/Rest Assured Api Testing/src/test/java/files/addPlace.json")))).when().post("maps/api/place/add/json")
                .then().assertThat().statusCode(200).body("scope", equalTo("APP"))
                .header("server", "Apache/2.4.52 (Ubuntu)").extract().response().asString();

      System.out.println(response);

        //Add place ->Update Place with New Address ->Get Address to validate if New Address is validate in response

        JsonPath js=new JsonPath(response); //parsing json
        String place_id=js.getString("place_id");
        System.out.println(place_id);

        //update place
        String newAddress="New Walk, Africa";
        given().log().all().param("key", "qaclick123").header("Content-Type", "application/json")
                .body("{\n" +
                        "\"place_id\":\""+place_id+"\",\n" +
                        "\"address\":\""+newAddress+"\",\n" +
                        "\"key\":\"qaclick123\"\n" +
                        "}")
                .when().put("maps/api/place/update/json")
                .then().assertThat().log().all().statusCode(200).body("msg", equalTo("Address successfully updated"));


        //get place
       String getPlaceResponse= given().log().all().queryParam("key", "qaclick123")
                .queryParam("place_id", "a44a324a90c91c3d583127bfa15e049a")
                .when().get("maps/api/place/get/json")
                .then().assertThat().log().all().statusCode(200).extract().response().asString();
       JsonPath js1= ReusableMethods.rawToJson(getPlaceResponse);
       String actualAddress=js1.getString("address");
       System.out.println(actualAddress);
        Assert.assertEquals(actualAddress, newAddress);


    }
}
