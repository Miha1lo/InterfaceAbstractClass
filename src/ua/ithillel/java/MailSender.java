package ua.ithillel.java;

public interface MailSender {

    String createMail(String msg);

    void sendMail(String address);
}
