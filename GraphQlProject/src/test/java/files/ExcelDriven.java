package files;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

import static io.restassured.RestAssured.given;

public class ExcelDriven {

    @Test
    public void addBook () throws IOException {
        dataDriven dt=new dataDriven();
       ArrayList<String> data= dt.getData("RestAddBook", "RestAssured");

        HashMap<String, Object>  jsonAsMap = new HashMap<>();
        jsonAsMap.put("name", data.get(1));
        jsonAsMap.put("isbn", data.get(2));
        jsonAsMap.put("aisle", data.get(3));
        jsonAsMap.put("author", data.get(4));

//        HashMap<String, Object>  jsonAsMap1 = new HashMap<>(); //for nested json
//        jsonAsMap.put("lat", "46783940");
//        jsonAsMap.put("lng", "dduir");
//        jsonAsMap.put("location", jsonAsMap1); //put object of nested array




        RestAssured.baseURI="https://rahulshettyacademy.com";
        Response resp= given().header("Content-Type", "application/json").body(jsonAsMap)
               .when().log().all().post("/Library/Addbook.php").then().assertThat().statusCode(200).extract().response();

//        JsonPath js=ReusableMethods.rawToJson(resp);
        JsonPath js = ReusableMethods.rawToJson(resp);
        String id = js.getString("ID"); // Use getString for proper type casting
        System.out.println("Extracted ID: " + id);

    }
}
