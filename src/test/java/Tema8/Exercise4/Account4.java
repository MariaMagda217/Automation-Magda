package Tema8.Exercise4;

//Exercițiul 4 –Encapsulare +Moștenire
//Creează:
//-Account →private username +getter/setter +
//metodă login()
//AdminAccount extinde
//Account → metodă deleteUser()

public class Account4 {
    private String username;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void login() {
        System.out.println(username + " has logged in.");
    }
}
