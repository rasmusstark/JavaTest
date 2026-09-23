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
    public void testTotalRows() {

    }
}
