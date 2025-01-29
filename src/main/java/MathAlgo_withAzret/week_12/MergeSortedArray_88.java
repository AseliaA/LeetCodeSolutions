package MathAlgo_withAzret.week_12;

import java.util.Arrays;

public class MergeSortedArray_88 {
    public static void main(String [] args) {
        System.out.println(Arrays.toString(merge_ver1(new int[]{1,2,3,0,0,0}, 3, new int[]{2,5,6}, 3)));
        System.out.println(Arrays.toString(merge_ver1(new int[]{1,2,3,0,0,0}, 3, new int[]{1,4,6}, 3)));
        System.out.println(Arrays.toString(merge_ver1(new int[]{0}, 1, new int[]{}, 0)));
    }

    public static int[] merge_ver1(int [] num1, int m, int [] num2, int n) {
        int tail1 = m - 1;
        int tail2 = n - 1;
        int insertPosition = m + n - 1;

        while(tail2 >= 0) {
            if (tail1 >= 0 && num1[tail1] > num2[tail2]) {
                num1[insertPosition--] = num1[tail1--];
            } else {
                num1[insertPosition--] = num2[tail2--];
            }
        }
        return num1;
    }
}
