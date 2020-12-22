package algorithm.sort;

import java.util.Arrays;

/**
 * @ClassName: Sort3
 * @Author: WangD
 * @Description: 选择排序O(n ^ 2)
 * @Date: 2020/8/4 16:00
 * @Version: 1.0
 */
public class Sort3 {
    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 3, 2, 1};
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i; j < n; j++) {
                if (arr[j] > arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
