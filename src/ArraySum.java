public class ArraySum {
    private static final boolean VERBOSE = false;

    public static void main(String[] args) {
        System.out.println("die summe von {93,2,46,2,5,7} ist (155 wäre richtig) " + new ArraySum().sumRecursive(new int[]{93, 2, 46, 2, 5, 7}));
        System.out.println("die summe von {93,2,46,2,5,7} ist (155 wäre richtig) " + new ArraySum().sumIterative(new int[]{93, 2, 46, 2, 5, 7}));
        System.out.println("die summe von {} ist (0 wäre richtig) " + new ArraySum().sumRecursive(new int[]{}));
        System.out.println("die summe von {} ist (0 wäre richtig) " + new ArraySum().sumIterative(new int[]{}));
    }

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
        return sumRecursiveImpl(0, a);
    }

    private int sumRecursiveImpl(int i, int[] a) {
        if (VERBOSE) System.out.println("in sumRecursiveImpl, i: " + i);
        if (i == a.length) return 0;
        int recursiveCallResult = sumRecursiveImpl(i + 1, a);
        if (VERBOSE) System.out.println("i:" + i + " recursiveCallResult: " + recursiveCallResult);
        return a[i] + recursiveCallResult;
    }
}
