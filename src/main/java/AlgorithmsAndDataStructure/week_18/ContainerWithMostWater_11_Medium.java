package AlgorithmsAndDataStructure.week_18;

public class ContainerWithMostWater_11_Medium {
    public static void main(String[] args) {}

    //own solution
    //Time complexity: O(n)
    //Memory complexity: O(1)
    public static int maxArea1(int[] height) {
        int left = 0;
        int right = height.length - 1;
//        int result = -1; *Evaluation: 0 is better, since area can't be negative
//                         *result -> maxArea
        int maxArea = 0;

        while (left < right) {
            int minHeight = Math.min(height[left], height[right]);
//            int distance = Math.abs(right - left); *Math.abs() is not needed
            int distance = right - left;
            maxArea = Math.max(maxArea, minHeight * distance);

            if (height[left] < height[right]) {
                left++;
            } else right--;
        }

        return maxArea;
    }
}
