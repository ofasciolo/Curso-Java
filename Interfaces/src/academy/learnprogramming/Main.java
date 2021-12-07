package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        Telephone ornesPhone;
        ornesPhone = new DeskPhone(123456);
        ornesPhone.powerOn();
        ornesPhone.callPhone(123456);
        ornesPhone.answer();

        ornesPhone = new MobilePhone(23456);
        ornesPhone.powerOn();
        ornesPhone.callPhone(23456);
        ornesPhone.answer();
    }
}
