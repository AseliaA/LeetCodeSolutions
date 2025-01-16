package MathAlgo_withAzret.Easy;

public class BestTimeToBuyAndSellStock_121_2 {
    public static void main(String [] args) {
        System.out.println(maxProfit(new int[]{7, 1, 5, 3, 6, 4}));
        System.out.println(maxProfit(new int[]{7, 6, 4, 3, 1}));
        System.out.println(maxProfit(new int[]{2, 4, 1}));



        System.out.println("\n_____________\n" + maxProfitAzret(new int[]{7, 1, 5, 3, 6, 4}));
        System.out.println(maxProfitAzret(new int[]{7, 6, 4, 3, 1}));
    }

    //Azret's version.
    public static int maxProfitAzret(int [] prices) {
        int lowestPriceSoFar = prices[0];
        int highestProfit = 0;
        for (int todaysPrice : prices) {
            lowestPriceSoFar = Math.min(lowestPriceSoFar, todaysPrice);
            highestProfit = Math.max(highestProfit, todaysPrice - lowestPriceSoFar);
        }
        return highestProfit;
    }

    //v5 - Runtime: 0ms, beats 100% | Memory: 41.33mb, beats 94.54%
    //Time Complexity: O(n) -> best possible for this problem
    //Memory Complexity: O(1) -> best possible for this problem
    //Time took: 65 minutes
    public static int maxProfit(int[] prices) {
        int buy = prices[0];
        int profit = 0;

        for(int price : prices) {
            // searching for best day to buy
            if (price < buy) {
                buy = price;
            }

            //searching for the best profit
            if(price - buy > profit) profit = price - buy;
        }
        return profit;
    }
}
