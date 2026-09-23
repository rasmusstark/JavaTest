package Vecka3Övningar;

public class Lamp {

    private boolean isOn;

    public Lamp(boolean isOn) {
        this.isOn = isOn;

    }

    public void turnOn (){
        isOn = true;
    }

    public void turnOff (){
        isOn = false;

    }

    public boolean getIsOn (){
        return isOn;

    }
}
