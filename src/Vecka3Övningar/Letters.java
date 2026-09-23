package Vecka3Övningar;

public class Letters {

  /*  private char letter;
    private int number;

    public Letters(char letter,int number) {
        this.letter = letter;
        this.number = number;
    }*/

    public char encrypt(char letter, int number) {
        return (char)(letter + number);
    }

}
