package AlgorithmsAndDataStructure.week_22;


import java.util.Scanner;
import java.util.Stack;

public class Rails {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int A = sc.nextInt();
            if (A == 0) break;

            while (true) {
                int B = sc.nextInt();
                if (B == 0) break;

                int current = 1;
                boolean success = true;
                Stack<Integer> stack = new Stack<>();
                for (int i = 2; i <= A; i++) {
                    if (success) {
                        for (; current <= B; current++) {
                            stack.push(current);
                        }

                        if (B != stack.peek()) {
                            success = false;
                        } else {
                            stack.pop();
                        }
                    }
                    B = sc.nextInt();
                }
                System.out.println(success ? "Yes" : "No");
            }
            System.out.println();
        }
    }
}
