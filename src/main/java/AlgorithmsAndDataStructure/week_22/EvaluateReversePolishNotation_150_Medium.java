package AlgorithmsAndDataStructure.week_22;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashSet;
import java.util.Set;

public class EvaluateReversePolishNotation_150_Medium {
    public static void main(String[] args){
        System.out.println(evalRPN(new String[]{"2","1","+","3","*"}));
        System.out.println(evalRPN(new String[]{"4","13","5","/","+"}));
        System.out.println(evalRPN(new String[]{"10","6","9","3","+","-11","*","/","*","17","+","5","+"}));
    }

    public static int evalRPN(String[] tokens) {
        if (tokens == null || tokens.length == 0) return 0;

        Set<String> charSet = new HashSet<>();
        charSet.add("+");
        charSet.add("-");
        charSet.add("*");
        charSet.add("/");

        Deque<Integer> stack = new ArrayDeque<>();
        for (int i = 0; i < tokens.length; i++) {
            if (charSet.contains(tokens[i])) {
                int valueTwo = stack.pop();
                int valueOne = stack.pop();

                switch(tokens[i]) {
                    case "+" -> stack.push(valueOne + valueTwo);
                    case "-" -> stack.push(valueOne - valueTwo);
                    case "*" -> stack.push(valueOne * valueTwo);
                    case "/" -> stack.push(valueOne / valueTwo);
                }
            } else {
                int value = Integer.parseInt(tokens[i]);
                stack.push(value);
            }
        }
        return stack.pop();
    }
}
