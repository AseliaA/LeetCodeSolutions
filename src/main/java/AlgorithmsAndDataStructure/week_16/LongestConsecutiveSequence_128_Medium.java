package AlgorithmsAndDataStructure.week_16;

import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSequence_128_Medium {
    public static void main(String[] args) {

    }

    public static int longerConsecutiveSequence1(int [] nums){
        Set<Integer> set = new HashSet<>();
        for (int n : nums) {
            set.add(n);
        }

        int longestStreak = 0;
        for (int n : set) {
            if (!set.contains(n - 1)) {
                int streakStart = n;
                int streakEnd = n;

                while (set.contains(streakEnd + 1)) {
                    streakEnd++;
                }

                longestStreak = Math.max(longestStreak, streakEnd - streakStart + 1);
            }
        }
        return longestStreak;
    }
}