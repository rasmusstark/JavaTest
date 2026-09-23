package Vecka2Övningar;

public class Fruit {
    private String color;
    private String type;


    public Fruit(String myColor, String myType) {
        this.color = myColor;
        this.type = myType;



    }
public void writeColor(){
        System.out.println("Färgen på " + type + " är " + color);

}
}



/*Skapa en class Fruit som beskriver olika frukter

Skapa ett attribut som heter color och som innehåller fruktens färg inskrivet i text.

Definiera ett startvärde för color i konstruktorn

Skapa tre olika Fruit ifrån main-metod i en annan klass FruitSalad

Utöka Fruit så att det kan skriva ut färgen på frukten

Anropa denna metod för de tre frukterna i FruitSalad*/
