package AlgorithmsAndDataStructure.week_18;

import java.util.Arrays;

public class TwoSumII_InputArrayIsSorted_167_Medium {
    public static void main(String[] args){
        System.out.println(Arrays.toString(twoSum(new int[]{2, 7, 11, 15}, 9)));
    }

    public static int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;

        while (numbers[left] + numbers[right] != target) {
            if (numbers[left] + numbers[right] < target) {
                left++;
            } else right--;
        }
        return new int[]{left + 1, right + 1};
    }
}
