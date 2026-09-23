package Vecka2Övningar;

public class Student {

    String name;
    int ageKurs;

    public Student(String myName, int myAgeKurs) {
        this.name = myName;
        this.ageKurs = myAgeKurs;

    }

    public void promote() {
        ageKurs++;
    }

    public void writeAgeKurs() {
        System.out.print(name + " går i årskurs " + ageKurs + " och går på ");
        if (ageKurs >= 1 && ageKurs <= 3) {
            System.out.println(name + " Lågstadiet ");
        } else if (ageKurs >= 4 && ageKurs <= 6) {
            System.out.println("Mellanstadiet");
        } else if (ageKurs >= 7 && ageKurs <= 9) {
            System.out.println("Högstadiet");
        }
    }
}


//Konstruktorn ska ta in namn och årskurs.
//Skapa en metod promote som ökar årskursen med 1.
// Skapa en metod som skriver ut vilket stadie man går på (Lågstadiet, mellanstadiet osv.)
// Skapa ett Student-objekt och låt det gå upp en årskurs i main-metoden.
// Skriv ut årskurs och stadie ifrån mainmetoden.


