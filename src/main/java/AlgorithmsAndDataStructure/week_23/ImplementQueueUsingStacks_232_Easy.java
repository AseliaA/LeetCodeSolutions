package AlgorithmsAndDataStructure.week_23;

import java.util.Stack;

//1
public class ImplementQueueUsingStacks_232_Easy {
    static private final Stack<Integer> input = new Stack<>();
    static private final Stack<Integer> output = new Stack<>();

    public static void MyQueue(String[] args) {}

    public static void push(int x) {
        input.push(x);
    }

    public static int pop() {
        int x = peek();
        output.pop();
        return x;
    }

    public static int peek() {
        if (output.isEmpty()) {
            while (!input.isEmpty()) {
                output.push(input.pop());
            }
        }
        return output.peek();
    }

    public static boolean isEmpty() {
        return input.isEmpty() && output.isEmpty();
    }
}