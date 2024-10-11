package Easy;

import java.util.Arrays;

/**
 * Took 3 submits
 * Took a look at solutions
 * 53/54 of test cased passed
 */
public class Running_Sum_Of_1d_Array {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(runningSum(new int[]{1, 2, 3, 4})));
        System.out.println(Arrays.toString(runningSum(new int[]{1, 1, 1, 1, 1})));
        System.out.println(Arrays.toString(runningSum(new int[]{3, 1, 2, 10, 1})));
    }

    public static int[] runningSum(int[] nums) {
        int sum = 0;
        int[] runningSums = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            runningSums[i] = sum;
        }
        return runningSums;
    }
}