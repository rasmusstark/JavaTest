package Vecka4Övningar;

import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertEquals;

public class TestUserLogin {

    @Test
    public void testGetUserName() {
        String userName = "";
        String password = "";

        User user1 = new User(userName, password);

        String expected = userName;
        String actual = user1.getUserName();

        assertEquals(expected, actual);
    }

}
