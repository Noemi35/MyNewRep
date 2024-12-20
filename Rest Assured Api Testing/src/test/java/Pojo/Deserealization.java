package Pojo;

import io.restassured.parsing.Parser;
import io.restassured.path.json.JsonPath;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static io.restassured.RestAssured.given;
//serialization- the process of converting java object in payload (request body)
public class Deserealization {


        public static void main(String[] args) {

            String[] courseTitles = {"Selenium Webdriver Java", "Cypress", "Protractor"};

            String response = given()
                    .formParams("client_id", "692183103107-p0m7ent2hk7suguv4vq22hjcfhcr43pj.apps.googleusercontent.com")
                    .formParams("client_secret", "erZOWM9g3UtwNRj340YYaK_W")
                    .formParams("grant_type", "client_credentials")
                    .formParams("scope", "trust")
                    .when().log().all()
                    .post("https://rahulshettyacademy.com/oauthapi/oauth2/resourceOwner/token").asString();

            System.out.println(response);
            JsonPath jsonPath = new JsonPath(response);
            String accessToken = jsonPath.getString("access_token");


            GetCourse gc = given()
                    .queryParams("access_token", accessToken)
                    .when().log().all()
                    .get("https://rahulshettyacademy.com/oauthapi/getCourseDetails").as(GetCourse.class);

            System.out.println(gc.getLinkedIn());
            System.out.println(gc.getInstructor());
            System.out.println(gc.getCourses().getApi().get(1).getCourseTitle());
            List<Api> apiCourses = gc.getCourses().getApi();

            for (int i = 0; i < apiCourses.size(); i++) { //extract dinamically the couse
                if (apiCourses.get(i).getCourseTitle().equalsIgnoreCase("SoapUI Webservices testing")) {
                    System.out.println(apiCourses.get(i).getPrice());
                }
            }

            //Get the course names of webAutomation
            ArrayList<String> arr=new ArrayList<String>(); //Add elements dinamically to the array list
            List<WebAutomation> webAutomationCourses = gc.getCourses().getWebAutomation();

            for (int j = 0; j < webAutomationCourses.size(); j++) {
               arr.add(webAutomationCourses.get(j).getCourseTitle()); //add the elements to the array list
            }
            List<String> expectedList= Arrays.asList(courseTitles); //convert array to array list
            Assert.assertTrue(arr.equals(expectedList)); //compare the array lists

        }
    }


