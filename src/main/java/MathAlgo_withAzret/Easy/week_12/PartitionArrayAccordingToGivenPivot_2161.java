package MathAlgo_withAzret.Easy.week_12;

import java.util.Arrays;

public class PartitionArrayAccordingToGivenPivot_2161 {
    public static void main(String [] args) {
        System.out.println(Arrays.toString(pivotArray_ver1Azret(new int[]{9,12,5,10,14,3,10}, 10)));
    }

    //Ver1 from Azret
    //Time complexity: O(3n) -> O(n)
    //Memory complexity: O(n) + O(1) -> O(n)
    public static int [] pivotArray_ver1Azret(int [] nums, int pivot) {
        int [] result = new int[nums.length];
        int insertPosition = 0;
        int pivotCounter = 0;

        for (int num : nums) {
            if (num < pivot) {
                result[insertPosition++] = num;
            } else if (num == pivot) {
                pivotCounter++;
            }
        }

        while (pivotCounter > 0) {
            result[insertPosition++] = pivot;
            pivotCounter--;
        }

        for (int num : nums) {
            if (num > pivot) {
                result[insertPosition++] = num;
            }
        }
        return result;
    }

    //Overall Time by myself: 20min for all version//
    //Time Limit Exceeded
    public static int[] pivotArray_ver2Me(int [] nums, int pivot) {
        int numsPointer = 0;
        int lessThanPivotPointer = 0;
        int moreThanPivotPointer = nums.length - 1;

        while (numsPointer < nums.length) {
            if (nums[numsPointer] < pivot) {
                numsPointer++;
            } else if (nums[numsPointer] > pivot) {
                nums[moreThanPivotPointer--] = nums[numsPointer++];
            }
        }
        return nums;
    }

    //Test Case2 = Passed, Test Case1 = Fail
    public static int[] pivotArray_ver1Me(int [] nums, int pivot) {
        //code got lost, can't remember lol
        return null;
    }
}
