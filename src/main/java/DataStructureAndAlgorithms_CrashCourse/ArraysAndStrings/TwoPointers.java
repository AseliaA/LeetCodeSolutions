package DataStructureAndAlgorithms_CrashCourse.ArraysAndStrings;

public class TwoPointers {
    public static void main(String[] args) {
        //Check if Palindrome with "Two Pointers" method
        System.out.println(checkIfPalindrome("abcbca"));
    }

    public static boolean checkIfPalindrome(String array) {
        //without edge cases
        int left = 0;
        int right = array.length() - 1;

        while (left < right) {
            if (array.charAt(left) != array.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
