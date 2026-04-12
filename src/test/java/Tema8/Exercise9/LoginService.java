package Tema8.Exercise9;

public class LoginService {
    public void login(User user) {
        System.out.println("Logging in with:");
        System.out.println("Username: " + user.getUserName());
        System.out.println("Password: " + user.getPassword());
    }

}
