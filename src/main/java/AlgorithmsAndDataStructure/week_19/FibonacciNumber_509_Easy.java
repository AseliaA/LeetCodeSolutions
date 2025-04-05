package AlgorithmsAndDataStructure.week_19;

public class FibonacciNumber_509_Easy {
    public static void main(String[] args){}

    //Azret's solution
    //time complexity: O(n)
    //memory complexity: O(n)
    int[] f;

    private int fib_n(int n) {
        if (n <= 1) return n;
        if (f[n] == 0)
            f[n] = fib_n(n - 1) + fib_n(n - 2);
        return f[n];
    }

    public int fib(int n) {
        f = new int[n + 1];
        return fib_n(n);
    }


    //own solution
    //time complexity: O(2^n)
    //memory complexity: O(n)
    public static int fib1(int n) {
        if (n <= 0) return n;
        return fib1(n - 1) + fib1(n - 2);
    }
}