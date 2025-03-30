package AlgorithmsAndDataStructure.week_16;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class TopKFrequentElements_347_Medium {
    public static void main(String[] args) {

    }

    public static int[] topKFrequent(int[] nums, int k) {
        //counting freq of numbers in nums
        Map<Integer, Integer> numsCounterMap = new HashMap<>();
        for (int x : nums) {
            numsCounterMap.put(x, numsCounterMap.getOrDefault(x, 0) + 1);
        }

        //creating pairs
        //TODO Create Pair DS if needed
//        List<Pair<Integer, Integer>> sortedFreqList = new ArrayList<>();
//        for (var entry : numsCounterMap.entrySet()) {
//            Pair<Integer, Integer> pairs = new Pair<>(entry.getKey(), entry.getValue());
//            sortedFreqList.add(pairs);
//        }
//
//        //sorting in decending order
//        Collections.sort(sortedFreqList, (fp1, fp2) -> {
//            return fp2.getValue() - fp1.getValue();
//        });
//
//        //result
        int [] result = new int[k];
//        for (int i = 0; i < k; i++) {
//            result[i] = sortedFreqList.get(i).getKey();
//        }

        return result;
    }


    //Pair
//    public class Pair<T, U> {
//        private final T first;
//        private final U second;
//
//        public Pair(T first, U second) {
//            this.first = first;
//            this.second = second;
//        }
//
//        public T getFirst() {
//            return first;
//        }
//
//        public U getSecond() {
//            return second;
//        }
//
//        @Override
//        public String toString() {
//            return "(" + first + ", " + second + ")";
//        }
//    }
}
