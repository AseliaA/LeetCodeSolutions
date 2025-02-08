package FoundationsForDiscreteMathematicsandDSA_withAzret.week_13;

import java.util.Arrays;

public class SortColors_75_Medium {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(sortColors(new int[]{2, 0, 2, 1, 1, 0})));
        System.out.println(Arrays.toString(sortColors(new int[]{2, 0, 1})));
        System.out.println("----------------------------------------------");
        System.out.println(Arrays.toString(sortColors_OnePass(new int[]{2, 0, 2, 1, 1, 0})));
        System.out.println(Arrays.toString(sortColors_OnePass(new int[]{2, 0, 1})));
        System.out.println("----------------------------------------------");
        System.out.println(Arrays.toString(sortColors_newVer(new int[]{2, 0, 2, 1, 1, 0})));
    }

    //Different way of solving, simple algo, but it's working
    public static int[] sortColors_newVer(int[] nums) {
        int r = 0;
        int w = 0;
        int b = 0;
        for (int i : nums) {
            if (i == 0) r++;
            else if (i == 1) w++;
            else b++;
        }

        int insertPosition = 0;
        while (r > 0) {
            nums[insertPosition++] = 0;
            r--;
        }

        while (w > 0) {
            nums[insertPosition++] = 1;
            w--;
        }

        while (b > 0) {
            nums[insertPosition++] = 2;
            b--;
        }
        return nums;
    }

    //TODO Need to come back and repeat the algo, didn't understand fully
    //ChatGPT Suggestion: Dutch National Flag Algorithm (One-Pass Solution)
    public static int[] sortColors_OnePass(int[] nums) {
        int left = 0, middle = 0, right = nums.length - 1;
        while (middle <= right) {
            if (nums[middle] == 0) {
                swap(nums, left++, middle++);
            } else if (nums[middle] == 1) {
                middle++;
            } else {
                swap(nums, middle, right--);
            }
        }
        return nums;
    }

    //TODO Need to come back and repeat the algo, didn't understand fully
    //ChatGPT: good but there's a better algorithm with just one loop
    //From the lesson recording
    //Time comp: O(n)
    //Memory comp: O(1)
    public static int[] sortColors(int[] nums) {
        int insertPosition = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) swap(nums, i, insertPosition++);
        }

        for (int i = insertPosition; i < nums.length; i++) {
            if (nums[i] == 1) swap(nums, i, insertPosition++);
        }
        return nums;
    }

    public static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}