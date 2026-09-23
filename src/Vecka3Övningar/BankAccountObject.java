package Vecka3Övningar;

public class BankAccountObject {

    public static void main(String[] args) {


        BankAccount bankAccount1 = new BankAccount(100,"sparkontot");



        bankAccount1.setBalance(200);
        bankAccount1.withdraw(250);
        System.out.println("Saldot på " + bankAccount1.getName() + " är " + bankAccount1.getBalance() + " Kronor. ");

    }



}
