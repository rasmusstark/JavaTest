package Vecka1Övningar;

public class Exercise03 {
    public static void main(String[] args) {

        //Skapa ett program där antal timmar är definierad i en variabel.
        // Programmet beräknar och skriver ut hur mycket det blir
        // omvandlat till minuter resp. sekunder
        // 3 timmar blir
        //180 minuter
        //10800 sekunder

        int hours = 78;

        int minutes = hours * 60;
        int seconds = hours * 60 * 60;
        System.out.println(hours + " hours is " + minutes + " minutes.");
        System.out.println(hours + " hours is " + seconds + " seconds.");

    }
}
