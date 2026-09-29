package inlamningsuppgift;

import Vecka4Övningar.User;
import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertEquals;

public class TestCounter {

    @Test
    public void testTotalCharacters() {

        Counter counter = new Counter();
        counter.addRowsAndCharacters("Hej jag heter Rasmus");

        int expected = 20;
        int actual = counter.getCharacters();

        assertEquals(expected, actual);
}

    @Test
    public void testTotalCharactersMultipleRows() {
        Counter counter = new Counter();
        counter.addRowsAndCharacters("Hej jag heter Rasmus");
        counter.addRowsAndCharacters("Jag bor i Stockholm");
        counter.addRowsAndCharacters("Hej då");

        int expected = 45;
        int actual = counter.getCharacters();

        assertEquals(expected, actual);
    }

    @Test
    public void testEmptyRow() {
        Counter counter = new Counter();
        counter.addRowsAndCharacters("");

        assertEquals(1, counter.getRows());
        assertEquals(0, counter.getCharacters());

    }
}
