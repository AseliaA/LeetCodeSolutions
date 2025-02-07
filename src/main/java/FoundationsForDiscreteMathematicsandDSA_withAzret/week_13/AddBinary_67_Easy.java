package FoundationsForDiscreteMathematicsandDSA_withAzret.week_13;

public class AddBinary_67_Easy {
    public static void main(String [] args) {
        System.out.println(addBinary("11", "1"));
        System.out.println(addBinary("1010", "1011"));
    }

    public static String addBinary(String a, String b) {
        StringBuilder strBuild = new StringBuilder();
        int aIndex = a.length() - 1;
        int bIndex = b.length() - 1;
        int carry = 0;
        while (carry > 0 || aIndex >= 0 || bIndex >= 0) {
            int sum = carry;
            if (aIndex >=0) sum = sum + a.charAt(aIndex--) - '0';
            if (bIndex >=0) sum = sum + b.charAt(bIndex--) - '0';
            carry = sum / 2;
            strBuild.append(sum % 2);
        }
        return strBuild.reverse().toString();
    }
}
