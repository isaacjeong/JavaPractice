import java.util.Scanner;

public class FibonacciTwo {

    private static long[] fibonacciCache;

    public static void main(String[] args) {
        Scanner myFibonacci = new Scanner(System.in);
        System.out.print("Enter your nth number: ");

        int myScanner = myFibonacci.nextInt();

        if (myScanner < 0) {
            System.out.println("Please enter a non-negative number.");
            return;
        }

        fibonacciCache = new long[myScanner + 1];

        for (int i = 0; i <= myScanner; i++) {
            System.out.print(fibonacci(i) + " ");
        }

        myFibonacci.close();
    }

    private static long fibonacci(int n) {
        if (n <= 1) {
            return n;
        }

        if (fibonacciCache[n] != 0) {
            return fibonacciCache[n];
        }

        long nthFibonacciNumber = fibonacci(n - 1) + fibonacci(n - 2);
        fibonacciCache[n] = nthFibonacciNumber;
        return nthFibonacciNumber;
    }
}