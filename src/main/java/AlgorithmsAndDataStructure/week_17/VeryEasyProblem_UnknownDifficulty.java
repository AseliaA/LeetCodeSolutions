package AlgorithmsAndDataStructure.week_17;

public class VeryEasyProblem_UnknownDifficulty {
    public static void main(String[] args) {
        System.out.println("Result: " + minSecondsNeeded(4,1,1));
    }

    //Not working, never ending loop -> will continue debugging
    public static int minSecondsNeeded(int N, int x, int y) {
        int answer = -1;
        int left = 0;
        int right = (int) 1e9;
        N--;

        while (left <= right) {
            int middle = left + (left + right) / 2;
            if (middle / x + middle/ y >= N) {
                answer = middle;
                right = middle - 1;
            } else {
                left = middle + 1;
            }
        }
        return answer + Math.min(x,y);
    }
}
