package algorithms;

import java.util.Arrays;

/**
 * Created by pramesh on 3/6/2018.
 */
public class RemoveDuplicatesFromSortedArray {

    private int removeDuplicates(int[] a) {
        if (a.length == 0)
            return 0;
        int j = 0;
        for (int i = 1; i < a.length; i++) {
            // debugger
            System.out.println("step >>>> " + i);
            System.out.println("a[i] >>" + "a[" + i + "]" + a[i]);
            System.out.println("a[j] >>" + "a[" + j + "]" + a[j]);
            if (a[i] != a[j]) {
                a[++j] = a[i];
            }
        }
        return ++j;
    }


    public static void main(String... args) {
        RemoveDuplicatesFromSortedArray obj = new RemoveDuplicatesFromSortedArray();
        int[] arz = new int[] {1,1,2,3};
        System.out.println(Arrays.toString(arz));
        int size = obj.removeDuplicates(arz);
        System.out.println("removed duplicate up to" + size);
        System.out.println(Arrays.toString(arz));
    }
}
