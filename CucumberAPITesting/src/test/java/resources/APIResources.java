package resources;
//enum is a special class in java that has a collection of constants and methods
public enum APIResources {
    AddPlaceApi("/maps/api/place/add/json"),
    getPlaceApi("/maps/api/place/get/json"),
    deletePlaceApi("/maps/api/place/delete/json");
private  String resource;
    APIResources(String resource) {
     this.resource=resource; //assign global variable to arg
    }

    public String getResource() {
        return resource; //return private variables
    }
}
