package fe_x_1;

import java.util.ArrayList;
import java.util.List;

public class Pairs {
    public int countPairs(int[] a, int sum) {
        int count = 0;
        for (int i = 0; i < a.length ; i++) {
            for (int j = i+1; j < a.length; j++) {
                if (a[i]+a[j] == sum)
                    count++;
            }
        }
        return count;
    }

    public int[][] pairs(int[] a, int sum) {
        List<int[]> pairs = new ArrayList<>();
        for (int i = 0; i < a.length ; i++) {
            for (int j = i+1; j < a.length; j++) {
                if (a[i]+a[j] == sum)
                    pairs.add(new int[]{a[i],a[j]});

            }
        }
        // see https://docs.oracle.com/javase/8/docs/api/java/util/ArrayList.html
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
