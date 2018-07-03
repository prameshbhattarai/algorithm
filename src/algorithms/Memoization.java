package algorithms;

public class Memoization {

    static int[] lookup;
    public static int recursiveFiboWithMemoization(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            if (lookup[n-1] != 0)
                return lookup[n-1];
            else {
                int fiboValue = recursiveFiboWithMemoization(n - 2) + recursiveFiboWithMemoization(n - 1);
                lookup[n-1] = fiboValue;
                return fiboValue;
            }
        }
    }

    public static int recursiveFibo(int n) {
        if (n == 0 || n == 1)
            return 1;
        return recursiveFibo(n - 2) + recursiveFibo(n - 1);
    }

    public static int[] generateMemoizationFiboSeries(int n) {
        int[] series = new int[n];
        for (int i = 0; i < n; i++)
            series[i] = recursiveFiboWithMemoization(i);
        return series;
    }

    public static int[] generateFiboSeries(int n) {
        int[] series = new int[n];
        for (int i = 0; i < n; i++)
            series[i] = recursiveFibo(i);
        return series;
    }

    public static void main(String... args) {
        int[] series;
        long startTime, endTime;
        int upTo = 25;

        startTime = System.currentTimeMillis();
        series = Memoization.generateFiboSeries(upTo);
        endTime = System.currentTimeMillis();
        System.out.println("Time taken for recursive method " + (endTime - startTime));

        System.out.print("[");
        for (int i = 0; i < series.length; i++)
            System.out.print(series[i] + ",");
        System.out.println("]");



        startTime = System.currentTimeMillis();
        Memoization.lookup = new int[upTo];
        series = Memoization.generateMemoizationFiboSeries(upTo);
        endTime = System.currentTimeMillis();
        System.out.println("Time taken for memoization recursive method " + (endTime - startTime));

        System.out.print("[");
        for (int i = 0; i < series.length; i++)
            System.out.print(series[i] + ",");
        System.out.println("]");
    }

}
