package LeetCodeProblems.Easy;

public class Factorial {
    public static void main(String[] args) {

    }
    public static int FactorialCalculation(int n){
        if (n == 0) return 1;

        return (n * FactorialCalculation(n - 1));
    }
}
