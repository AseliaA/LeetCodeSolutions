package AlgorithmsAndDataStructure.week_17;

public class FirstBadVersion_278_Easy {
    public static void main(String[] args) {}

    public static int firstBadVersion(int n) {
        int answer = -1;
        int left = 1;
        int right = n;

        while (left <= right) {
            int middle = left + (right - left) / 2;

            if (isBadVersion(middle)) {
                answer = middle;
                right = middle - 1;
            } else {
                left = middle + 1;
            }
        }
        return answer;
    }

    /* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */
    public static boolean isBadVersion(int k) {
        //logic
        return true;
    }
}
