package AlgorithmsAndDataStructure.week_23;

import java.util.ArrayDeque;
import java.util.Deque;

//4
public class ShortestSubarrayWithSumAtLeastK_862_Hard {
    public static void main(String[] args) {}

    public static int shortestSubArray(int[] nums, int K) {
        int L = nums.length;
        int res = L + 1;
        long[] prefixSum = new long[L + 1];

        for (int i = 0; i < L; i++) {
            prefixSum[i + 1] = prefixSum[i] + nums[i];
        }

        Deque<Integer> deque = new ArrayDeque<>();
        for (int i = 0; i < L + 1; i++) {
            while (deque.size() > 0 && prefixSum[i] - prefixSum[deque.getFirst()] >= K) {
              res = Math.min(res, i - deque.pollFirst());
            }

            while (deque.size() > 0 && prefixSum[i] <= prefixSum[deque.getLast()]) {
                deque.pollLast();
            }
            deque.addLast(i);
        }

        return res <= L ? res : -1;
    }
}
