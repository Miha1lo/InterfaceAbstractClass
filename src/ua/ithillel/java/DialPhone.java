package ua.ithillel.java;

public class DialPhone extends Phone implements Caller {

    private boolean hasAnswerphone;

    public DialPhone() {
    }

    public DialPhone(String name, int id, boolean hasAnswerphone) {
        super(name, id);
        this.hasAnswerphone = hasAnswerphone;
    }

    @Override
    void powerOn() {
        System.out.println("Подключаем стационарный телефон к сети.");
    }

    @Override
    void powerOff() {
        System.out.println("Отключаем стационарный телефон от сети.");
    }

    @Override
    void call() {
        System.out.println("Поднимаем трубку, набираем номер, звоним.");
    }

    void AutoAnswer(boolean hasAnswerphone) {
        if (hasAnswerphone) {
            System.out.println("Нажимаем кнопку автоответчика, прослушиваем сообщения пропущеных звонков.");
        } else {
            System.out.println("Данное устройство не поддверживает автоответчик");
        }
    }

    public boolean isHasAnswerphone() {
        return hasAnswerphone;
    }

    public void setHasAnswerphone(boolean hasAnswerphone) {
        this.hasAnswerphone = hasAnswerphone;
    }

    @Override
    public void call(String contact) {

    }
}
