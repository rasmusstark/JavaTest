package Vecka2Övningar;

public class Dog {

    private String name;
    private String breed;
    //Lägg till ett attribut age för hundens ålder.
    private int age;

    //Konstruktorn ska ta in namnet och rasen på hunden.
    public Dog(String name, String breed, int age) {
        this.name = name;
        this.breed = breed;
        this.age = age;


    }



    // Skapa en metod bark som skriver ut ”Voff!".
    public void bark() {
        System.out.println("Voff!");
    }

public int getHumanAge() {
       age = age * 7;
        return age;
}
    // Skapa ett Dog-objekt i main och låt det skälla.

}
