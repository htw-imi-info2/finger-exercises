package fe_r_1;

public class FactorialIterative implements Factorial {
    @Override
    public long fac(int n) {
        if (n < 2) return 1;
        int f = 1;
        for (int i = 2; i <= n; i++) {
            f = f * i;
        }
        return f;
    }
}
