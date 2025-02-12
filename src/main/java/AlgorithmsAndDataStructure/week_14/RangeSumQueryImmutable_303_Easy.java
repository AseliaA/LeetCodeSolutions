package AlgorithmsAndDataStructure.week_14;

public class RangeSumQueryImmutable_303_Easy {
    static int[] prefix;
    public static void main(String[] args) {
        NumArray(new int[]{-2, 0, 3, -5, 2, -1});
    }
    public static void NumArray(int [] nums) {
        int n = nums.length;
        prefix = new int[n + 1];
        prefix[0] = 0;

        for (int i = 1; i <= n; i++) {
            prefix[i] = prefix[i - 1] + nums[i - 1];
        }

        System.out.println(sumRange(0,2));
        System.out.println(sumRange(2,5));
        System.out.println(sumRange(0,5));
    }

    public static int sumRange(int left, int right){
        left++; right++;
        return prefix[right] - prefix[left - 1];
    }
}
