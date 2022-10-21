public class Fibonacci {
    public static long fib(int n) {
        if (n == 1) return 1;
        n = n + 1;
        long[] fibo = new long[n];
        fibo[0] = 0;
        fibo[1] = 1;
        for (int i = 2; i <= n - 1; i++) {
            fibo[i] = fibo[i - 1] + fibo[i - 2];
        }
        return fibo[n - 1];
    }
}