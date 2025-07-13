package AlgorithmsAndDataStructure.week_24;

import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

public class MinimumCostToHireKWorkers_857_Hard {
    public static void main(String[] args){}

    public static double minCostToHireWorkers(int[] quality, int[] wage, int k) {
        //n -> workers
        //quality[i] -> quality of i worker
        //wage[i] -> minimum wage of the i worker

        //Goal: Hire k workers following the rules -> find the least amount of money needed
        double[][] workers = new double[quality.length][2];
        for (int i = 0; i < quality.length; i++) {
            workers[i] = new double[]{wage[i] * 1.0 / quality[i],
                    quality[i] * 1.0 };
        }

        Arrays.sort(workers, (a, b) -> Double.compare(a[0], b[0]));
        double res = Double.MAX_VALUE;
        double qualitySum = 0;
        PriorityQueue<Double> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        for (double[] worker : workers) {
            qualitySum += worker[1];
            maxHeap.offer(worker[1]);

            if (maxHeap.size() == k + 1) qualitySum -= maxHeap.poll();
            if (maxHeap.size() == k) res = Math.min(res, qualitySum * worker[0]);
        }
        return res;
    }
}