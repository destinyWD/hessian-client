package easy;

/**
 * @ClassName: Array1
 * @Author: WangD
 * @Description:
 * @Date: 2020/8/18 10:43
 */
public class Array1 {
    public int removeDuplicates(int[] nums) {
        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[i] != nums[j]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 2};
        int len = new Array1().removeDuplicates(arr);
        for (int i = 0; i < len; i++) {
            System.out.println(arr[len]);
        }
    }
}
