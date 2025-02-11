package AlgorithmsAndDataStructure.week_14;

import java.util.Arrays;

public class SortArrayByParityII_922_Easy {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(sortArray(new int[]{4, 2, 5, 7})));
    }

    public static int[] sortArray(int [] nums) {
        int evens = 0;
        int odds = 1;
        int n = nums.length;

        while (evens < n && odds < n) {
            if (/*evens < n && */nums[evens] % 2 == 0) evens += 2;
            if (/*odds < n && */nums[odds] % 2 == 1) odds += 2;

            if (evens < n && odds < n) swap(nums, evens, odds);
        }
        return nums;
    }

    public static void swap(int[] nums, int x, int y){
        int temp = nums[x];
        nums[x] = nums[y];
        nums[y] = temp;
    }
}
