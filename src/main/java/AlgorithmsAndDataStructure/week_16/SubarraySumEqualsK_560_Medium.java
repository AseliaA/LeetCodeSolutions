package AlgorithmsAndDataStructure.week_16;

import java.util.HashMap;
import java.util.Map;

public class SubarraySumEqualsK_560_Medium {
    public static void main(String[] args) {

    }

    public static int subarraySum(int[] nums, int k) {
        int currentPrefixSum = 0;
        int counter = 0;

        Map<Integer, Integer> prefixSumSeenCount = new HashMap<>();
        prefixSumSeenCount.put(0,1);

        for (int i = 0; i < nums.length; i++) {
            currentPrefixSum += nums[i];

            counter += prefixSumSeenCount.getOrDefault(currentPrefixSum, 0);
            prefixSumSeenCount.put(
                    currentPrefixSum,
                    prefixSumSeenCount.getOrDefault(currentPrefixSum, 0) + 1);
        }
        return counter;
    }
}
