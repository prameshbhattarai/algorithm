package algorithms;

import java.util.Arrays;

/**
 * Created by pramesh on 5/4/2018.
 */
public class CyclicRotation {

    /**
     * Rotation of the array means that each element is shifted right by one index,
     * and the last element of the array is moved to the first place.
     * @param A {Array}
     * @param K {int}
     * @return {Array}
     */
    private int[] rotateArray(int[] A, int K) {
        if(A.length > 0 && K > 0) {
            int j = 0, temp, lastIndex = A.length - 1;
            while (j < K) {
                temp = A[lastIndex];
                for (int i = lastIndex; i > 0 ; i--) {
                    A[i] = A[i-1];
                }
                A[0] = temp; j++;
            }
        }
        return A;
    }

    public static void main(String... args) {
        CyclicRotation obj = new CyclicRotation();
        int[] result = obj.rotateArray(new int[] {3, 8, 9, 7, 6}, 2);
        System.out.println(Arrays.toString(result));
    }
}
