package Tema8.Exercise6;

public class EmailNotification extends Notification {
    private String emailAddress;

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public void send() {
        System.out.println("The email was sended to: " + emailAddress);
    }
}
