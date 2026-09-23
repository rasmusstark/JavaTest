package inlamningsuppgift;

public class Counter {

    int totalCharacters = 0;
    int totalRows = 0;

    public void addRowsAndCharacters(String text) {
        totalRows++;
        totalCharacters += text.length();
    }

    public int getCharacters(){
        return totalCharacters;
    }

    public int getRows(){
        return totalRows;
    }
}
