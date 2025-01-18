package MathAlgo_withAzret.Easy.week_11;

public class RemoveElement_27 {
    public static void main(String [] args) {
        System.out.println(removeElement(new int []{3,2,2,3,4}, 2));
    }

    //Azret's version
    public static int removeElement(int [] nums, int val) {
        int index = 0; //index pointer method
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[index] = nums[i];
                index++;
            }
        }
        return index;
    }
}
