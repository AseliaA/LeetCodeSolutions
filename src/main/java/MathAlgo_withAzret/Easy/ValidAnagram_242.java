package MathAlgo_withAzret.Easy;

import java.util.Arrays;

public class ValidAnagram_242 {
    public static void main(String [] args){
//        System.out.println(isAnagram("anagram", "nagaram"));
//        System.out.println(isAnagram("rat", "car"));

        System.out.println(isAnagram2("anagram", "nagaram"));
        System.out.println(isAnagram2("rat", "car"));
    }

    public static boolean isAnagram2(String s, String t){
        if(s.length() != t.length()) return false;

        int [] lettersCount = new int [26];

        for(int i = 0; i < lettersCount.length; i++){
            lettersCount[s.charAt(i) - 'a']++;
            lettersCount[t.charAt(i) - 'a']--;
        }

        for(int c : lettersCount){
            if(c != 0) return false;
        }

        return true;
    }

    //v1
    //Time Complexity: O (n log n) -> not the best
    //Memory Complexity: O(n) -> not the best
    //Time took: 10 minutes by myself
    public static boolean isAnagram(String s, String t){
        char [] sArray = s.toCharArray();
        char [] tArray = s.toCharArray();

        Arrays.sort(sArray);
        Arrays.sort(tArray);

        return Arrays.equals(sArray, tArray);
    }
}
