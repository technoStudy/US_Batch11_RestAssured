package utilities;

import org.testng.annotations.DataProvider;

import java.util.HashMap;

public class TestData {

    @DataProvider(name = "userDataProvider")
    public Object[][] createUserData() {
        return new Object[][]{
                {1, 200, "george.bluth@reqres.in", "George", "Bluth"},
                {2, 200, "janet.weaver@reqres.in", "Janet", "Weaver"},
                {3, 200, "emma.wong@reqres.in", "Emma", "Wong"},
                {4, 200, "eve.holt@reqres.in", "Eve", "Holt"},
                {5, 200, "charles.morris@reqres.in", "Charles", "Morris"},
                {6, 200, "tracey.ramos@reqres.in", "Tracey", "Ramos"}
        };
    }


    // Hash Map method for the test data
    public HashMap<String, Object> verifyUserReqresIn() {
        HashMap<String, Object> expectedData = new HashMap<>();
        expectedData.put("id", 2);
        expectedData.put("email", "janet.weaver@reqres.in");
        expectedData.put("first_name", "Janet");
        expectedData.put("last_name", "Weaver");
        return expectedData;
    }


}
