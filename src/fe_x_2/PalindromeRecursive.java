package fe_x_2;

public class PalindromeRecursive implements Palindrome {
    /**
     * The recursive solution is simpler:
     * it just compares the first with the last character!
     * if they don't match, the string is not a palindrome.
     * if they match, the string is a palindrome iff (if and only if)
     * the remaining middle of the string - the substring without the
     * first and last character - is a palindrome.
     * This is determined by a recursive call.
     *
     * @param candidate
     * @return
     */
    @Override
    public boolean isPalindrome(String candidate) {
        if (candidate.length() < 2) return true;
        int lastIndex = candidate.length() - 1;
        if (candidate.charAt(0) != candidate.charAt(lastIndex)) return false;
        return isPalindrome(candidate.substring(1, lastIndex));
    }
}

