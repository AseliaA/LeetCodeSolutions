package MathAlgo_withAzret.week_13;

import java.util.Stack;

public class ValidParentheses_20_Easy {
    public static void main(String [] args) {
        System.out.println(isValid_ver1("()"));
        System.out.println(isValid_ver1("()[]{}"));
        System.out.println(isValid_ver1("(]"));
        System.out.println(isValid_ver1("([])"));
    }

    //Time comp: O(n)
    //Memory comp: O(n)
    //Good but there are better ways
    public static boolean isValid_ver1(String s) {
        Stack<Character> stack = new Stack<>();
        for (char ch : s.toCharArray()) {
            if (ch == '(') stack.push(')');
            else if (ch == '[') stack.push(']');
            else if (ch == '{') stack.push('}');
            else if (stack.isEmpty() || stack.pop() != ch) return false;
        }
        return stack.isEmpty();
    }
}
