package AlgorithmsAndDataStructure.week_14;

import java.util.Arrays;

public class SortColors_75_Medium {
    public static void main(String[] args) {
        System.out.println("Ver1: " + Arrays.toString(sortColor_ver1(new int[]{1,0,2,2,1,0})));
        System.out.println("Dutch Flag Algo: " + Arrays.toString(sortColor_DutchFlagAlgo(new int[]{1,0,2,2,1,0})));
    }

    //Dutch Flag Algo
    //Time Comp: O(n)
    //Memory Comp: O(1)
    //Probably most optimal
    public static int[] sortColor_DutchFlagAlgo(int [] nums) {
        int zerosInsertPosition = 0;
        int twosInsertPosition = nums.length - 1;
        int i = 0;

        while (i <= twosInsertPosition) {
            if (nums[i] == 0) {
                swap(nums, zerosInsertPosition++, i++);
            } else if (nums[i] == 1) {
                i++;
            } else {
                swap(nums, twosInsertPosition--, i);
            }
        }
        return nums;
    }

    //Could remember solution from week_13 and implement it
    //Time comp: O(n)
    //Memory comp: O(1)
    public static int[] sortColor_ver1(int [] nums) {
        int insertPosition = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) swap(nums, insertPosition++, i);

        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) swap(nums, insertPosition++, i);
        }
        return nums;
    }

    //helper function
    public static void swap(int[] nums, int x, int y) {
        int temp = nums[x];
        nums[x] = nums[y];
        nums[y] = temp;
    }
}
