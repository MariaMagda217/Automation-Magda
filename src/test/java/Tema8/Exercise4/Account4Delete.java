package Tema8.Exercise4;

public class Account4Delete extends Account4 {
    public static void main(String[] args) {

        AdminAccount4 admin = new AdminAccount4();

        admin.setUsername("MyAdmin");
        admin.login();
        admin.deleteUser("Ernest");

    }

}
