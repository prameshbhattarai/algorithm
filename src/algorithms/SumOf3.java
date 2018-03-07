package algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by pramesh on 3/7/2018.
 */
public class SumOf3 {
    // sum of three element in the array must be equal to provided value
    // making combination of three element whose sum equal to provided value

    /*
     * sum should be 0
     * a[] = [-1, 0, 1, 2, -1, -4]
     *
     * [
     *  [-1, 0, 1],
     *  [-1, -1, 2]
     * ]
     */

    private List<List<Integer>> threeSum(int[] a, int expectedSum) {
        Arrays.sort(a);

        // [-4, -1, -1, 0, 1, 2]

        // sum of first and last index <= 0 then add from left shift from last
        // -4 + 2 = -2 + 1 = -1 // sum is not 0

        // shift right from first index
        // sum of next first and last index > 0 then add from right shift from next first
        // -1 + 2 = 1 -1 = 0 // sum is 0
        // out put should be [-1, 2, -1]
        // shift the last index to left shift

        // shift right from next first index
        // sum of next first and last index <= 0 then add from left shift from last
        // -1 + 1 = 0 + 0 = 0 // sum is 0
        // out put should be [-1, 1, 0]
        // shift the last index to left shift

        List<Integer> lists;
        List<List<Integer>> listsOfList = new ArrayList<>();
        int firstIndex = 0, lastIndex = a.length - 1, sum = 0;
        while (firstIndex < lastIndex) {
            sum = a[firstIndex] + a[lastIndex];
            if (sum <= 0) {
                if (sum + a[lastIndex - 1] == expectedSum) {
                    // create the list
                    lists = Arrays.asList(a[firstIndex], a[lastIndex], a[lastIndex - 1]);
                    listsOfList.add(lists);
                    // shift the last index to left
                    lastIndex--;
                }
            } else {
                if (sum + a[firstIndex + 1] == expectedSum) {
                    // create the list
                    lists = Arrays.asList(a[firstIndex], a[lastIndex], a[firstIndex + 1]);
                    listsOfList.add(lists);
                    // shift the last index to left
                    lastIndex--;
                }
            }
            // shift the first index to right
            firstIndex++;
        }

        return listsOfList;
    }

    public static void main(String... args) {
        SumOf3 obj = new SumOf3();
        long startTime, endTime, duration;

        startTime = System.nanoTime();
        List<List<Integer>> result = obj.threeSum((new int[]{-4, -1, -1, 0, 1, 2}), 1);
        endTime = System.nanoTime();
        duration = (endTime - startTime);
        System.out.println("Time to execute " + duration);

        System.out.println("[");
        for (int i = 0; i < result.size(); i++) {
            System.out.print("[");
            List<Integer> insideList = result.get(i);
            for (int j = 0; j < insideList.size(); j++) {
                System.out.print(insideList.get(j) + ",");
            }
            System.out.println("]");
        }
        System.out.println("]");
    }
}
