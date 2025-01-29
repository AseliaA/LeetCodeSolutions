package MathAlgo_withAzret.week_13;

import java.util.HashSet;

public class LongestPalindrome_409_Easy {
    public static void main(String [] args) {
        System.out.println(longestPalindrome("abccccdd"));
        System.out.println(longestPalindrome("aaa"));
        System.out.println(longestPalindrome("b"));
    }

    public static int longestPalindrome(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }

        HashSet<Character> hashSet = new HashSet<>();
        int palindromeLength = 0;
        for (char ch : s.toCharArray()) {
            if (hashSet.contains(ch)) {
                hashSet.remove(ch);
                palindromeLength += 2;
            } else {
                hashSet.add(ch);
            }
        }

        if (!hashSet.isEmpty()) {
            palindromeLength++;
        }
        return palindromeLength;
    }
}
