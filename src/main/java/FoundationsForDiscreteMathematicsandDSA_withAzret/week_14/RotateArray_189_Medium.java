package FoundationsForDiscreteMathematicsandDSA_withAzret.week_14;

import java.util.Arrays;

public class RotateArray_189_Medium {
    public static void main(String [] args) {
        System.out.println("Brute Force: " + Arrays.toString(rotateArray_bruteForceVer(new int[]{1,2,3,4,5,6,7}, 3)));
    }

    //Brute Force version
    //Time Comp: O(n)
    //Memory Comp: O(n)
    public static int[] rotateArray_bruteForceVer(int[] nums, int k) {
        int [] res = new int [nums.length];
        int leftNums = nums.length - 1;
        int resPointer = 0;
        int rotatePointer = k - 1;

        while (rotatePointer >= 0) {
            res[rotatePointer--] = nums[leftNums--];
            resPointer++;
        }

        for(int i = 0; i < nums.length - k; i++) {
            res[resPointer++] = nums[i];
        }

        System.arraycopy(res, 0, nums, 0, nums.length);
//        for(int i = 0; i < nums.length; i++) {
//            nums[i] = res[i];
//        }
        return nums;
    }
}
