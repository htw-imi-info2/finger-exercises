package fe_1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CountZerosTest {
    CountZeros counter = new CountZeros();

    @Test
    void countZeros() {
        assertEquals(4,counter.countZeros(new int[]{5,3,2,0,4,2,0,6,3,0,0}));

    }
}