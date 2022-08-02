package ua.ithillel.java;

public class AbstractClassTest {
    public static void main(String[] args) {

        Mobile mobilePhone = new Mobile();
        mobilePhone.setName("Nolia 3300");
        mobilePhone.setId(9379992);
        mobilePhone.setDisplay(3.5);
        mobilePhone.setSimCount(2);
        mobilePhone.call();

        System.out.println("=============");

        DialPhone simplePhone = new DialPhone();
        simplePhone.setName("Philips");
        simplePhone.setId(138764145);
        simplePhone.call();
        simplePhone.AutoAnswer(true);

        System.out.println("=============");

        SmartPhone iPhone = new SmartPhone();
        iPhone.setName("iPhone 13 PRO MAX");
        iPhone.setId(7851982);
        iPhone.setDisplay(6.0);
        iPhone.setSimCount(1);
        iPhone.call();

        System.out.println("=============");

        Multicooker device1 = new Multicooker();
        device1.setName("REDMOND");
        device1.setId(121684);
        device1.switchProgram(2);
        device1.cook();

        System.out.println("=============");

        Oven device2 = new Oven();
        device2.setName("Vestfrost");
        device2.setId(8432145);
        device2.initTimer(200);
        device2.cook();

        System.out.println("=============");

        getDevices(mobilePhone, simplePhone, iPhone, device1, device2);
    }

    public static void getDevices(AbstractDevice... values) {
        for (AbstractDevice value : values) {
            value.powerOff();
        }
    }
}
