package LeetCodeProblems.Easy;

public class SumOfNaturalNumbers {
    public static void main(String[] args) {

    }
    public static int SumOfNaturalNums(int n){
        if (n == 0) return  0;

        return (n + SumOfNaturalNums(n - 1));
    }
}
