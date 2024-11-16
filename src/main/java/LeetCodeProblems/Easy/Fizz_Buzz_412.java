package LeetCodeProblems.Easy;

import java.util.ArrayList;
import java.util.List;

public class Fizz_Buzz_412 {
    public static void main(String[] args) {

    }

    //v1 - Runtime:
    public static List<String> fizzBuzz(int n) {
        List<String> returnString = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if ((i % 3 == 0) && (i % 5 == 0)) {
                returnString.add("FizzBuzz");
            } else if (i % 3 == 0) {
                returnString.add("Fizz");
            } else if (i % 5 == 0) {
                returnString.add("Buzz");
            } else returnString.add("" + i);
        }
        return returnString;
    }
}

