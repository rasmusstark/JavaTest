package inlamningsuppgift;

public class Counter {

    //Attribut för klassen Counter
    int totalCharacters = 0;
    int totalRows = 0;
    int totalWords = 0;
    String longestWord = "";

    //Metod för att beräkna rader, tecken och ord. Ökar värdena i attributen tills användaren skriver stop
    public void countRowsCharactersAndWords(String text) {
        totalRows++;
        totalCharacters += text.length();
        totalWords += text.trim().split("\\s+").length;
    }

    //Metod för att hitta det längsta ordet i texten
    //Här skapas en array words, som körs i en for-loop för att hitta det längsta ordet
    public void findLongestWord(String text) {
        String [] words = text.trim().split("\\s+");

        for (int i = 0; i < words.length; i++) {
            if (words[i].length() > longestWord.length()) {
                longestWord = words[i];
            }
        }
    }

    //Metod för att ta reda på om användaren har skrivit stop och då returnera isStop=true
    public boolean checkForStop(String text) {

        boolean isStop = false;

        if (text.equalsIgnoreCase("stop")) {
            isStop = true;
        }
        return isStop;
    }

    //Metod för att returnera det totala antalet tecken
    public int getTotalCharacters(){
        return totalCharacters;
    }

    //Metod för att returnera det totala antalet rader
    public int getTotalRows(){
        return totalRows;
    }

    //Metod för att returnera det totala antalet ord
    public int getTotalWords(){
        return totalWords;
    }

    //Metod för att returnera det längsta ordet
    public String getLongestWord() {
        return longestWord;
    }

}
