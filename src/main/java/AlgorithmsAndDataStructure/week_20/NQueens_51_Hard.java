package AlgorithmsAndDataStructure.week_20;

import java.util.ArrayList;
import java.util.List;

public class NQueens_51_Hard {
    public static void main(String[] args) {
        System.out.println(solveNQueens(4));
    }

    static int dimension;
    static int[] row;
    static int[] diagMain;
    static int[] diagAux;
    static List<List<String>> answers;
    static char[][] current;

    public static List<List<String>> solveNQueens(int n) {
        dimension = n;
        row = new int[n];
        diagMain = new int[2 * n];
        diagAux = new int[2 * n];
        answers = new ArrayList<>();
        current = new char[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                current[i][j] = '.';
            }
        }
        backtrack(0);
        return answers;
    }

    public static void backtrack(int c) {
        if (c == dimension) {
            List<String> result = new ArrayList<>();
            for (int i = 0; i < dimension; i++) {
                result.add(new String(current[i]));
            }
            answers.add(result);
        }

        for (int r = 0; r < dimension; r++) {
            if (row[r] > 0 || diagAux[r + c] > 0 || diagMain[r - c + dimension - 1] > 0) {
                continue;
            }

            current[r][c] = 'Q';
            row[r] = diagAux[r + c] = diagMain[r - c + dimension - 1] = 1;
            backtrack(c + 1);
            current[r][c] = '.';
            row[r] = diagAux[r + c] = diagMain[r - c + dimension - 1] = 0;
        }
    }
}