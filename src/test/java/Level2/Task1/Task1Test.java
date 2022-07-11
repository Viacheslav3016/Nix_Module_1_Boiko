package Level2.Task1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task1Test {

    @Test
    void main() {
        String actual = "[]{}";
        String expected = "Действительна";
        assertEquals(expected,actual);

        String actual2 = "{]kj{},m";
        String expected2 = "Недействительна";
        assertEquals(expected2, actual2);

        String actual3 = null;
        String expected3 = "Действительна";
        assertEquals(expected3, actual3);
    }
}