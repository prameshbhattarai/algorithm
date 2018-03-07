package algorithms;

/**
 * Created by pramesh on 3/7/2018.
 */
public class BinarySearch {

    private int search(int[] a, int find) {
        if(a.length == 0) return 0;
        int midIndex = 0, firstIndex = 0, highIndex = a.length-1;
        while(firstIndex <= highIndex) {
            midIndex = Math.round((highIndex + firstIndex)/2);
            if (a[midIndex] == find)
                return midIndex;
            else if (find < a[midIndex])
                highIndex = midIndex - 1;
            else
                firstIndex = midIndex + 1;
        }
        return -1;
    }

    public static void main(String... args) {
        BinarySearch obj = new BinarySearch();
        int index = obj.search(new int[] {10,11,12,13,14,15,16,17,18,19}, 18);
        System.out.println("Index of found " + index);
    }
}
