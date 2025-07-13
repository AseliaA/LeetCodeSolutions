package AlgorithmsAndDataStructure.week_24;

import java.util.Comparator;
import java.util.PriorityQueue;

public class MaximumAveragePassRatio_1792_Medium {
    public static void main(String[] args) {}

    public static double maxAverageRatio(int[][] classes, int extraStudents) {
        PriorityQueue<double[]> maxPassRatioHeap = new PriorityQueue<>(
                Comparator.comparingDouble(o -> -o[0])
        );

        for (int[] c : classes) {
            double p = c[0], t = c[1];
            maxPassRatioHeap.offer(new double[]{maxPassRatio(p, t), p, t});
        }

        while (extraStudents > 0) {
            double[] top = maxPassRatioHeap.poll();
            double p = top[1], t = top[2];
            maxPassRatioHeap.offer(new double[]{maxPassRatio(p + 1, t + 1), p + 1, t + 1});
            extraStudents--;
        }

        double answer = 0.0;
        while (!maxPassRatioHeap.isEmpty()) {
            double[] top = maxPassRatioHeap.poll();
            double p = top[1], t = top[2];
            answer += p / t;
        }
        return answer / classes.length;
    }

    public static double maxPassRatio(double pass, double total) {
        return (pass + 1) / (total + 1) - pass/total;
    }
}
