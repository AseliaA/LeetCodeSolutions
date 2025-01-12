package MathAlgo_withAzret.Easy;

public class ReverseString_344 {
    public static void main(String [] args) {
        char [] s = {'h','e','l','l','o'};
        char [] c = {'H','a','n','n', 'a', 'h'};

        System.out.println(reverseString(s));
        System.out.println(reverseString(c));
    }

    //v1 - Runtime: 0ms, beats 100% | Memory: 49.24mb, beats 43.28%
    //Time Complexity: O(n)
    //Memory Complexity: 0(1)
    //Time took: 5 minutes by myself
    public static char [] reverseString(char [] s) {
        int end = s.length - 1;
        for (int i = 0; i < s.length / 2; i++) {
            char exchange = s[i];
            s[i] = s[end];
            s[end] = exchange;
            end--;
        }
        return s;
    }
}
