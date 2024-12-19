package files;

import io.restassured.path.json.JsonPath;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.swing.*;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.post;

public class OAuthTest {

    public static void main(String args[]) throws InterruptedException {

//      ChromeDriver driver=new ChromeDriver();
//      driver.get("https://accounts.google.com/o/oauth2/v2/auth?scope=https://www.googleapis.com/auth/userinfo.email&auth_url=https://accounts.google.com/o/oauth2/v2/auth&client_id=692183103107-p0m7ent2hk7suguv4vq22hjcfhcr43pj.apps.googleusercontent.com&response_type=code&redirect_uri=https://rahulshettyacademy.com/getCourse.php&state=verifyjdss");
//      driver.findElement(By.cssSelector("input[type='email']")).sendKeys("srinath19830");
//      driver.findElement(By.cssSelector("input[type='email']")).sendKeys(Keys.ENTER);
//        Thread.sleep(3000);
//      driver.findElement(By.cssSelector("input[type='password']")).sendKeys("123456");
//      driver.findElement(By.cssSelector("input[type='password']")).sendKeys(Keys.ENTER);
//      Thread.sleep(4000);
//      String url=  driver.getCurrentUrl();

        String url="https://rahulshettyacademy.com/getCourse.php?state=verifyfjdss&code=4%2FvAHBQUZU6o4WJ719NrGBzSELBFVBI9XbxvOtYpmYpeV47bFVExkaxWaF_XR14PHtTZf7ILSEeamywJKwo_BYs9M&scope=email+https%3A%2F%2Fwww.googleapis.com%2Fauth%2Fuserinfo.email+openid&authuser=0&session_state=0c32992f0d47e93d273922018ade42d1072b9d1f..a35c&prompt=none#";
        //increase the lifetime of the attribute to test it for many days
        String partialCode= url.split("code=") [1];
        String code=partialCode.split("scope=") [0];
        System.out.println(code);



        String accessTokenResponse= given().urlEncodingEnabled(false)
                .queryParams("code", code)
                .queryParams("client_id", "692183103107-p0m7ent2hk7suguv4vq22hjcfhcr43pj.apps.googleusercontent.com")
                .queryParams("client_secret", "erZOWM9g3UtwNRj340YYaK_W")
                .queryParams("grant_type", "authorization_code")
                .queryParams("redirect_uri", "https://rahulshettyacademy.com/getCourse.php")
                .when().log().all()
                .post("https://rahulshettyacademy.com/oauthapi/oauth2/resourceOwner/token").asString();

        JsonPath js=new JsonPath(accessTokenResponse); //convert to json
       String accessToken= js.getString("access_token");



      String response=  given().queryParam("access_token", "accessToken")
                .when().log().all()
              .get("https://rahulshettyacademy.com/oauthapi/getCourseDetails").asString();

      System.out.println(response);
    }
}
