package MathAlgo_withAzret.Easy.week_12;

import java.util.Arrays;

public class MoveZeroes_283 {
    public static void main(String [] args) {
        System.out.println("Ver1: " + Arrays.toString(moveZeroes_ver1(new int[]{0, 1, 0, 3, 12})));
        System.out.println("Ver1: " + Arrays.toString(moveZeroes_ver1(new int[]{0})));
        System.out.println("----------------------------------");
        System.out.println("Ver2: " + Arrays.toString(moveZeroes_ver2(new int[]{0, 1, 0, 3, 12})));
        System.out.println("Ver2: " + Arrays.toString(moveZeroes_ver2(new int[]{0})));
    }

    //ver2 from Azret
    public static int[] moveZeroes_ver2(int [] nums) {
        if (nums == null || nums.length == 0) return nums;

        int pointer = 0;
        for (int num : nums) {
            if (num != 0) {
                nums[pointer++] = num;
            }
        }

        while (pointer < nums.length) {
            nums[pointer++] = 0;
        }
        return nums;
    }

    public static int[] moveZeroes_ver1(int [] nums) {
        int pointer = 0;
        int zeroes = nums.length;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[pointer] = nums[i];
                pointer++;
                zeroes--;
            }
        }

        if(pointer + zeroes == nums.length) {
            while (zeroes != 0) {
                nums[pointer] = 0;
                pointer++;
                zeroes--;
            }
        }
        return nums;
    }
}
