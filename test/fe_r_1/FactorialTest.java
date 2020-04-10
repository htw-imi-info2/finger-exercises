package fe_r_1;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public interface FactorialTest<F extends Factorial> {
    Factorial getFactorial();


     static Stream<Arguments> factorials() {
        return Stream.of(
                Arguments.of(0,1),
                Arguments.of(1,1),
                Arguments.of(2,2),
                Arguments.of(3,6),
                Arguments.of(4,24),
                Arguments.of(5,120),
                Arguments.of(6,720),
                Arguments.of(7,5040),
                Arguments.of(8,40320),
                Arguments.of(9,362880),
                Arguments.of(10,3628800),
                Arguments.of(11,39916800),
                Arguments.of(12,479001600),
                Arguments.of(13,6227020800L),
                Arguments.of(14,87178291200L),
                Arguments.of(15,1307674368000L),
                Arguments.of(16,20922789888000L),
                Arguments.of(17,355687428096000L),
                Arguments.of(18,6402373705728000L),
                Arguments.of(19,121645100408832000L)
        );
    }

    @ParameterizedTest
    @MethodSource("factorials")
    default void fac(int n, long factorial) {
        assertEquals(factorial, getFactorial().fac(n));
    }

}
