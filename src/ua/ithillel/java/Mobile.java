package ua.ithillel.java;

public class Mobile extends Phone {

    private int simCount;
    private double display;

    public Mobile() {
    }

    public Mobile(String name, int id, int simCount, double display) {
        super(name, id);
        this.simCount = simCount;
        this.display = display;
    }

    @Override
    void powerOn() {
        System.out.println("Зажимаем кнопку включения. Мобильный телефон запускается");
    }

    @Override
    void powerOff() {
        System.out.println("Зажимаем кнопку включения. Мобильный телефон выключается");
    }

    @Override
    void call() {
        System.out.println("Выбираем контакт из списка контактов, звоним");
    }

    public int getSimCount() {
        return simCount;
    }

    public void setSimCount(int simCount) {
        this.simCount = simCount;
    }

    public double getDisplay() {
        return display;
    }

    public void setDisplay(double display) {
        this.display = display;
    }
}
