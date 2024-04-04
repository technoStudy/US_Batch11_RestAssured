package utilities;

public class BaseUrl {

    // we will keep all url in this class within a string method

    public String reqresUsersID(int id){
        String url = "https://reqres.in/api/users/"+id;
        return url;
    }
    public String bookingUsersID(int id){
        String url = "https://restful-booker.herokuapp.com/booking/"+id;
        return url ;
    }



}
