package inlamningsuppgift;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Counter counter = new Counter();

        System.out.println("Skriv in valfri text!");

        while(true){
            String text = scan.nextLine();

            if(text.equalsIgnoreCase("stop")){
                break;
            }

            counter.addRowsAndCharacters(text);

    }
        System.out.println("Antal tecken:  " + counter.getCharacters());
        System.out.println("Antal rader: " + counter.getRows());


    }
}
