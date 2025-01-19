package MathAlgo_withAzret.Easy.week_11;

import java.util.HashMap;
import java.util.Map;

public class FirstUniqueCharacterInAString_387 {
    public static void main(String [] args) {
        System.out.println("ver1: " + singleLetter_ver1("leetcode"));
        System.out.println("ver1: " + singleLetter_ver1("loveleetcode"));
        System.out.println("ver1: " + singleLetter_ver1("aabb"));
    }

    //ver1, ny myself, about 20+ minutes, couple googles about HashMap methods
    //time comp: O(n)
    //memeory comp: O(n)
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
