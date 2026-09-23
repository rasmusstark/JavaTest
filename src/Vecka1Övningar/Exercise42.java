package Vecka1Övningar;

public class Exercise42 {
    public static void main(String[] args) {

        //En man erbjuds ett ovanligt riskfyllt arbete. Lönesättningen är också ovanlig. För
        //första dagen erbjuds han 1 öre, för andra dagen 2 öre, för tredje dagen 4 öre osv. Lönen
        //fördubblas alltså varje dag. Skapa ett program som beräknar hur många dagar mannen
        //måste arbeta för att tjäna en miljon kronor

        int total = 0;
        //number = 0
        int number = 0;

        //total > 50 -> avbryta
        //total <= 50 -> fortsätta
        while(total <= 50) {
            number++;

            total += number;

            System.out.println("Number: " + number);
            System.out.println("Total: " + total);
        }
    }
}
