package fe_1;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * This is an example of a Parameterized Test for Count Zeros.
 * Parameterized Tests are a bit more
 * see https://junit.org/junit5/docs/current/user-guide/#writing-tests-parameterized-tests
 */
class CountZerosTestParameterized {

    CountZeros counter = new CountZeros();

    private static Stream<Arguments> provideIntArrays() {
        return Stream.of(
                Arguments.of(7, new int[]{0, 0, 0, 0, 0, 0, 0}),
                Arguments.of(4, new int[]{8, 0, 0, 0, 0}),
                Arguments.of(0, new int[]{8, 5, 4, 6, 7, 3, 2, 1}),
                Arguments.of(0, new int[]{8}),
                Arguments.of(1, new int[]{0}),
                Arguments.of(0, new int[]{})
        );
    }

    @ParameterizedTest
    @MethodSource("provideIntArrays")
    void testCount(int zeroCount, int[] a) {
        assertEquals(zeroCount, counter.countZeros(a));
    }
}