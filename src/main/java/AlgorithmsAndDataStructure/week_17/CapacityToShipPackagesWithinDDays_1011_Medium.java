package AlgorithmsAndDataStructure.week_17;

public class CapacityToShipPackagesWithinDDays_1011_Medium {
    public static void main(String[] args) {

    }

    public static int shipWithinDays(int[] weights, int days) {
        int answer = -1;
        int left = 0;
        int right = 0;
        for (int x : weights) {
            left = Math.max(left, x);
            right += x;
        }

        while (left <= right) {
            int middle = (left + right) / 2;
            int needDays = 1;
            int current = 0;
            for (int w : weights) {
                if (current + w > middle) {
                    needDays += 1;
                    current = w;
                } else {
                    current += w;
                }
            }

            if(needDays > days) {
                left = middle + 1;
            } else {
                answer = middle;
                right = middle - 1;
            }
        }
        return answer;
    }
}