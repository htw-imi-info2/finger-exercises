package fe_x_2;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

public interface PalindromeTest<T extends Palindrome> {

    Palindrome getImplementation();

    /**
     * mostly copied from https://junit.org/junit5/docs/current/user-guide/#writing-tests-parameterized-tests
     * @param candidate
     */
    @ParameterizedTest
    @ValueSource(strings = { "racecar", "radar", "able was I ere I saw elba", "12321", "123321"})
    default void palindromes(String candidate) {
        assertTrue(getImplementation().isPalindrome(candidate));
    }

    @ParameterizedTest
    @ValueSource(strings = { "" , "x", "aa"})
    default void palindromesShortStrings(String candidate) {
        assertTrue(getImplementation().isPalindrome(candidate));
    }



    @ParameterizedTest
    @ValueSource(strings = { "rentner", "racecar", "lagerregal", "dogeeseseegod", "dammitimmad"})
    default void palindromesFromWebPage(String candidate) {
        assertTrue(getImplementation().isPalindrome(candidate));
    }


    @ParameterizedTest
    @ValueSource(strings = {"Do Geese See God", "Dammit, I’m Mad"})
    default void palindromesFromWebPageWithPunctationsAreNotPalindromes(String candidate) {
        assertFalse(getImplementation().isPalindrome(candidate));
    }

    @ParameterizedTest
    @ValueSource(strings = { "racecars", "hallo", "able was I ere I saw elb" ,"ba"})
    default void noPalindromes(String candidate) {
        assertFalse(getImplementation().isPalindrome(candidate));
    }

}