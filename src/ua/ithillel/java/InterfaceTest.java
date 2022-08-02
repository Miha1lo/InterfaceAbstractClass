package ua.ithillel.java;

public class InterfaceTest {
    public static void main(String[] args) {

        DialPhone simplePhone1 = new DialPhone();
        simplePhone1.setName("Philips");
        simplePhone1.setId(138764145);
        simplePhone1.call("Ann: +38204865...");
        simplePhone1.AutoAnswer(true);


        SmartPhone iPhone = new SmartPhone();
        iPhone.setName("iPhone 13 PRO MAX");
        iPhone.setId(7851982);
        iPhone.setDisplay(6.0);
        iPhone.setSimCount(1);
        iPhone.call("Mike: +3813250...");
        iPhone.createMail("Hello...");
        iPhone.editMail("qwe@gmail.com");

        System.out.println("=============");

        Post object1 = new Post();
        object1.createMail("Hello. How are you?");

        System.out.println("=============");

        msgSender(iPhone, object1);


    }

    public static void msgSender(MailSender... values) {
        for (MailSender value : values) {
            value.sendMail("qwe@gmail.com");
        }
    }
}
