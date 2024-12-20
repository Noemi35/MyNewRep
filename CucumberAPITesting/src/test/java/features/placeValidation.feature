  Feature: Validation Place API's
    @AddPlace
  Scenario Outline: Verifying if Place is being successfully added using AddPlaceAPI
    Given Add place Payload with "<name>" "<language>" "<address>"
#    values set with the examples
    When user calls "AddPlaceApi" using "POST" http request
    Then the API call is successful with status code 200
    And "status" in response body is "OK"
    And "scope" in response body is "APP"
    And verify place_Id created maps to "<name>" using "getPlaceApi"
#    GetPlaceApi=resource
#    with quotes with add parameters, to be able to change with other variables


    Examples:
      | name   | language | address                |
      | house  | Spanish  | World Business Center  |
#      | bhouse | English  | World Business Centrum |
@DeletePlace
Scenario: Verify if Delete Place functionality is working
  Given DeletePlace Payload
  When user calls "deletePlaceApi" using "POST" http request
  Then the API call is successful with status code 200
  And "status" in response body is "OK"