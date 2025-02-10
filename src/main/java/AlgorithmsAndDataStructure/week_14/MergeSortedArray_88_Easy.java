package AlgorithmsAndDataStructure.week_14;

public class MergeSortedArray_88_Easy {
    public static void main(String[] args) {

    }

    public static int[] merge_ver1(int[] nums1, int m, int[] nums2, int n) {
        int nums1End = m - 1;
        int nums2End = n - 1;
        int insertPosition = nums1.length - 1;

        while (nums2End >= 0) {
            if (nums1End >= 0 && nums1[nums1End] > nums2[nums2End]) {
                nums1[insertPosition--] = nums1[nums1End--];
            } else{
                nums1[insertPosition--] = nums2[nums2End--];
            }
        }
        return nums1;
    }
}
