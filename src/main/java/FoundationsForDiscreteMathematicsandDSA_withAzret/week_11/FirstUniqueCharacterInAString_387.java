package FoundationsForDiscreteMathematicsandDSA_withAzret.week_11;

import java.util.HashMap;
import java.util.Map;

public class FirstUniqueCharacterInAString_387 {
    public static void main(String [] args) {
        System.out.println("ver1: " + singleLetter_ver1("leetcode"));
        System.out.println("ver1: " + singleLetter_ver1("loveleetcode"));
        System.out.println("ver1: " + singleLetter_ver1("aabb"));

        System.out.println("--------------------------");
        System.out.println("ver2_Azret: " + singleLetter_ver2Azret("leetcode"));
        System.out.println("ver2_Azret: " + singleLetter_ver2Azret("loveleetcode"));
        System.out.println("ver2_Azret: " + singleLetter_ver2Azret("aabb"));

        System.out.println("--------------------------");
        System.out.println("ver3_Azret: " + singleLetter_ver3Azret("leetcode"));
        System.out.println("ver3_Azret: " + singleLetter_ver3Azret("loveleetcode"));
        System.out.println("ver3_Azret: " + singleLetter_ver3Azret("aabb"));
    }

    //ver3, Azret's version
    //not particularly better solution, more of a different way of solving
    //ChatGPT ->
//    Pros:
//    Memory-efficient, uses no extra data structures.
//            Works for any string containing any characters, not just lowercase letters.
//    Cons:
//    Slower than other methods due to the repeated string scans for indexOf and lastIndexOf.
//    Not as direct or intuitive as the frequency counting methods.
//    Suitability: Less ideal for Google interview, as it is less efficient in terms of time complexity compared to the other two methods.
    //TODO come back to dive a little deeper into string.indexOf() nad string.lastIndexOf() methods
    public static int singleLetter_ver3Azret(String s) {
        int bestIndex = 1000000000;
        for(char c = 'a'; c <= 'z'; c++) {
            int first = s.indexOf(c);
            int last = s.lastIndexOf(c);
            if (first != -1 && first == last) {
                bestIndex = Math.min(bestIndex, first);
            }
        }

        if (bestIndex == 1000000000) bestIndex = -1;
        return bestIndex;
    }

    //ver2, Azret's version
    //Better than ver1 due to memory optimization, from O(n) to O(1) which is significant!
    //TODO come back and dive a little deeper into the freq count (freq[letter - 'a']++
    public static int singleLetter_ver2Azret(String s) {
        int [] freq = new int [26];

        for(int i = 0; i < s.length(); i++) {
            char letter = s.charAt(i);
            freq[letter - 'a']++;
        }

        for(int i = 0; i < s.length(); i++) {
            char letter = s.charAt(i);
            if(freq[letter - 'a'] == 1) {
                return i;
            }
        }
        return -1;
    }

    //not the best, clear solution and correct counting, but not optimized enough!
    //ver1, ny myself, about 20+ minutes, couple googles about HashMap methods
    //time comp: O(n) -> 29ms, Beats 49.84%
    //memory comp: O(n) -> 45.21MB, Beats 62.83%
    public static int singleLetter_ver1(String s) {
        Map<Character, Integer> freq = new HashMap<>();
        char [] letters = s.toCharArray();

        for(char letter : letters) {
            freq.put(letter, freq.getOrDefault(letter, 0) + 1);
        }

        for(int i = 0; i < letters.length; i++) {
            if (freq.get(letters[i]) == 1) {
                return i;
            }
        }
        return -1;
    }
}
