package utilities;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.hamcrest.Matchers;
import org.testng.Assert;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class ApiCalls {
    // we will create dynamic methods from the Response class
    // These methods will return response and we use in the Matchers class

    BaseUrl baseUrl = new BaseUrl();
    public Response checkUserExistWithIDReqresIn(int id,int statuscode,String email,String firstname,String lastname){
        Response response = given().when().get(baseUrl.reqresUsersID(id));
        response.then().assertThat()
                .statusCode(statuscode)
                .contentType("application/json; charset=utf-8")
                .statusLine("HTTP/1.1 200 OK")
                .body("data.id", equalTo(id),
                        "data.email",equalTo(email),
                        "data.first_name",equalTo(firstname),
                        "data.last_name",equalTo(lastname));
        return response;

        // Variables ==>> Values changeable
    }

    public Response checkUserIDIsExist(int id,int statuscode){
        Response response = given().when().get(baseUrl.reqresUsersID(id));
        response.then().assertThat()
                .statusCode(statuscode)
                .contentType("application/json; charset=utf-8")
                .statusLine("HTTP/1.1 200 OK")
                .body("data.id", equalTo(id));
        return response;

    }

    // Create new method to verify data with JsonPath
    public Response checkUserExistWithIDReqresInJsonPath(int id,int statuscode,String email,String firstname,String lastname){

        Response response = given().when().get(baseUrl.reqresUsersID(id));
        response.then()
                .assertThat()
                .statusCode(statuscode)
                .contentType("application/json; charset=utf-8");

        JsonPath actualData = response.jsonPath();
        Assert.assertEquals(actualData.getString("data.email"),email);
        Assert.assertEquals(actualData.getString("data.first_name"),firstname);
        Assert.assertEquals(actualData.getString("data.last_name"),lastname);
        return response;

    }
}
