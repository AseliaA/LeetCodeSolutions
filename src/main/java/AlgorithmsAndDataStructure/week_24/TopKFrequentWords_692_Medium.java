package AlgorithmsAndDataStructure.week_24;

import java.util.*;

public class TopKFrequentWords_692_Medium {
    public static void main(String[] args) {
    }

    public static List<String> topKFrequent(String[] words, int k) {
        List<String> result = new LinkedList<>();

        Map<String, Integer> freqMap = new HashMap<>();
        for (int i = 0; i < words.length; i++) {
            if (freqMap.containsKey(words[i])) {
                freqMap.put(words[i], freqMap.get(words[i]) + 1);
            } else {
                freqMap.put(words[i], 1);
            }
        }

        PriorityQueue<Map.Entry<String, Integer>> freqHeap = new PriorityQueue<>(
                (a, b) -> (a.getValue() == b.getValue() ? // if freq equals
                        b.getKey().compareTo(a.getKey()) : //put lexicographical larger first
                        a.getValue() - b.getValue()) //otherwise, the least freq to the front
        );

        for (Map.Entry<String, Integer> entry : freqMap.entrySet()) {
            freqHeap.offer(entry);

            if (freqHeap.size() == k + 1) {
                freqHeap.poll();
            }
        }

        while (!freqHeap.isEmpty()) {
            result.add(0, freqHeap.poll().getKey());
        }
        return result;
    }
}