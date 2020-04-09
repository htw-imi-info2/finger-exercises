import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArraySumTest {
    ArraySum sut = new ArraySum();

    @org.junit.jupiter.api.Test
    void sumIterative() {
        assertEquals(23,sut.sumIterative(new int[]{5,3,2,6,7}));
    }

    @org.junit.jupiter.api.Test
    void sumRecursive() {
        assertEquals(27,sut.sumRecursive(new int[]{5,3,2,6,7,4}));
    }
    @Test
    void sumEmptyIt(){
        assertEquals(0,sut.sumIterative(new int[]{}));
    }
    @Test
    void sumEmptyRec(){
        assertEquals(0,sut.sumRecursive(new int[]{}));
    }
}