package algorithms;

/**
 * Created by pramesh on 5/4/2018.
 */
public class BinaryGap {
    /**
     * Find longest sequence of zeros in binary representation of an integer.
     *
     * @param N {integer}
     * @return longest sequence of zeros in binary
     */
    private int findGap(int N) {
        String binaryString = Integer.toBinaryString(N);
        int length = binaryString.length(), maxGap = 0, i = 0;
        while (i < length) {
            if (binaryString.charAt(i) == '1') {
                for (int j = i + 1, tempGap = 0; j < length; j++) {
                    if (binaryString.charAt(j) == '0') {
                        ++tempGap;
                    } else {
                        if (maxGap < tempGap) {
                            maxGap = tempGap;
                        }
                        i = j - 1;
                        break;
                    }
                }
            }
            i++;
        }
        return maxGap;
    }

    public static void main(String... args) {
        BinaryGap obj = new BinaryGap();
        int maxGap = obj.findGap(529);
        System.out.println("Binary of 529 is " + Integer.toBinaryString(529));
        System.out.println("longest sequence of zeros is " + maxGap);


        maxGap = obj.findGap(20);
        System.out.println("Binary of 20 is " + Integer.toBinaryString(20));
        System.out.println("longest sequence of zeros is " + maxGap);


        maxGap = obj.findGap(9);
        System.out.println("Binary of 9 is " + Integer.toBinaryString(9));
        System.out.println("longest sequence of zeros is " + maxGap);
    }
}
