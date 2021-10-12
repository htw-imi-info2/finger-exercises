package fe_x_2;

public class PalindromeIterative implements Palindrome {
    /**
     * iterative solution.
     * it demonstrates a for loop with two loop variables.
     * two cursors run through the string:
     * - left from the left side to the middle
     * - right from the right side to the middle
     * if differing characters are found, the string is not a palindrome and false is returned.
     * @param candidate
     * @return
     */
    @Override
    public boolean isPalindrome(String candidate) {
        if (candidate.length() < 2) return true;
        for (int left = 0, right = candidate.length() - 1; left < right; left++, right--) {
            if (candidate.charAt(left) != candidate.charAt(right))
                return false;
        }
    return true;
    }
}
