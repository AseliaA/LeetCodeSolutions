package MathAlgo_withAzret.week_12;

import java.util.Arrays;

public class RemoveDuplicatesFromSortedArrayII_80 {
    public static void main(String [] args) {
        System.out.println(removeDuplicates(new int[]{1, 1, 2, 2, 3, 3}));

    }

    public static int removeDuplicates(int [] nums) {
        int insertIndex = 2;
        for (int i = 2; i < nums.length; i++) {
            if (nums[i] != nums[insertIndex - 2]) {
                nums[insertIndex++] = nums[i];
            }
        }
        return insertIndex;
    }
}
