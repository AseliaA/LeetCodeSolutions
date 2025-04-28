package AlgorithmsAndDataStructure.week_20;

import java.util.Arrays;

public class PartitionEqualSubsetSum_416_Medium {
    public static void main(String[] args) {

    }

    public static boolean canPartition(int[] nums) {
        int sum = 0;
        for (int i : nums) {
            sum += i;
        }
        if (sum % 2 != 0)
            return false;

        boolean[] used = new boolean[nums.length];
        //2 being a number of subsets we need, in out case just 2
        Arrays.sort(nums);
        return backtrack(nums, 2, 0, 0, used, sum / 2);
    }

    private static boolean backtrack(int[] nums, int k, int curSum, int idx, boolean[] used, int target) {
        if (k == 1) {
            return true;
        }

        if (curSum == target) {
            return backtrack(nums, k - 1, 0, 0, used, target);
        }

        for (int i = idx; i < nums.length; i++) {
            if (used[i] || i > 0 && nums[i] == nums[i - 1] && !used[i - 1]) {
                continue;
            }

            used[i] = true;
            if (curSum + nums[i] <= target && backtrack(nums, 2, curSum + nums[i], i + 1, used, target)) {
                return true;
            }

            used[i] = false;
        }
        return false;
    }
}