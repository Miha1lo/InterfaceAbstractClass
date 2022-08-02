package ua.ithillel.java;

public class Oven extends CookerDevice {

    public Oven() {
    }

    public Oven(String name, int id) {
        super(name, id);
    }

    void initTimer(int time) {
        System.out.println("Устанавливаем таймер на " + time + " минут.");
    }

    @Override
    void cook() {
        System.out.println("Размещаем продукты в емкость приготовления. Выполняется приготовлние пищи");
    }
}
