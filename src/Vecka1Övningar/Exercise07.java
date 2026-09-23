package Vecka1Övningar;

public class Exercise07 {
    public static void main(String[] args) {

        //Skapa ett program som beräknar vad du ska betala för en tank bensin. Indata är antal
        //liter, pris per liter och eventuell rabatt i procent. Utdata är priset som du ska betala.
        //Indatan kan vara definierade i variabler

        double liter = 30;
        double pris = 15;
        double rabatt = 5;

        double kostnad = liter * pris;
        double kostnadrabatt = kostnad * rabatt / 100;
        double betala = kostnad -  kostnadrabatt;
        System.out.println(betala);

    }
}
