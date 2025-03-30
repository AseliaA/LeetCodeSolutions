package AlgorithmsAndDataStructure.week_17;

public class SqrtX_69_Easy {
    public static void main(String[] args){
        System.out.println(mySqrt(16));
        System.out.println(mySqrt(10));
        System.out.println(mySqrt(8));
    }

    public static int mySqrt(int x) {
        if (x == 0 || x == 1) return x;

        int answer = -1;
        int left = 0;
        int right = x;

        while (left <= right) {
            int middle = left + (right - left) / 2;

            if ((long) middle * middle > (long) x) {
                right = middle - 1;
            } else {
                answer = middle;
                left = middle + 1;
            }
        }
        return answer;
    }
}