package fe_x_2;

public class IterativePalindromeImplementationTest implements PalindromeTest<PalindromeIterative>{
    Palindrome palindrome = new PalindromeIterative();

    @Override
    public Palindrome getImplementation() {
        return palindrome;
    }
}
