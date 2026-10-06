package inlamningsuppgift;

import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertEquals;


public class TestCounter {

    //Testar att det totala antalet tecken är korrekt
    @Test
    public void testTotalCharacters() {

        Counter counter = new Counter();
        counter.countRowsCharactersAndWords("Hej jag heter Rasmus");

        int expected = 20;
        int actual = counter.getTotalCharacters();

        assertEquals(expected, actual);
}

    //Testar att det totala antalet tecken räknas ihop korrekt vid flera rader
    @Test
    public void testTotalCharactersMultipleRows() {
        Counter counter = new Counter();
        counter.countRowsCharactersAndWords("Hej jag heter Rasmus");
        counter.countRowsCharactersAndWords("Jag bor i Stockholm");
        counter.countRowsCharactersAndWords("Hej då");

        int expected = 45;
        int actual = counter.getTotalCharacters();

        assertEquals(expected, actual);
    }

    //Testar en tom textrad
    @Test
    public void testEmptyRow() {
        Counter counter = new Counter();
        counter.countRowsCharactersAndWords("");

        assertEquals(1, counter.getTotalRows());
        assertEquals(0, counter.getTotalCharacters());

    }

    //Testar att metoden chekForStop returnerar true när användaren skriver STOP
    @Test
    public void testStopWordReturnsTrue() {
        Counter counter = new Counter();
        boolean expected = true;
        boolean actual = counter.checkForStop("STOP");

        assertEquals(expected, actual);
    }

    //Testar att metoden findLongestWord returnerar det längsta ordet
    @Test
    public void testLongestWord() {
        Counter counter = new Counter();
        counter.findLongestWord("Hej jag heter Rasmus");

        String expected = "Rasmus";
        String actual = counter.getLongestWord();

        assertEquals(expected, actual);
    }
}
