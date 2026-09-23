package Vecka2Övningar;

public class Pet {

    static void main(String[] args) {
    String name = "Åke";
    int hunger = 20;
    int energy = 80;
    int happiness = 70;
    int healthcare;

    healthcare = energy + happiness - hunger;


        System.out.println("Namn: " + name);
        System.out.println("Hunger: " + hunger);
        System.out.println("Energi: " + energy);
        System.out.println("Glädje: " + happiness);
        System.out.println("Välmående: " + healthcare);
        System.out.println();

        for(int day = 1; day <= 7; day++){
            hunger +=5;
            energy -=3;
            System.out.println("Dag " + day);
            System.out.println("Hunger: " + hunger);
            System.out.println("Energi: " + energy);
            System.out.println();


        }
    }




   /* public Pet(String name, int hunger, int energy, int happiness) {
        this.name = name;
        this.hunger = hunger;
        this.energy = energy;
    }*/




}
