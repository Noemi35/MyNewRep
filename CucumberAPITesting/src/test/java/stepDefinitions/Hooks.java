package stepDefinitions;

import io.cucumber.java.Before;


import java.io.IOException;

public class Hooks {
    @Before("@DeletePlace")
    public void beforeScenario() throws IOException {
        //write a code that will give you place id
        //execute this code only when place id is null

        StepDefinitions m=new StepDefinitions();  //applicable for delete ; when the method is static belongs to object memory call with m; if it is static variable is with class name only
        if(m.place_id==null) {
            m.add_place_payload_with("Sheety", "Espanol", "South 34");
            m.user_calls_using_http_request("AddPlaceApi", "POST");
            m.verify_place_id_created_maps_to_using("Sheety", "getPlaceApi");

        }

    }

}
