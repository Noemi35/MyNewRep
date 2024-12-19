package files;

import io.cucumber.cienvironment.internal.com.eclipsesource.json.Json;
import io.restassured.path.json.JsonPath;
import org.junit.Assert;

import static io.restassured.RestAssured.given;

public class GraphQlScript {

    public static void main(String args[]) {
        //Query
         int characterId=10727;
        String response=given().log().all().header("Content-type", "application/json").body("{\"query\":\"query ($characterId:Int!) {\\n  character(characterId: $characterId)  {\\n    name\\n    gender\\n  }\\n  \\n  \\n    location(locationId: 15801) {\\n      name\\n    }\\n  \\n  episode (episodeId: 11682) {\\n    name\\n    air_date\\n    episode\\n  }\\n  \\n  characters(filters: {name:\\\"Rahul\\\"}) {\\n    info {\\n      count\\n    }\\n    result {\\n      type\\n      status\\n    }\\n  }\\n  \\n  episodes (filters: {episode: \\\"ABC\\\"}) {\\n    info {\\n      pages\\n      prev\\n    }\\n  }\\n  \\n  \\n  }\\n\",\"variables\":{\"characterId\":"+characterId+"}}\n")
                //inspect->network->payload->view parsed for getting body
                .when().post("https://rahulshettyacademy.com/gq/graphql")
                .then().extract().response().asString();

        System.out.println(response);
        JsonPath js=new JsonPath(response);
       String characterName= js.getString("data.character.name");
        Assert.assertEquals(characterName, "Rahul");

        //Mutations
        String newCharacter="Joey";
        String mutationsResponse=given().log().all().header("Content-type", "application/json").body("  {\"query\":\"mutation ($locationName: String!, $characterName: String!, $episodeName: String!) {\\n  createLocation (location: {name: $locationName, type: \\\"Central America\\\", dimension:\\\"234\\\"} )\\n  {\\n    id\\n  }\\n  \\n  createCharacter (character: {name: $characterName, type:\\\"good\\\", status: \\\"alive\\\", species: \\\"human\\\", gender: \\\"fem\\\", image: \\\"cute\\\", originId: 15792,  locationId:15792 }) {\\n    id\\n  }\\n  \\n  createEpisode (episode: {name: $episodeName, air_date: \\\"Love\\\", episode: \\\"Friends\\\"}) {\\n    id\\n  }\\n  \\n  deleteLocations(locationIds:[15795]) {\\n    locationsDeleted\\n  }\\n}\",\"variables\":{\"locationName\":\"New Zealand\",\"characterName\":\""+newCharacter+"\",\"episodeName\":\"Friends\"}}")
                //inspect->network->payload->view parsed for getting body
                .when().post("https://rahulshettyacademy.com/gq/graphql")
                .then().extract().response().asString();

        System.out.println(mutationsResponse);
        JsonPath js1=new JsonPath(mutationsResponse);
        String createLocation=js.getString("data.episode.name");
        Assert.assertEquals(createLocation, "Friends");


    }
}
