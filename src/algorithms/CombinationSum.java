package algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by pramesh on 3/9/2018.
 */
public class CombinationSum {

    private List<List<Integer>> combinationSum(int[] a, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(a);
        back(result, new ArrayList<>(), a, target, 0);
        return result;
    }

    private void back(List<List<Integer>> result, List<Integer> innerList, int[] a, int remaining, int start) {
        System.out.println("--------------------------------------------------");
        if (remaining < 0) {
            System.out.println("will not be found lets return");
            return;
        } else if (remaining == 0) {
            System.out.println("found target");
            result.add(new ArrayList<>(innerList));
        } else {
            for (int i = start; i < a.length; i++) {
                System.out.println("inner loop index " + i);
                System.out.println("element at index " + a[i]);
                System.out.println("starting index " + start);

                innerList.add(a[i]);

                System.out.println("new remaining will be " + (remaining - a[i]));

                back(result, innerList, a, remaining - a[i], i);

                System.out.println("when remaining is less than 0, then this part will be called ");
                innerList.forEach(System.out::print);
                System.out.println("\nsize of innerlist " + innerList.size());

                innerList.remove(innerList.size()-1);
            }
        }
    }

    public static void main(String... args) {
        CombinationSum obj = new CombinationSum();
        List<List<Integer>> result = obj.combinationSum(new int[]{2, 3, 6, 7}, 7);

        System.out.println("[");
        for (List<Integer> aResult : result) {
            System.out.print("[");
            List<Integer> insideList = aResult;
            for (Integer anInsideList : insideList) {
                System.out.print(anInsideList + ",");
            }
            System.out.println("]");
        }
        System.out.println("]");

    }
}
