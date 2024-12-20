package resources;

import pojo.AddPlaceSerialization;
import pojo.Location;

import java.util.ArrayList;
import java.util.List;

public class TestDataBuilder {

    public AddPlaceSerialization addPlacePayload(String name, String language, String address) {
        AddPlaceSerialization addplace=new AddPlaceSerialization();
        addplace.setAccuracy(50);
        addplace.setAddress(address);
        addplace.setName(name);
        addplace.setLanguage(language);
        addplace.setPhone_number("0744267867");
        addplace.setWebsite("https://rahulshettyacademy.com");
        List<String> myList=new ArrayList<>();
        myList.add("shoe park");
        myList.add("shoes");
        addplace.setTypes(myList);
        Location l=new Location();
        l.setLat(123445.4677);
        l.setLng(244.577);
        addplace.setLocation(l);
        return addplace;
    }

    public String deletePlacePayload(String placeId) {
        return "{\r\n\"place_id\": \""+placeId+"\"\r\n}";
    }
}
