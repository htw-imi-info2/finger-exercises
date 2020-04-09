public class ArraySum {
    public int sumIterative(int[] a) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        return sum;
    }

    public int sumRecursive(int[] a) {
        // return erstes element + summe des restes des arrays
       // return first(a) + sumRecursive(tail(a));
        return sumRecursiveImpl(0,a);
    }

    private int sumRecursiveImpl(int i, int[] a) {
       // System.out.println(i);
        if (i == a.length) return 0;
        return a[i] + sumRecursiveImpl(i+1, a);
    }
}
