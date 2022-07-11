package Level1;

import Level1.Task1.Task1FindingUniqValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task1FindingUniqValuesTest {

    @Test
    void methodFindUnikValus() {
        Task1FindingUniqValues task1FindingUniqValues = new Task1FindingUniqValues();
        int [] TestArr = new int[]{1,4,5,1,1,3};
        int Actual = task1FindingUniqValues.MethodFindUnikValus(TestArr);
        int expected = 4;
        assertEquals(expected, Actual);
    }
}