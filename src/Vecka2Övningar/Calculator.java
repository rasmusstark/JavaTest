package Vecka2Övningar;

public class Calculator {

    int tal1;
    int tal2;

    public Calculator(int myTal1, int myTal2) {
        this.tal1 = myTal1;
        this.tal2 = myTal2;

    }
    public int addition(){
        return tal1 + tal2;
    }

    public int subtraction(){
        return tal1 - tal2;
    }

    public int multiplication(){
        return tal1 * tal2;
    }

    public int division(){
        return tal1 / tal2;

    }
}
