package FoundationsForDiscreteMathematicsandDSA_withAzret.week_11;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MajorityElement_169 {
    public static void main(String [] args) {
        System.out.println("Ver1: " + majorityElement_myVer1(new int []{1,2,3,2,5,2,2}));
        System.out.println("Ver1 Azret: " + majorityElement_ver1_Azret(new int []{1,2,3,2,5,2,2}));
        System.out.println("Ver2: " + majorElement_myVer2(new int []{1,2,3,2,5,2,2}));
        System.out.println("Ver2: " + majorityElement_ver3_Azret(new int []{1,2,3,2,5,2,2}));
    }

    //ver3 Azret's
    public static int majorityElement_ver3_Azret(int [] nums) {
        Arrays.sort(nums);
        return nums[nums.length / 2];
    }

    //ver 2 with help, also Azret's solution
    //time comp: O(n)
    //memory comp: O(1)
    //good solution, vote system. Optimized Boyer-Moore Algorithm. Best Solution
    public static int majorElement_myVer2(int [] nums) {
        int number = -1;
        int count = 0;

        for(int num : nums){
            if(count == 0) {
                number = num;
            }

            if(number == num){
                count++;
            } else count--;
        }

//        for(int num : nums) {
//            if(count == 0) number = num;
//
//            count += (num == number) ? 1 : -1; //with Ternary Operators
//        }
        return number;
    }

    //ver1 better, Azret's solution
    //time comp: O(n)
    //memory comp: O(n)
    public static int majorityElement_ver1_Azret(int [] nums) {
        Map<Integer, Integer> intFreq = new HashMap<>();
        for(int num : nums){
            intFreq.put(num, intFreq.getOrDefault(num, 0) + 1);
        }

        for(Map.Entry<Integer, Integer> entry : intFreq.entrySet()) {
            if(entry.getValue() > nums.length / 2) {
                return entry.getKey();
            }
        }
        return Integer.MIN_VALUE;
    }

    //my ver1 with help
    //time comp: O(n)
    //memory comp: O(n)
    //not the best solution, unnecessary steps. Not optimized
    public static int majorityElement_myVer1(int [] nums) {
        int intWithHighestFreq = -1;
        int frequencyOfInt = -1;

        Map<Integer, Integer> intFreq = new HashMap<>();
        for(int num : nums){
            intFreq.put(num, intFreq.getOrDefault(num, 0) + 1);
        }

        for(Map.Entry<Integer, Integer> entry : intFreq.entrySet()) {
            if(entry.getValue() > frequencyOfInt) {
                frequencyOfInt = entry.getValue();
                intWithHighestFreq = entry.getKey();
            }
        }
        return intWithHighestFreq;
    }
}
