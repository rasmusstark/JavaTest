package inlamningsuppgift;

import java.util.Scanner;


public class InlamningsuppgiftDel2 {
    public static void main(String[] args) {

       Scanner scan = new Scanner(System.in);
       System.out.println("Skriv in valfri text!");

        int antalTecken = 0;
        int antalRader = 0;


        while(true){
            String text = scan.nextLine();

            if(text.equalsIgnoreCase("stop")){
                break;
            }

            antalTecken += text.length();
            antalRader ++;


    }
        System.out.println("Antal tecken:  " + antalTecken);
        System.out.println("Antal rader: " + antalRader);
}
}
