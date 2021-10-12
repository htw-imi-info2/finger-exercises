package fe_r_1;

public class FactorialRecursive implements Factorial {
    @Override
    public long fac(int n) {
        if (n < 2) return 1;
        return n * fac(n - 1);
    }
}
