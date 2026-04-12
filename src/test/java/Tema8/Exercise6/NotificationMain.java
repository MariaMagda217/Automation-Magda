package Tema8.Exercise6;

public class NotificationMain {
    public static void main(String[] args) {

        EmailNotification email = new EmailNotification();

        email.setEmailAddress("mariaa.magdaa@yahoo.com");
        email.send();

    }
}
