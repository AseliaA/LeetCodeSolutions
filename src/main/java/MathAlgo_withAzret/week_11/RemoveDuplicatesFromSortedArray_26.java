package MathAlgo_withAzret.week_11;

import java.util.HashMap;
import java.util.Map;

public class RemoveDuplicatesFromSortedArray_26 {
    public static void main(String [] args) {
        System.out.println(removeDuplicates(new int []{1,1,2}));
        System.out.println(removeDuplicates(new int []{0,0,1,1,1,2,2,3,3,4}));
    }

    //TODO come back and research pointers method (also find out if pointers and sliding window methods are same thing)
    //Correct version, Azret's
    public static int removeDuplicates(int [] nums) {
        int d = 1;
        for (int i = 1; i < nums.length; i++) {
            if(nums[i] == nums[i - 1]) {
                continue;
            }
            nums[d++] = nums[i];
        }
        return d;
    }

    //ver1, not finished. Doesn't work
    //not following problem requirements, can't create new variable, need to be in-place
    public static int removeDuplicates_wrong(int[] nums) {
        int duplicateCount = 0;
        Map<Integer, Integer> freq = new HashMap<>();
        int last = nums.length - 1;
        for(int i : nums) {
            freq.put(i, freq.getOrDefault(i, 0) + 1);
        }

        for(Map.Entry<Integer, Integer> entry : freq.entrySet()) {
            for(int i = 0; i < nums.length; i++) {
                if (freq.get(nums[i]) > 1) {
                    duplicateCount++;
                    int temp = nums[last];
                    nums[last] = nums[i];
                    nums[i] = temp;
                    last--;
                }
            }
        }

        return (nums.length - duplicateCount);
    }
}
