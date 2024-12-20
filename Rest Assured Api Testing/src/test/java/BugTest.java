import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

import java.io.File;

import static io.restassured.RestAssured.given;

public class BugTest {

    public static void main(String[] args) {
      RestAssured.baseURI = "https://noemipohrib.atlassian.net";
        String createIssueResponse=  given().header("Content-Type", "application/json")
                .header("Authorization", "Basic bm9lbWkucG9ocmliQGdtYWlsLmNvbTpBVEFUVDN4RmZHRjBxakZ1Z2I3b2d5LTlWV1o2dTRkM0swbUF6VVp4NVdxcy01VlJpUEhfbnJuckoyZUtudkx1eFRDTHg1TmFLN0pjaDZkdTQxbHpUMzdzT2c0Y2toM3ctN0Z1X2EwOS1xT3U2Y21Obmt4TFRTX0NXbHRuVFg2Q1pmaWZ5SFpZd25teVp2c19ESkFCMklSNUt0WnNsXzRWbEJra1lhZXlVSHp0UnluMnF5YmpSemM9NDhDOTYyQzg=")
                .body("{\n" +
                        "    \"fields\": {\n" +
                        "       \"project\":\n" +
                        "       {\n" +
                        "          \"key\": \"SCRUM\"\n" +
                        "       },\n" +
                        "       \"summary\": \"Website items are not working as expected-automation\",\n" +
                        "       \"issuetype\": {\n" +
                        "          \"name\": \"Bug\"\n" +
                        "       }\n" +
                        "   }\n" +
                        "}")
                .log().all()
                .post("rest/api/2/issue").then().log().all().assertThat().statusCode(201).extract().response().asString();

        JsonPath js=new JsonPath(createIssueResponse);
        String issueId= js.getString("id");
        System.out.println(issueId);

        given()
                .pathParam("key", issueId)
                .header("X-Atlassian-Token", "no-check" )
                .header("Authorization", "Basic bm9lbWkucG9ocmliQGdtYWlsLmNvbTpBVEFUVDN4RmZHRjBxakZ1Z2I3b2d5LTlWV1o2dTRkM0swbUF6VVp4NVdxcy01VlJpUEhfbnJuckoyZUtudkx1eFRDTHg1TmFLN0pjaDZkdTQxbHpUMzdzT2c0Y2toM3ctN0Z1X2EwOS1xT3U2Y21Obmt4TFRTX0NXbHRuVFg2Q1pmaWZ5SFpZd25teVp2c19ESkFCMklSNUt0WnNsXzRWbEJra1lhZXlVSHp0UnluMnF5YmpSemM9NDhDOTYyQzg=")
                .multiPart("file", new File("/home/noemi/Downloads/cart price issue_multiple gift cards.png")).log().all()
                .post("rest/api/2/issue/{key}/attachments").then().log().all().assertThat().statusCode(200);
        //Add attachments

    }
}



