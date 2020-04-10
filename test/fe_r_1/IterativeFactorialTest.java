package fe_r_1;

public class IterativeFactorialTest implements FactorialTest<FactorialRecursive>{
    private final Factorial implementation = new FactorialRecursive();
    @Override
    public Factorial getFactorial() {
        return implementation;
    }
}
