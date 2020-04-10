package fe_x_2;

public class RecursivePalindromeImplementationTest implements PalindromeTest<PalindromeRecursive> {

    Palindrome palindrome = new PalindromeRecursive();
    
    @Override
    public Palindrome getImplementation() {
        return palindrome;
    }
}
