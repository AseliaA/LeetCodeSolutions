package LeetCodeProblems.Easy;

public class ReverseInteger {
    public static void main(String[] args) {

    }

    public static int ReverseIntegerUsingRecursion(int n, int reserved){
        if (n == 0) return reserved;

        int lastDigit = n % 10;
        reserved = reserved * 10 + lastDigit;

        return ReverseIntegerUsingRecursion(n / 10, reserved);
    }
}
