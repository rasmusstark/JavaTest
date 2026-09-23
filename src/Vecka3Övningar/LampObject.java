package Vecka3Övningar;

public class LampObject {
    public static void main(String[] args) {
        Lamp lamp1 = new Lamp(true);

        //System.out.println(lamp1.turnOn());
        lamp1.turnOff();
        System.out.println(lamp1.getIsOn());
        lamp1.turnOn();
        System.out.println(lamp1.getIsOn());
        lamp1.turnOff();
        System.out.println(lamp1.getIsOn());



    }
}
