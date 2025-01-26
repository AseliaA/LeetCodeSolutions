package MathAlgo_withAzret.Easy.week_12;

public class PartitionArrayAccordingToGivenPivot_2161 {
    public static void main(String [] args) {

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
