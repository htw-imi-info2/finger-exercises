package fe_1;

public class CountZeros {
    public int countZeros(int[] a){
        int counter = 0;
        for (int i = 0; i < a.length; i++) {
            if(a[i] == 0) counter++;
        }
        return counter;
    }
}
