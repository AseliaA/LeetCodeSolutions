package AlgorithmsAndDataStructure.week_19;

import java.util.ArrayList;
import java.util.List;

public class Combinations_77_Medium {
    public static void main(String[] args) {
        System.out.println(combinations(4, 2));
    }

    public static List<List<Integer>> combinations(int n, int k) {
        List<List<Integer>> combs = new ArrayList<>();
        combine(combs, new ArrayList<>(), 1, n , k);
        return combs;
    }

    private static void combine(List<List<Integer>> combs, List<Integer> comb, int start, int n, int k) {
        if (k == 0) {
            combs.add(new ArrayList<>(comb));
            return;
        }

        for (int i = start; i <= n; i++) {
            comb.add(i);
            combine(combs, comb, i + 1, n, k - 1);
            comb.remove(comb.size() - 1);
        }
    }
}
