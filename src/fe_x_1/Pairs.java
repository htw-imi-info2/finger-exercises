package fe_x_1;

import java.util.ArrayList;
import java.util.List;

public class Pairs {
    public int countPairs(int[] a, int sum) {
        return 0;
    }

    public int[][] pairs(int[] a, int sum) {
        List<int[]> pairs = new ArrayList<>();

        // ...

        int[][] result = new int[pairs.size()][];
        return (int[][]) pairs.toArray(result);
    }

    public int countPairsZero(int[] a) {
        return countPairs(a, 0);
    }

    public int[][] pairsZero(int[] a) {
        return pairs(a, 0);
    }
}
