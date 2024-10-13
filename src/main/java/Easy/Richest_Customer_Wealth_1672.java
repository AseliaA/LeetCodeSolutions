package Easy;

public class Richest_Customer_Wealth_1672 {
    public static void main(String[] args) {
        int[][] array1 = new int[][]{
                {1, 2, 3},
                {3, 2, 1}
        };
        System.out.println(maximumWealth(array1));
    }

    public static int maximumWealth(int[][] accounts) {
        int richestAmount = 0;
        for (int i = 0; i < accounts.length; i++) {
            int currentSum = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                currentSum += accounts[i][j];
            }
            richestAmount = Math.max(richestAmount, currentSum);
        }
        return richestAmount;
    }
}


