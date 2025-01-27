package MathAlgo_withAzret.Easy.week_13;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix_54_Medium {
    public static void main(String [] args) {
        System.out.println(spiralOrder(new int [][] {
                        {1,2,3},
                        {4,5,6},
                        {7,8,9} }));
    }

    public static List<Integer> spiralOrder(int [] [] matrix) {
        List<Integer> res = new ArrayList<>();
        if (matrix.length == 0 || matrix[0].length == 0) {
            return res;
        }

        int top = 0;
        int bottom = matrix.length - 1;
        int left = 0;
        int right = matrix[0].length - 1;
        while (true) {
            //1. From left to right, top
            for (int i = left; i <= right; i++) res.add(matrix[top][i]);
            if (++top > bottom) break;

            //2. From top to bottom, right
            for (int i = top; i <= bottom; i++) res.add(matrix[i][right]);
            if (left > --right) break;

            //3. From right to left, bottom
            for (int i = right; i >= left; i--) res.add(matrix[bottom][i]);
            if (top > --bottom) break;

            //4. From bottom to top, left
            for (int i = bottom; i >= top; i--) res.add(matrix[i][left]);
            if (++left > right) break;
        }
        return res;
    }
}
