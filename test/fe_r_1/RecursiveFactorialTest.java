package fe_r_1;

public class RecursiveFactorialTest implements FactorialTest<FactorialRecursive>{
    final Factorial implementation = new FactorialRecursive();
    @Override
    public Factorial getFactorial() {
        return implementation;
    }
}
