package Vecka3Övningar;

public class BankAccount {

    private double balance;
    private String name;

    public BankAccount(double balance, String name){
        this.balance = balance;
        this.name = name;
    }

    public double getBalance(){
        return balance;
    }

    public String getName(){
        return name;
    }

    public void setBalance(double balance){
        this.balance = balance;
    }

    public void deposit(double deposit){
        this.balance += deposit;
    }

    public void withdraw(double withdraw){
        if (withdraw <= balance){
            this.balance -= withdraw;
        } else {
            System.out.println("Uttag ej möjligt");
        }


}
}
