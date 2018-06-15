package algorithms;

import java.util.ArrayList;
import java.util.List;

public class Prime {

    public static boolean isPrime(int n) {
        for (int i = 2; i < n; i++)
            if (n % i == 0) return false;
        return true;
    }

    public static boolean isPrime(int n, int iteration) {
        if (iteration == n) return true;
        else {
            if (n % iteration == 0) return false;
            return isPrime(n, ++iteration);
        }
    }

    public static int[] processor(int n) {
        if (n == 0 || n == 1) return new int[0];
        List<Integer> listSeries = new ArrayList<>();
        for (int i = 2; i < n; i++)
            if (isPrime(i)) listSeries.add(i);
        return listSeries.stream().mapToInt(Integer::intValue).toArray();
    }

    public static int[] recursiveProcessor(int n) {
        if (n == 0 || n == 1) return new int[0];
        List<Integer> listSeries = new ArrayList<>();
        for (int i = 2; i < n; i++)
            if (isPrime(i, 2)) listSeries.add(i);
        return listSeries.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        int n = 100;
        int[] series = Prime.recursiveProcessor(n);
        System.out.print("[");
        for (int i = 0; i < series.length; i++)
            System.out.println(series[i] + ",");
        System.out.print("]");
    }
}
