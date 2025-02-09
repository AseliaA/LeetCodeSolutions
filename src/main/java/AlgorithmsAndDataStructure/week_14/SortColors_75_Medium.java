package AlgorithmsAndDataStructure.week_14;

public class SortColors_75_Medium {
    public static void main(String[] args) {

    }

    //Could remember solution from week_13 and implement it
    //Time comp: O(n)
    //Memory comp: O(1)
    public static int[] sortColor_ver1(int [] nums) {
        int insertPosition = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) swap(nums, insertPosition++, i);

        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) swap(nums, insertPosition++, i);
        }
        return nums;
    }

    public static void swap(int[] nums, int x, int y) {
        int temp = nums[x];
        nums[x] = nums[y];
        nums[y] = temp;
    }
}
