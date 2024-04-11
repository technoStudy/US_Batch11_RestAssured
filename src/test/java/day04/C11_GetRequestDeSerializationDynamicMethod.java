package day04;

import org.testng.annotations.Test;
import utilities.ApiCalls;

public class C11_GetRequestDeSerializationDynamicMethod {


    ApiCalls apiCalls = new ApiCalls();
    @Test
    public void bookingTestWithDeSerialization(){

      apiCalls.derSerializationMethodForHerokuapBooking(721,200,"Josh","Allen", 111.0
      ,true,"2018-01-01","2019-01-01","super bowls");
    }
}
