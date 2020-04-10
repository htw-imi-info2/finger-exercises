package fe_x_1;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MyArrays {
    public static String toString(int[][] nestedArray) {
        if (nestedArray == null) {
            return "null";
        } else {

                int iMax = nestedArray.length - 1;
                if (iMax == -1) {
                    return "[]";
                } else {
                    StringBuilder b = new StringBuilder();
                    b.append('[');
                    int i = 0;

                    while (true) {
                        b.append(Arrays.toString(nestedArray[i]));

                        if (i == iMax) {
                            return b.append(']').toString();
                        }

                        b.append(", ");
                        ++i;
                    }
                }
            }

    }
}
