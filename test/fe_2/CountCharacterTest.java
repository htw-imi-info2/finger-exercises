package fe_2;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.*;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class CountCharacterTest {

    CountCharacter cc = new CountCharacter();

    @ParameterizedTest
    @CsvSource({ "l,2,hallo","a,1,hallo","x,0,hallo","a,1,a","b,0,c"})
    void testCount(char c, int count, String s) {
        assertEquals(count, cc.countCharacter(s,c));
    }
    @ParameterizedTest
    @EmptySource
    void testEmptyValues(String s) {
        assertEquals(0, cc.countCharacter(s,'x'));
    }
}