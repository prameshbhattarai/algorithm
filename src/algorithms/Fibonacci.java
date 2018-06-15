package algorithms;

public class Fibonacci {

    public static int[] getFibonacciSeries(int n) {
        if(n == 0)
            return new int[0];
        if(n == 1)
            return new int[] {1};

        int[] series = new int[n];
        series[0] = 1; series[1] = 1;
        for(int i = 2; i < n; i++)
            series[i] = series[i-2] + series[i-1];

        return series;
    }

    public static int recursiveFibo(int n) {
        if(n == 0 || n ==1)
            return 1;
        return recursiveFibo(n-2) + recursiveFibo(n-1);
    }

    public static int[] generateFiboSeries(int n) {
        int[] series = new int[n];
        for(int i = 0; i < n; i++)
            series[i] = recursiveFibo(i);
        return series;
    }

    public static void main(String... args) {
        int[] series = Fibonacci.generateFiboSeries(10);
        System.out.print("[");
        for (int i = 0; i < series.length; i++)
            System.out.print(series[i] + ",");
        System.out.println("]");
    }
}
