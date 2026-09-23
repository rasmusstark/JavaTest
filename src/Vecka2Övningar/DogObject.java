package Vecka2Övningar;

public class DogObject {
    public static void main(String[] args) {

       Dog dog1 = new Dog("Nacho","tax", 2);
       Dog dog2 = new Dog("Dobbie","Chihuahua", 3);
       Dog dog3 = new Dog("Sam","Chow Chow", 8);


        System.out.println(dog1.getHumanAge());
        System.out.println(dog2.getHumanAge());
        System.out.println(dog3.getHumanAge());
    }
}





//Skapa en metod som gör att du kan uppdatera hundens ålder.
//Skapa en metod getHumanAge som returnerar hundens ålder omvandlad till människoår (multiplicera med 7).
//Testa metoden i main-metoden.
