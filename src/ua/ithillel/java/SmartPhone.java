package ua.ithillel.java;

public class SmartPhone extends Mobile implements Caller, EmailSender {

    private String os;

    public SmartPhone() {
    }

    public SmartPhone(String name, int id, int simCount, double display, String os) {
        super(name, id, simCount, display);
        this.os = os;
    }

    void runApp() {
        System.out.println("Выбираем необходимое приложение, нажимаем на иконку приложение. Приложение запускаеться");
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    @Override
    public void call(String contact) {
        System.out.println("Выполняется вызов контакта: " + contact);
    }

    @Override
    public String editMail(String eMail) {
        System.out.println("Введенный email: " + eMail);
        return eMail;
    }

    @Override
    public String createMail(String msg) {
        System.out.println("Текст сообщения: " + msg);
        return msg;
    }

    @Override
    public void sendMail(String address) {
        System.out.println("Cообщение отправленно по адрессу: " + address);
    }

}
