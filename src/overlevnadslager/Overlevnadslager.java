package overlevnadslager;

public class Overlevnadslager {
    public static void main(String[] args) {

        //skapa varibler för energy, food och water.
        //Alla varibler ska ha ett startvärde mellan 0-100
        //programmet ska simulera 10 dagar
        //varje dag ska följande ske
        //Vatten
        //Personen använder vatten varje dag. Om vattennivån blir låg påverkar det hur mycket mat som behövs för att klara dagen.
        //Bestäm själv hur mycket vatten som spelaren förlorar varje dag.
        //Mat
        //Personen använder mat varje dag. Om vattennivån är låg behöver personen äta mer mat än vanligt.
        //Bestäm ett uttryck som beror på vattennivån och som gör att maten minskar.
        //Energi
        //Personen förlorar energi varje dag.
        //Hur mycket energi som försvinner beror på hur mycket mat och vatten personen har.
        //Skapa en beräkning för hur energin minskar beroende på både mat och vatten.
        //Personen förlorar 10 vatten varje dag

        int energi = 100;
        int mat = 100;
        int vatten = 100;

        for(int dag = 0; dag <= 10; dag++){
            System.out.println(dag);
        }
        if(energi > mat){

        }
    }
}
