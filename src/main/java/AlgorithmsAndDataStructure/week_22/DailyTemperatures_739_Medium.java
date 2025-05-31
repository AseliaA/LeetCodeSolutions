package AlgorithmsAndDataStructure.week_22;

import java.util.Stack;

public class DailyTemperatures_739_Medium {
    public static void main(String[] args) {

    }

    //Time Complexity: O(n)
    //Overall Space Complexity: O(n)
    //Auxiliary Space Complexity: O(n)
    public static int[] dailyTemps(int[] temps) {
        int l = temps.length;
        int[] nge = new int[l];
        Stack<Integer> stack = new Stack<>();

        for (int i = l - 1; i >= 0; i--) {
            while (!stack.isEmpty() && temps[stack.peek()] <= temps[i]) {
                stack.pop();
            }

            if (!stack.isEmpty()) {
                nge[i] = stack.peek() - i;
            }

            stack.push(i);
        }
        return nge;
    }

    //brute force, slow
    //Time complexity: O(n^2)
    //Memory complexity: O(n)
    public static int[] dailyTemps1(int[] temps) {
        int[] answers = new int[temps.length];

        for (int target = 0; target < temps.length; target++) {
            for (int i = target + 1; i < temps.length; i++) {
                if (temps[target] < temps[i]) {
                    answers[target] = i - target;
                    break;
                }
            }
        }
        return answers;
    }
}
