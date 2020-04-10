package fe_x_1;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class PairsTest {
    Pairs pairs = new Pairs();
    int[] oneToTen = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    int i = 0;


    @Test
    void countPairs2() {
        int[] a = {1, 2};
        assertEquals(1, pairs.countPairs(a, 3));
        assertEquals(0, pairs.countPairs(a, 4));
    }

    @Test
    void countPairs1() {
        int[] a = {1};
        assertEquals(0, pairs.countPairs(a, 5));
    }

    @Test
    void countPairs3() {
        int[] a = {1, 2, 3};
        assertEquals(0, pairs.countPairs(a, 2));
        assertEquals(1, pairs.countPairs(a, 3));
        assertEquals(1, pairs.countPairs(a, 4));
        assertEquals(1, pairs.countPairs(a, 5));
        assertEquals(0, pairs.countPairs(a, 6));
    }

    @Test
    void countPairs() {
        assertEquals(2, pairs.countPairs(oneToTen, 5));
        assertEquals(4, pairs.countPairs(oneToTen, 9));
    }

    @Test
    void pairs5() {

        int[][] expected = {{1,4},{2,3}};
        int[][] actual = pairs.pairs(oneToTen, 5);

        assertTrue(Arrays.deepEquals(expected, actual),"actual: " + MyArrays.toString(actual));
    }

    @Test
    void pairs9() {

        int[][] expected = {{1,8},{2,7},{3,6},{4,5}};
        int[][] actual = pairs.pairs(oneToTen, 9);

        assertTrue(Arrays.deepEquals(expected, actual),"actual: " + MyArrays.toString(actual));
    }


    @Test
    void countPairsZero() {
        int[] a = {-1, 0, 1};
        assertEquals(1, pairs.countPairsZero(a));
    }

    @Test
    void pairsZero() {
        int[] a = {-2, -1, 0, 1, 2};
        int[][] actual = pairs.pairsZero(a);
        int[][] expected = {{-2, 2}, {-1, 1}};
        for (int i = 0; i < expected.length; i++) {
            assertArrayEquals(expected[i], actual[i]);
        }
    }
}