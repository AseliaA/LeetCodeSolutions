package DataStructureAndAlgorithms_CrashCourse;

public class Recursion {
    public static void main(String[] args) {
        //Recursion

        //Task #1 from ChatGPT -> Sum of Natural Numbers
        System.out.println(SumOfNaturalNums(5));

        //Task #2 from ChatGPT -> Factorial Calculation
        System.out.println(FactorialCalculation(5));
        System.out.println(FactorialCalculation(0));

        //Task #3 from ChatGPT -> Reverse an Integer Using Recursion
        //TODO: Didn't understand almost at all
        System.out.println(ReverseIntegerUsingRecursion(1234, 0));
        System.out.println(ReverseIntegerUsingRecursion(-1234, 0));
    }

    public static int SumOfNaturalNums(int n){
        if (n == 0) return  0;

        return (n + SumOfNaturalNums(n - 1));
    }

    public static int FactorialCalculation(int n){
        if (n == 0) return 1;

        return (n * FactorialCalculation(n - 1));
    }

    public static int ReverseIntegerUsingRecursion(int n, int reserved){
        if (n == 0) return reserved;

        int lastDigit = n % 10;
        reserved = reserved * 10 + lastDigit;

        return ReverseIntegerUsingRecursion(n / 10, reserved);
    }
}
