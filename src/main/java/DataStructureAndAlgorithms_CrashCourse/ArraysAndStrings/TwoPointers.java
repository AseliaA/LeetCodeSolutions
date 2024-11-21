package DataStructureAndAlgorithms_CrashCourse.ArraysAndStrings;

public class TwoPointers {
    public static void main(String[] args) {
        //Check if Palindrome with "Two Pointers" method
        System.out.println(checkIfPalindrome("abcbca"));

        //Reverse String with "Two Pointers" method
        System.out.println(reverseString(new char[] {'h','e','l','l','o'}));
    }

    public static boolean checkIfPalindrome(String string) {
        //without edge cases
        int left = 0;
        int right = string.length() - 1;

        while (left < right) {
            if (string.charAt(left) != string.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static char[] reverseString(char [] s){
        //without edge cases
        int left = 0;
        int right = s.length - 1;

        while (left < right){
            char tem = s[left];
            s[left] = s[right];
            s[right] = tem;

            left++;
            right--;
        }
        return s;
    }
}
