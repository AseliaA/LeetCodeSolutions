package MathAlgo_withAzret.Easy.week_11;

public class ReverseBits_190 {
    public static void main(String [] args) {
        System.out.println(reverseBits_AzretVer(43261596));
        //correct return: 964176192
    }


    //TODO come back to the solution and repeat it in sometime
    //Azret's version
    //time comp: O(1)
    //memory comp: O(1)
    public static int reverseBits_AzretVer(int n) {
        int result = 0;
        for (int i = 0; i <= 31; i++) {
            int bitmask = (n >> i) & 1;
            if (bitmask == 1) {
                result |= 1 << (31 - i);
            }
        }
        return result;
    }
}