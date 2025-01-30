package MathAlgo_withAzret.week_13;

import java.util.Arrays;

public class SquaresOfASortedArray_977 {
    public static void main(String [] args) {
        System.out.println(Arrays.toString(sortedSquares_ver1(new int[]{-4,-1,0,3,10})));
    }

    //my ver1
    //Time Com: O(n)
    //Memory Com: O(n)
    public static int[] sortedSquares_ver1(int[] nums) {
        if (nums == null || nums.length == 0) {
            return new int[]{};
        }

        int [] result = new int[nums.length];
        int left = 0;
        int right = nums.length - 1;
        for (int i = result.length - 1; i >= 0; i--) {
            int leftSquare = nums[left] * nums[left];
            int rightSquare = nums[right] * nums[right];
            if (leftSquare > rightSquare) {
                result[i] = leftSquare;
                left++;
            } else {
                result[i] = rightSquare;
                right--;
            }
        }
        return result;
    }
}
