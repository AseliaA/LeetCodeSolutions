package MathAlgo_withAzret.Easy.week_10;

public class SingleNumber_136 {
    public static void main(String[] args) {
        System.out.println(singleNumber_myVer(new int[]{1, 2, 2, 1, 4}));
        System.out.println(singleNumber_myVer(new int[]{1, 2, 3, 1, 3}));
        System.out.println("----------------------");
        System.out.println(singleNumber_azretVer(new int[]{1, 2, 2, 1, 4}));
        System.out.println(singleNumber_azretVer(new int[]{1, 2, 3, 1, 3}));
    }


    //Azret's ver
    public static int singleNumber_azretVer(int [] nums) {
        int answer = 0;
        for(int x : nums){
            answer ^= x; //answer = answer ^ x;
        }
        return answer;
    }


    //v4 - Runtime: 1ms, beats 99.90% | Memory: 45.95mb, beats 75.78%
    //Time Complexity: O(n)
    //Memory Complexity: O(1)
    // Time took: 10 minutes by myself after watching the lesson recording, but without seeking the ready solution
    public static int singleNumber_myVer(int[] nums) {
        int result = nums[0];
        int xorItem = 1;

        while (xorItem < nums.length) {
            result = result ^ nums[xorItem];
            xorItem++;
        }
        return result;
    }
}
