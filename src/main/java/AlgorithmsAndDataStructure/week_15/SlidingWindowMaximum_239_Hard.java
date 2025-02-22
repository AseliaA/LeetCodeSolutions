package AlgorithmsAndDataStructure.week_15;

import java.util.ArrayList;
import java.util.Arrays;

public class SlidingWindowMaximum_239_Hard {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(maxSlidingWindow1(new int[]{1,3,-1,-3,5,3,6,7}, 3))); //FAIL
        System.out.println(Arrays.toString(maxSlidingWindow2(new int[]{1,3,-1,-3,5,3,6,7}, 3))); //PASS
    }

    //Sqrt Decomposition method, from lecture
    public static int[] maxSlidingWindow2(int[] nums, int k) {
        //sqrt decomposition
        int n = nums.length;
        int sqrt = (int) Math.ceil(Math.sqrt(n));
        int[] block_max = new int[sqrt];
        Arrays.fill(block_max, Integer.MIN_VALUE);
        for (int i = 0; i < n; i++) {
            int block = i / sqrt;
            block_max[block] = Math.max(block_max[block], nums[i]);
        }

        //result array
        int[] results = new int[n - k + 1];
        for (int i = 0; i + k - 1 < n; i++) {
            int l = i;
            int r = i + k - 1;

            //computing the max
            int result = Integer.MIN_VALUE;
            for (int j = l; j <= r; ) {
                if (j % sqrt == 0 && j + sqrt - 1 <= r) {
                    int block = j / sqrt;
                    result = Math.max(result, block_max[block]);
                    j += sqrt; //j = j + sqrt;
                } else {
                    result = Math.max(result, nums[j]);
                    j++;
                }
            }
            results[i] = result;
        }
        return results;
    }

    //my own ver1, spend 30 minutes. It doesn't work, it returns  [0, 0, 5, 3, 6, 7] for Test1
    public static int[] maxSlidingWindow1(int[] nums, int k) {
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
