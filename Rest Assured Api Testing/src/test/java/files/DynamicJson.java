package files;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class DynamicJson {

  @Test(dataProvider = "BooksData")
    public void addBooks (String isbn, String aisle) {
      RestAssured.baseURI="https://rahulshettyacademy.com";
      String response= given().header("Content-Type", "application/json")
              .body(Payload.addBook("djdd", "3638"))
              .when().post("/Library/Addbook.php").then().log().all().assertThat().statusCode(200)
              .extract().response().asString();
     JsonPath js= ReusableMethods.rawToJson(response);
     String id=js.get("ID");
     System.out.println(id);
  }

  //delete book
    @DataProvider(name="BooksData")
    public Object [][] getData() {
      //array=collection of elements; multidimensional array= collection of arrays; one array=data for one book
     return new Object [][] { {"dgjd", "12"}, {"dhdjf", "345"}, {"dgshjd", "3467"} };
    }


}
