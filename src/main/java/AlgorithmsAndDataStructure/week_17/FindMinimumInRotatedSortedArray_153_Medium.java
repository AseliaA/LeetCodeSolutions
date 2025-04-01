package AlgorithmsAndDataStructure.week_17;

public class FindMinimumInRotatedSortedArray_153_Medium {
    public static void main(String[] args) {

    }

    //3rd version, best version
    public static int findMin3(int[] nums) {
        if (nums.length == 0) return 0;
        if (nums.length == 1) return nums[0];

        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int middle = left + (right - left) / 2;

            if (nums[middle] > nums[right]) {
                left = middle + 1;
            } else {
                right = middle;
            }
        }
        return nums[right];
    }

    //my version -> solves for some, doesn't solve for others -> Wrong
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

//            if (nums[middle] > nums[middle + 1]) { IndexOutOfBounds error
            if (middle < nums.length - 1 && nums[middle] > nums[middle + 1]){
                left = middle + 1;
            } else {
                answer = nums[middle];
                right = middle - 1;
            }
        }
        return answer;
    }

    //teacher's version
    public static int findMinTeachers(int[] nums) {
        int n = nums.length;
        if (nums == null || n == 0) return 0;
        if (n == 1) return nums[0];
        if (nums[0] < nums[n - 1]) return nums[0];

        //continuing
        int left = 0;
        int right = n - 1;

        while (left <= right) {
            int middle = (left + right) / 2;

            if (middle > 0 && nums[middle - 1] > nums[middle]) return nums[middle];

            if (nums[middle] > nums[right]) left = middle + 1;
            else right = middle - 1;
        }
        return -1;
    }
}
