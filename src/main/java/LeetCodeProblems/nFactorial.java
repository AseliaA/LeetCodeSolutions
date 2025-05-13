package LeetCodeProblems;

public class nFactorial {
    public static void main(String[] args) {
        System.out.println(isTarget(new int[]{9,3,7}, 13));
    }


    public static boolean isTarget(int[] nums, int target) {
        if (nums == null || nums.length == 0) {
            return false;
        }
        return calc(nums, target, nums[0], 1);
    }

    public static boolean calc(int[] nums, int target, int sum, int indx) {
        if (indx == nums.length) {
            return target == sum;
        }

        return calc(nums, target, sum + nums[indx], indx + 1) ||
                calc(nums, target, sum - nums[indx], indx +1);
    }
}
