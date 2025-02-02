package MathAlgo_withAzret.week_13;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidParentheses_20_Easy {
    public static void main(String[] args) {
        System.out.println(isValid_ver1("()"));
        System.out.println(isValid_ver1("()[]{}"));
        System.out.println(isValid_ver1("(]"));
        System.out.println(isValid_ver1("([])"));
        System.out.println(isValid_ver1("("));
        System.out.println(isValid_ver1(")"));
        System.out.println(isValid_ver1("{[)]}"));
    }

    //Time comp: O(n)
    //Memory comp: O(n)
    /*Same logic, but more scalable due to if we need to add more types of symbols,
    we don't need to add more "if else", we can just map.put() it */
    public static boolean isValid_ver2(String s) {
        Map<Character, Character> map = new HashMap<>();
        map.put('(', ')');
        map.put('[', ']');
        map.put('{', '}');

        Stack<Character> stack = new Stack<>();
        for (char ch : s.toCharArray()) {
            if (map.containsKey(ch)) {
                stack.push(map.get(ch));
            } else if (stack.isEmpty() || stack.pop() != ch) {
                return false;
            }
        }
        return stack.isEmpty();
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
