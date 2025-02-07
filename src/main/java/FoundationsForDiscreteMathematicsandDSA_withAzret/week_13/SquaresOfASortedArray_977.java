package FoundationsForDiscreteMathematicsandDSA_withAzret.week_13;

import java.util.Arrays;

public class SquaresOfASortedArray_977 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(sortedSquares_ver1(new int[]{-4, -1, 0, 3, 10})));
        System.out.println(Arrays.toString(sortedSquares_azret(new int[]{-4, -1, 0, 3, 10})));
    }

    //Azret's version
    public static int[] sortedSquares_azret(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        int left = 0;
        int right = n - 1;
        for (int insertPostion = n - 1; insertPostion >= 0; insertPostion--) {
            if (Math.abs(nums[left]) > Math.abs(nums[right])) {
                result[insertPostion] = nums[left] * nums[left];
                left++;
            } else {
                result[insertPostion] = nums[right] * nums[right];
                right--;
            }
        }
        return result;
    }

    //my ver1
    //Time Com: O(n)
    //Memory Com: O(n)
    public static int[] sortedSquares_ver1(int[] nums) {
        if (nums == null || nums.length == 0) {
            return new int[]{};
        }

        int[] result = new int[nums.length];
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
