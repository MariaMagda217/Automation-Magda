package Tema8.Exercise9;

public class UserMain {
    public void main(String[] args) {
        User user = new User(" Magda ", "002244");

        LoginService service = new LoginService();
        service.login(user);

    }
}
