package AlgorithmsAndDataStructure.week_24;

import java.util.Collections;
import java.util.PriorityQueue;

//1
public class EqualSumArraysWithMinimumNumberOfOperations_1775_Medium {
    public static void main(String[] args) {
    }

    public int minOperations(int[] nums1, int[] nums2) {
        if (nums1.length > nums2.length * 6 ||
                nums2.length > nums1.length * 6) return -1;

        int sum1 = 0;
        int sum2 = 0;
        for (int x : nums1) sum1 += x;
        for (int x : nums2) sum2 += x;

        if (sum1 > sum2) {
            int[] temp = nums1;
            nums1 = nums2;
            nums2 = temp;

            int tempSum = sum1;
            sum1 = sum2;
            sum2 = tempSum;
        }

        PriorityQueue<Integer> pq1 = new PriorityQueue<>();
        PriorityQueue<Integer> pq2 = new PriorityQueue<>(Collections.reverseOrder());
        for (int x : nums1) pq1.offer(x);
        for (int x : nums2) pq2.offer(x);

        int operations = 0;
        for (; sum1 < sum2; operations++) {
            if (pq2.isEmpty() || pq2.peek() - 1 < 6 - pq1.peek()) {
                sum1 += 6 - pq1.poll();
            } else {
                sum2 -= pq2.poll() - 1;
            }
        }
        return operations;
    }
}
