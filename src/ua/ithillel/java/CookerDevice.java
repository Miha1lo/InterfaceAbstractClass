package ua.ithillel.java;

public abstract class CookerDevice extends AbstractDevice {

    public CookerDevice() {
    }

    public CookerDevice(String name, int id) {
        super(name, id);
    }

    abstract void cook();

    @Override
    void powerOn() {
        System.out.println("Втыкаем вилку питания в розетку, печь включается.");
    }

    @Override
    void powerOff() {
        System.out.println("Извлекаем вилку питания из розетку, печь отключается.");
    }
}
