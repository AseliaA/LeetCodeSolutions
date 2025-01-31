package MathAlgo_withAzret.week_13;

import java.util.Arrays;

public class SortColors_75_Medium {
    public static void main(String [] args) {
        System.out.println(Arrays.toString(sortColors(new int[]{2,0,2,1,1,0})));
        System.out.println(Arrays.toString(sortColors(new int[]{2,0,1})));
        System.out.println("----------------------------------------------");
        System.out.println(Arrays.toString(sortColors_OnePass(new int[]{2,0,2,1,1,0})));
        System.out.println(Arrays.toString(sortColors_OnePass(new int[]{2,0,1})));
    }
    //ChatGPT Suggestion: Dutch National Flag Algorithm (One-Pass Solution)
    public static int[] sortColors_OnePass(int [] nums) {
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

    //ChatGPT: good but there's a better algorithm with just one loop
    //From the lesson recording
    //Time comp: O(n)
    //Memory comp: O(1)
    public static int[] sortColors(int [] nums) {
        int insertPosition = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) swap(nums, i, insertPosition++);
        }

        for (int i = insertPosition; i < nums.length; i++) {
            if (nums[i] == 1) swap(nums, i, insertPosition++);
        }
        return nums;
    }

    public static void swap(int [] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
