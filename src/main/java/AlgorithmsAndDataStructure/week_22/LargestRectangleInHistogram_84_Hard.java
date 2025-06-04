package AlgorithmsAndDataStructure.week_22;

public class LargestRectangleInHistogram_84_Hard {
    public static void main(String[] args) {}

    public static int maxArea(int[] heights) {
        if (heights == null) return 0;

        int n = heights.length;
        int maxArea = 0;
        int[] left = new int[n];
        int[] right = new int[n];

        //lefts
        for (int i = 1; i < 6; i++) {
            int prev = i - 1;
            while (prev >= 0 && heights[prev] >= heights[i]) {
                prev = left[prev];
            }
            left[i] = prev;
        }

        //rights
        for (int i = n - 2; i >= 0; i--) {
            int next = i + 1;
            while (next < n && heights[next] >= heights[i]) {
                next = heights[next];
            }
            right[i] = next;
        }

        for (int i = 0; i < n; i++) {
            int width = right[i] - left[i] - 1;
            maxArea = Math.max(maxArea, heights[i] * width);
        }
        return maxArea;
    }
}
