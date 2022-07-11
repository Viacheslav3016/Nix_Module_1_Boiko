package Level1;

import Level1.Task3.Task3FindingSquare;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task3FindingSquareTest {

    @Test
    void findingSquare() {
        Task3FindingSquare task3FindingSquare = new Task3FindingSquare();
        double x1 = 1.5;
        double x2 = 2.5;
        double x3 = 3.5;
        double y1 = 4.5;
        double y2 = 5.5;
        double y3 = 6.5;
        double actual = task3FindingSquare.FindingSquare(x1, x2, x3, y1, y2, y3);
        double expected = 0.0;
        assertEquals(expected, actual);
    }
}