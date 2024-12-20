package resources;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import java.io.*;

import java.util.Properties;

public class Utils {
  static RequestSpecification req; //variable shared across all test cases


    public  RequestSpecification requestSpecification() throws IOException {
        if(req==null) {
            PrintStream log = new PrintStream(new FileOutputStream("logging.txt"));
            req = new RequestSpecBuilder().setBaseUri(getGobalvalue("baseUrl"))
                    .addQueryParam("key", "qaclick123").addFilter(RequestLoggingFilter.logRequestTo(log))
                    .addFilter(ResponseLoggingFilter.logResponseTo(log))
                    .setContentType(ContentType.JSON).build();
            return req;
        }
        return req; //when it knows it's not null it will create the first req which is not null
    }

    public static String getGobalvalue(String key) throws IOException {
        Properties prop=new Properties();
        FileInputStream fis=new FileInputStream("/home/noemi/Desktop/ProjectIntelliJ/CucumberAPITesting/CucumberAPITesting/src/test/java/resources/global.properties");
        prop.load(fis);
      return  prop.getProperty(key);

    }

    public Object getJsonPath(Response response, String key) {
        String resp=response.asString();
       JsonPath js  =new JsonPath(resp);
      return js.get(key).toString(); //when return key, your return type will be object

    }


 //   2 ways to invoke method without object : inherit that method or make it static
}
