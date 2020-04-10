package fe_x_1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyArraysTest {

    @Test
    void testToStringNull() {
        assertEquals("null",MyArrays.toString(null));
    }

    @Test
    void testToStringNested() {
        assertEquals("[[1, 2], [3, 4]]",MyArrays.toString(new int[][]{{1,2},{3,4}}));
    }
}