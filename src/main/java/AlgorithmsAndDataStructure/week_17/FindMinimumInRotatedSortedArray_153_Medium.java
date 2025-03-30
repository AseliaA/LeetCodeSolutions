package AlgorithmsAndDataStructure.week_17;

public class FindMinimumInRotatedSortedArray_153_Medium {
    public static void main(String[] args) {

    }

    //my version -> needs work, but solves
    public static int findMin(int[] nums) {
        int n = nums.length;
        if (nums == null || n == 0) return 0;
        if (n == 1) return nums[0];
        if (nums[0] < nums[n - 1]) return nums[0];

        //continuing
        int answer = -1;
        int left = 0;
        int right = n - 1;

        while (left <= right) {
            int middle = left + (right - left) / 2;

            if (nums[middle] > nums[middle + 1]) {
                left = middle + 1;
            } else {
                answer = nums[middle];
                right = middle - 1;
            }
        }
        return answer;
    }
}
