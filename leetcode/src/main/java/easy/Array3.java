package easy;

import java.util.Arrays;

/**
 * @ClassName: Array3
 * @Author: WangD
 * @Description:
 * @Date: 2020/8/18 11:09
 */
public class Array3 {
    public void rotate(int[] nums, int k) {
        k %= nums.length;
        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);
    }

    public void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        new Array3().rotate(arr, 10);
        System.out.println(Arrays.toString(arr));
    }
}
