package LeetCodeProblems.Easy;

public class Jewels_and_Stones_771 {
    public static void main(String[] args) {
        System.out.println(numJewelsInStones("aA", "aAAbbbb")); //3
        System.out.println(numJewelsInStones("z", "ZZ")); //0
    }

    //v1 - Runtime: 0ms, beats 100% | Memory: 41.33mb, beats 94.54%
    //Time took: 5 minutes by myself
    public static int numJewelsInStones(String jewels, String stones) {
        char [] jewelsArray = jewels.toCharArray();
        char [] stonesArray = stones.toCharArray();
        int count = 0;
        for(int j = 0; j < jewelsArray.length; j++){
            for(int s = 0; s < stonesArray.length; s++){
                if (jewelsArray[j] == stonesArray [s]) {
                    count++;
                }
            }
        }
        return count;
    }
}
