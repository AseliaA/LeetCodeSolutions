package MathAlgo_withAzret.week_10;

public class NumberOf1Bits_191 {
    public static void main(String[] args) {
        System.out.println("(v1-2) -> " +hammingWeight(12) + " - BitWise: " + bitWise(12));
        System.out.println("(v3) -> " + hammingWeightBrianKernighansAlgo(12) + " - BitWise: " + bitWiseBuildInMethod(12));
        System.out.println("(v4) -> " + hammingWeightBuildInMethod(12));

        System.out.println("my ver: 12 -> " + numberOfBits(12));
        System.out.println("my ver: 12 -> " + numberOfBits(11));

//        System.out.println(hammingWeight(29) + " - BitWise: " + bitWise(29));
//        System.out.println(hammingWeight(11) + " - BitWise: " + bitWise(11));
//        System.out.println(hammingWeight(128) + " - BitWise: " + bitWise(128));
//        System.out.println(hammingWeight(2147483645) + " - BitWise: " + bitWise(2147483645));
    }

    //after watching bits lesson from Azret
    public static int numberOfBits(int n){
        int number = 0;
        for(int i = 0; i < 30; i++) {
            int bitmask = 1 << i;
            if((n & bitmask) > 0){
                number++;
            }
        }
        return number;
    }

    //v4
    //Time Complexity: O(log n) - very fast, java optimized native code
    //Memory Complexity: O(1)
    //Algo Class, Azret's Solution
    public static int hammingWeightBuildInMethod(int n){
        return Integer.bitCount(n);
    }

    //v3
    //Time Complexity: O(k) - depending how many "1" bits(k) are in n
    //Memory Complexity: O(1)
    //AI Suggestion
    public static int hammingWeightBrianKernighansAlgo(int n){
        int hammingWeight = 0;

        while (n != 0){
            n = n & ( n - 1);
            hammingWeight++;
        }
        return hammingWeight;
    }

    //v1-2
    //Time Complexity: O(log n)
    //Memory Complexity: O(1)
    //Time Took: 15 minutes by myself
    public static int hammingWeight(int n) {
        int result = 0;

        while (n != 0) {
            result += (n % 2);
            n = n / 2;
        }
        return result;
    }

    //v3 - is better due to Build-In methods are more preferable due to better performance
    //and already being tested and optimized for all cases (edge cases including)
    //Time Complexity: O(log n)
    //Memory Complexity: O(log n)
    //AI suggestion
    public static String bitWiseBuildInMethod(int n){
        return Integer.toBinaryString(n);
    }

    //v1-2
    //Time Complexity: O(log n)
    //Memory Complexity: O(log n)
    //Time Took: 10 minutes by myself
    public static String bitWise(int n){
        StringBuilder result = new StringBuilder();
        while(n != 0){
            result.append(n % 2);
            n = n / 2;
        }
        return result.reverse().toString();
    }
}
