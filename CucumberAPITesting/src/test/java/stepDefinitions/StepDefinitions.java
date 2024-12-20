package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import pojo.AddPlaceSerialization;
import pojo.Location;
import resources.APIResources;
import resources.TestDataBuilder;
import resources.Utils;


import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;

public class StepDefinitions extends Utils { //if we extend, do not need object, can invoke methods from utils class

    RequestSpecification res;
    ResponseSpecification resSpec;
    Response response;
    static String place_id; //use the same static copy of place_id; shared for the second scenario
    TestDataBuilder data=new TestDataBuilder();

    @Given("Add place Payload with {string} {string} {string}")
    public void add_place_payload_with(String name, String language, String address) throws IOException {




//Request Spec builder is like a static variable to avoid duplication of data; we need to create object; requestspecification-object type; requestspec builder is a class


//        RestAssured.baseURI="https://rahulshettyacademy.com";
           resSpec =new ResponseSpecBuilder().expectStatusCode(200).expectContentType(ContentType.JSON).build();
           res=  given().spec(requestSpecification()).body(data.addPlacePayload(name, language, address));
    }
    @When("user calls {string} using {string} http request")
    public void user_calls_using_http_request(String resource, String method) {
        //constructor will be called with value of resource which you pass
      APIResources resourceApi= APIResources.valueOf(resource); //like creating object
       System.out.println(resourceApi.getResource()); //get all resources add, get, delete api from APIResources class
        // Write code here that turns the phrase above into concrete actions
        if(method.equalsIgnoreCase("POST"))
            response = res.when().log().all().post(resourceApi.getResource());
                   else if(method.equals("GET"))
                response = res.when().log().all().get(resourceApi.getResource());


    }
    @Then("the API call is successful with status code {int}")
    public void the_api_call_is_successful_with_status_code(Integer int1) {
        // Write code here that turns the phrase above into concrete actions
     assertEquals(response.getStatusCode(), 200);
    }
    @Then("{string} in response body is {string}")
    public void in_response_body_is(String keyValue, String expectedValue) { //status and okay from feature file -these two parameters
        // Write code here that turns the phrase above into concrete actions
        assertEquals(getJsonPath(response,keyValue), expectedValue);
    }

    @Then("verify place_Id created maps to {string} using {string}")
    public void verify_place_id_created_maps_to_using(String expectedName, String resource) throws IOException {
        // Write code here that turns the phrase above into concrete actions
        //request Spec
        place_id= getJsonPath(response, "place_id").toString();
        res = given().spec(requestSpecification()).queryParam("place_id", place_id);
        user_calls_using_http_request(resource, "GET");
        String actualName= getJsonPath(response, "name").toString();
        assertEquals(actualName,expectedName);


    }

    @Given("DeletePlace Payload")
    public void delete_place_payload() throws IOException {
        // Write code here that turns the phrase above into concrete actions
       res=given().spec(requestSpecification()).body(data.deletePlacePayload(place_id));

    }
    }
