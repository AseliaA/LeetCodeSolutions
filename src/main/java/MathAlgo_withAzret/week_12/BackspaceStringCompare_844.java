package MathAlgo_withAzret.week_12;

public class BackspaceStringCompare_844 {
    public static void main(String [] args) {
        System.out.println(backspaceCompare_ver1("ab#c", "ad#c"));
    }

    public static boolean backspaceCompare_ver1(String s, String t) {
        return build(s).equals(build(t));
    }

    public static String build(String str) {
        StringBuilder stringBld = new StringBuilder();
        for (char c : str.toCharArray()) {
            if (c != '#') {
                stringBld.append(c);
            } else {
                stringBld.deleteCharAt(stringBld.length() - 1);
            }
        }
        return stringBld.toString();
    }
}
