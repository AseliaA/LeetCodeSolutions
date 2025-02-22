package AlgorithmsAndDataStructure.week_15;

import java.util.ArrayList;
import java.util.Arrays;

public class SlidingWindowMaximum_239_Hard {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(maxSlidingWindow(new int[]{1,3,-1,-3,5,3,6,7}, 3)));
        System.out.println(getMax(new int[]{1, 2, 3}));
    }

    //my own ver1, spend 30 minutes. It doesn't work, it returns  [0, 0, 5, 3, 6, 7] for Test1
    public static int[] maxSlidingWindow(int[] nums, int k) {
        ArrayList<Integer> result = new ArrayList<>();
        int start = 0;
        int end = 0;

        while (end < nums.length) {
            end = start + k;
            int[] current = new int[k];
            for (int i = start; i < end; i++) {
                int index = 0;
                while (index < k) {
                    current[index++] = nums[i];
                }
            }
            result.add(getMax(current));
            start++;
        }
        int[] res = result.stream().mapToInt(i -> i).toArray();
        return res;
    }

    public static int getMax(int[] nums) {
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) max = nums[i];
        }
        return max;
    }
}
