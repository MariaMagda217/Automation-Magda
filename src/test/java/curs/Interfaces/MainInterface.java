package curs.Interfaces;

public class MainInterface {
    public static void main(String[] args) {
        LoginPage loginPage = new LoginPage();

        loginPage.enterUsername("Amalia");

        loginPage.enterPassword("Password");

        loginPage.clickLogin();
    }
}
