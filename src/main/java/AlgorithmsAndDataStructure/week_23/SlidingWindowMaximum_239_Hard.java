package AlgorithmsAndDataStructure.week_23;

import java.util.ArrayDeque;
import java.util.Deque;

//5
public class SlidingWindowMaximum_239_Hard {
    public static void main(String[] args) {}

    public int[] maxSlidingWindow(int[] nums, int k) {
        if (nums == null || k <= 0) {
            return new int[0];
        }

        Deque<Integer> deque = new ArrayDeque<>();
        int[] result = new int[nums.length - k + 1];
        int insertIndex = 0;

        for (int i = 0; i < nums.length; i++) {
            while (!deque.isEmpty() && deque.peekFirst() < i - k + 1) {
                deque.pollFirst();
            }

            while (!deque.isEmpty() && nums[i] > nums[deque.peekLast()]) {
                deque.pollLast();
            }

            deque.offer(i);
            if (i >= k - 1) {
                result[insertIndex++] = nums[deque.peekFirst()];
            }
        }
        return result;
    }
}
