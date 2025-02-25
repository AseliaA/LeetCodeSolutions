package AlgorithmsAndDataStructure.week_16;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum_1_Easy {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum1(new int[]{2,7,11,15},9)));
        System.out.println(Arrays.toString(twoSum2(new int[]{2,7,11,15},9)));
    }

    //ver2, from lecture
    public static int[] twoSum2(int[] nums, int target) {
        Map<Integer, Integer> seen = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int b = nums[i];
            int a = target - b;

            if (seen.containsKey(a)) {
                return new int[]{seen.get(a), i};
            }
            seen.put(b, i);
        }
        return new int[]{};
    }

    //ver1, not optimal -> PASS
    //Time Comp: O(n^2)
    //Memory Comp: O(1)
    public static int[] twoSum1(int[] nums, int target) {
        int[] result = new int[2];

        for (int i = 0; i < nums.length; i++) {
            int inArray = target - nums[i];

            for (int j = 0; j < nums.length; j++) {
                if (nums[j] == inArray) {
                    if (j != i) {
                        result[0] = i;
                        result[1] = j;
                        break;
                    }
                }
            }
        }
        return result;
    }
}
