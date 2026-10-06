package inlamningsuppgift;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Skapar ett Scanner-objekt som gör det möjligt att läsa in användarens input
        Scanner scan = new Scanner(System.in);

        //Skapar ett objekt från klassen Counter
        Counter counter = new Counter();

        System.out.println("Skriv in valfri text!");

        //While-loop för avbryta programmet när användaren skriver stop
        while (true) {
            String text = scan.nextLine();

            if (counter.checkForStop(text)) {
                break;
            }

        //Så länge användaren inte skriver stop, anropas metoderna nedan
            counter.countRowsCharactersAndWords(text);
            counter.findLongestWord(text);
        }

        //Skriver ut den beräknade informationen om texten
        System.out.println("Antal tecken:  " + counter.getTotalCharacters());
        System.out.println("Antal rader: " + counter.getTotalRows());
        System.out.println("Antal ord: " + counter.getTotalWords());
        System.out.println("Längsta ordet: " + counter.getLongestWord());


    }
}
