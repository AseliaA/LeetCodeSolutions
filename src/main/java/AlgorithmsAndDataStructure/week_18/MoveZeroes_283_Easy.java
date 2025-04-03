package AlgorithmsAndDataStructure.week_18;

public class MoveZeroes_283_Easy {
    public static void main(String[] args){}

    public static int[] moveZeroes(int[] nums) {
        int insertPosition = 0;
        for (int x : nums) {
            if (x != 0) {
                nums[insertPosition++] = x;
            }
        }

        while (insertPosition < nums.length) {
            nums[insertPosition++] = 0;
        }
        return nums;
    }
}
