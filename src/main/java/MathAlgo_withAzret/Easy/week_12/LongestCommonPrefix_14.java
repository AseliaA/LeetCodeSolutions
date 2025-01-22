package MathAlgo_withAzret.Easy.week_12;

public class LongestCommonPrefix_14 {
    public static void main(String [] args) {
        System.out.println(longestPrefix(new String[]{"flower","flow","flight"}));
        System.out.println(longestPrefix(new String[]{"dog","racecar","car"}));
    }

    public static String longestPrefix(String [] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }

        String prefix = strs[0];
        for (int i = 0; i < strs.length; i++) {
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
            }
        }
        return prefix;
    }
}
