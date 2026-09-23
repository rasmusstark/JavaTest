package Vecka2Övningar;

public class StudentObject {
    public static void main(String[] args) {
       Student student1 = new Student("Alice",3);
       Student student2 = new Student("Freja",1);

       student1.promote();
       student2.promote();
       student1.writeAgeKurs();
       student2.writeAgeKurs();


    }
}
