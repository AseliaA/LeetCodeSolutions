package AlgorithmsAndDataStructure.week_15;

import java.util.Arrays;

public class IncrementSubmatricesByOne_2536_Medium {
    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(rangeAddQueries(3, new int[][]{
                {1,1,2,2},
                {0,0,1,1}})));
    }

    //Ver from lecture
    //Time Comp: O(n^2)
    //Memory Comp: O(n^2)
    public static int[][] rangeAddQueries(int n, int[][] queries) {
        int[][] a = new int[n + 2][n + 2];

        for (int[] query : queries) {
            int r1 = query[0] + 1;
            int c1 = query[1] + 1;
            int r2 = query[2] + 1;
            int c2 = query[3] + 1;

            a[r1][c1] += 1;
            a[r2 + 1][c1] -= 1;

            a[r1][c2 + 1] -= 1;
            a[r2 + 1][c2 + 1] += 1;
        }

        for (int r = 1; r <= n; r++) {
            for (int c = 1; c <= n; c++) {
                a[r][c] = (a[r - 1][c] + a[r][c - 1] - a[r - 1][c - 1]) + a[r][c];
            }
        }

        int[][] result = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                result[i][j] = a[i + 1][j + 1];
            }
        }
        return result;
    }
}
