package day03;

import org.testng.annotations.Test;
import utilities.ApiCalls;

public class C08_GetDynamicRequestJsonPath {

    ApiCalls apiCalls = new ApiCalls();

    // We can test all data one by one
    @Test
    public void checkUserID6ReqresIn(){
        apiCalls.checkUserExistWithIDReqresInJsonPath(6,200,
                "charles.morris@reqres.in","Charles","Morris");
    }
    @Test
    public void checkUserID5ReqresIn(){
        apiCalls.checkUserExistWithIDReqresInJsonPath(5,200,
                "charles.morris@reqres.in","Charles","Morris");
    }

    @Test
    public void checkUserID4ReqresIn(){
        apiCalls.checkUserExistWithIDReqresInJsonPath(4,200,
                "charles.morris@reqres.in","Charles","Morris");
    }

    @Test
    public void checkUserID3ReqresIn(){
        apiCalls.checkUserExistWithIDReqresInJsonPath(3,200,
                "charles.morris@reqres.in","Charles","Morris");
    }
    @Test
    public void checkUserID2ReqresIn(){
        apiCalls.checkUserExistWithIDReqresInJsonPath(2,200,
                "charles.morris@reqres.in","Charles","Morris");
    }
    @Test
    public void checkUserID1ReqresIn(){
        apiCalls.checkUserExistWithIDReqresInJsonPath(1,200,
                "charles.morris@reqres.in","Charles","Morris");
    }


    // we can also verify this information with data provider
    // Create a class with name TestData
}
