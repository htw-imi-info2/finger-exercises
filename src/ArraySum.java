import java.util.Arrays;

public class ArraySum {
    private static final boolean VERBOSE = false;

    /**
     * example of testing with a main method (instead of junit)
     * works only for small examples; because list of output that needs to be checked quickly becomes too long!
     * @param args
     */
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
    /**
     * The solution I showed in class was more complicated than necessary.
     * I chose it because Java doesn't have an efficient method to get the tail from an Array,
     * that is, the Array with all but the first element.
     * If there where an Arrays.tail, then it would be simpler:
     * @param a
     * @return sum of elements in a
     */
    public int sumRecursiveImproved(int[] a) {
        if (a.length == 0) return 0;
        return a[0] + sumRecursiveImproved(tail(a));
    }

    /*
     * This implements tail for an array in a simple way, by copying
     * all elements but the first one into a new array.
     * This works, but is quite expensive. We will look into this later!
     */
    private int[] tail(int[] a) {
        return Arrays.copyOfRange(a,1,a.length);
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
