package MathAlgo_withAzret.Easy.week_11;

import java.util.Arrays;

public class Convert1DArrayInto2DArray_2022 {
    public static void main(String [] args) {
        System.out.println("Ver1: " + Arrays.deepToString(construct2DArray_ver1(new int[]{1, 2, 3, 4}, 2, 2)));
        System.out.println("Ver2: " + Arrays.deepToString(construct2DArray_ver2(new int[]{1, 2, 3, 4}, 2, 2)));
    }

    //ver2 from Azret
    public static int[][] construct2DArray_ver2(int [] original, int m, int n) {
        if (original.length != m * n) return new int[0][0];

        int [][] twoDArray = new int[m][n];
        for (int i = 0; i < original.length; i++) {
            twoDArray[i / n][i % n] = original[i];
        }
        return twoDArray;
    }

    //ver1 from Azret
    public static int[][] construct2DArray_ver1(int [] original, int m, int n){
        if (original.length != m * n) return new int[0][0];

        int [][] twoDArray = new int [m][n];
        int index = 0;
        for (int row = 0; row < m; row++) {
            for (int col = 0; col < n; col++) {
                twoDArray[row][col] = original[index++];
            }
        }
        return twoDArray;
    }
}
