package Easy;

public class Number_of_Steps_to_Reduce_a_Number_to_Zero_1342 {
    public static void main(String[] args) {
        System.out.println(numberOfSteps(14)); //output: 6
        System.out.println(numberOfSteps(8)); //output: 4
        System.out.println(numberOfSteps(123)); //output: 12
    }


    //v1 - Runtime: 0ms, beats 100% | Memory: 40.42mb, beats 43.97%
    //Time took: 10 minutes, no hints/no help
    public static int numberOfSteps(int num) {
        int count = 0;
        while (num > 0) {
            if (num != 0 && num % 2 == 0) {
                num = num / 2;
                count++;
            } else if (num != 0 && num % 2 != 0) {
                num = num - 1;
                count++;
            } else
                return 0;
        }
        return count;
    }
}

