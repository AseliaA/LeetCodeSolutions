package AlgorithmsAndDataStructure.week_14;

import java.util.Arrays;

public class RotateArray_189_Medium {
    public static void main(String [] args) {
        System.out.println("Brute Force: " + Arrays.toString(rotateArray_bruteForceVer(new int[]{1,2,3,4,5,6,7}, 3)));
        System.out.println("My ver1, not fully: " + Arrays.toString(rotate_myVer1(new int[]{1,2,3,4,5,6,7}, 3)));
        System.out.println("Azret's ver: " + Arrays.toString(rotate_azretVer(new int[]{1,2,3,4,5,6,7}, 3)));
    }

    //Solution from Azret, most optimal
    //Time Comp: O(n)
    //Memory Comp: O(1), in-place
    public static int[] rotate_azretVer(int [] nums, int k) {
        k = k % nums.length;
        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);
        return nums;
    }

    //Helper for rotate_azretVer()
    public static void reverse(int [] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
    //Tried in-place solution, stuck in the correct order in the middle to the back part
    public static int[] rotate_myVer1(int[] nums, int k) {
        int changePosition = nums.length - k;
        int insertPosition = 0;

        while (k > 0) {
            swap(nums, insertPosition++, changePosition++);
            k--;
        }
        return nums;
    }

    public static void swap(int[] nums, int x, int y) {
        int temp = nums[x];
        nums[x] = nums[y];
        nums[y] = temp;
    }

    /*Brute Force version, running successfully but
    not getting accepted due to line "res[movesPointer--] = nums[endNums--];"
    java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1*/
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
