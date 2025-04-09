public class UserService {
    public String getUserName() {
        return "John Doe";
    }

    public String login (String userName, String password){
        return "Login successfull for: "+ userName;
    }

    public String security (String userName, String password){
        return "security successfull for: "+ userName;
    }


}
