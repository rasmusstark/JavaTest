package Vecka2Övningar;

import java.util.Scanner;

public class CalculatorObject {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Skriv in första talet");
        int num1 = scan.nextInt();
        System.out.println("Skriv in andra talet");
        int num2 = scan.nextInt();



        Calculator reslutat1 = new Calculator(num1,num2);
        Calculator resultat2 = new Calculator(num1,num2);


        System.out.println(reslutat1.addition());
        System.out.println(reslutat1.subtraction());
        System.out.println(reslutat1.division());
        System.out.println(reslutat1.multiplication());





    }
}
