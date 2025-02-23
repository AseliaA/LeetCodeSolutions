package AlgorithmsAndDataStructure.week_15;

import java.util.Arrays;

public class RangeAddition_370_Medium {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(getModifiedArray1(5, new int[][]{
                {1,3,2},
                {2,4,3},
                {0,2,-2}})));

        System.out.println(Arrays.toString(getModifiedArray2(5, new int[][]{
                {1,3,2},
                {2,4,3},
                {0,2,-2}})));
    }

    //ver2, from lecture -> PASS
    //Time comp: O(k) for to process updates, O(n) to compute prefix sum -> O(n + k)
    //Memory comp: O(n)
    public static int[] getModifiedArray2(int length, int[][] updates) {
        int[] result = new int[length];

        for (int[] update : updates) {
            int left = update[0];
            int right = update[1];
            int increment = update[2];

            result[left] += increment;

            if (right + 1 < length) {
                result[right + 1] -= increment;
            }
        }

        for (int i = 1; i < length; i++) {
            result[i] += result[i - 1];
        }
        return result;
    }

    //ver1, own solution -> PASS
    //Time Comp: O(n * k)
    //Memory Comp: O(n)
    public static int[] getModifiedArray1(int length, int[][] updates) {
        int[] result = new int[length];
        Arrays.fill(result, 0);

        for (int i = 0; i < updates.length; i++) {
            int left = updates[i][0];
            int right = updates[i][1];
            int by = updates[i][2];
            for (int j = left; j <= right; j++) {
                result[j] += by;
            }
        }
        return result;
    }
}
