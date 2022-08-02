package ua.ithillel.java;

public class Multicooker extends CookerDevice {

    public Multicooker() {
    }

    public Multicooker(String name, int id) {
        super(name, id);
    }

    void switchProgram(int num) {
        System.out.println("Выбираем программу приготовление под номером: " + num);
    }

    @Override
    void cook() {
        System.out.println("Размещаем продукты в емкость приготовления. Нажимаем старт. Выполняется приготовлние пищи");
    }
}
