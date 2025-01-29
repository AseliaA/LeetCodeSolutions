package DataStructureAndAlgorithms_CrashCourse.ArraysAndStrings;

import java.util.Arrays;

public class TwoPointers {
    public static void main(String[] args) {
        //Check if Palindrome with "Two Pointers" method
        System.out.println(checkIfPalindrome("abcbca"));

        //Reverse String with "Two Pointers" method
        System.out.println(reverseString(new char[]{'h', 'e', 'l', 'l', 'o'}));

        /*
        Given an integer array nums sorted in non-decreasing order,
        return an array of the squares of each number sorted in non-decreasing order.

        Input: nums = [-4,-1,0,3,10]
        Output: [0,1,9,16,100]
        Explanation: After squaring, the array becomes [16,1,0,9,100].
        After sorting, it becomes [0,1,9,16,100].
        */
        int [] newNumArray = sortedSquares(new int[]{-4, -1, 0, 3, 10});
        System.out.println(
                Arrays.toString(newNumArray));
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

    public static char[] reverseString(char[] s) {
        //without edge cases
        int left = 0;
        int right = s.length - 1;

        while (left < right) {
            char tem = s[left];
            s[left] = s[right];
            s[right] = tem;

            left++;
            right--;
        }
        return s;
    }

    public static int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];

        int left = 0;
        int right = nums.length - 1;

        for (int i = n - 1; i >= 0; i--) {
            int square;
            if (Math.abs(nums[left]) < Math.abs(nums[right])) {
                square = nums[right];
                right--;
            } else {
                square = nums[left];
                left++;
            }
            result[i] = square * square;
        }
        return result;
    }
}
