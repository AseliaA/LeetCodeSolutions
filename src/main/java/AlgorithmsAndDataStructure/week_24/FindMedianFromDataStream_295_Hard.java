package AlgorithmsAndDataStructure.week_24;

import java.util.Collections;
import java.util.PriorityQueue;

//2
public class FindMedianFromDataStream_295_Hard {
    private PriorityQueue<Integer> maxHeap = new PriorityQueue<>();
    private PriorityQueue<Integer> minHeap = new PriorityQueue<>(Collections.reverseOrder());

    public static void MedianFinder(String[] args) {}

    public void addNum(int num) {
        maxHeap.offer(num);
        minHeap.offer(maxHeap.poll());

        if (minHeap.size() > maxHeap.size()) {
            maxHeap.offer(minHeap.poll());
        }
    }

    public double findMedian() {
        if (maxHeap.size() > minHeap.size()) {
            return maxHeap.peek();
        }
        return (minHeap.peek() + maxHeap.peek()) / 2.0d;
    }
}