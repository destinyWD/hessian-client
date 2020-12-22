package algorithm.sort;

import java.util.Arrays;

/**
 * @ClassName: Sort1
 * @Author: WangD
 * @Description: 冒泡O(n ^ 2)
 * @Date: 2020/8/4 14:58
 * @Version: 1.0
 */
public class Sort1 {

    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 3, 2, 1};
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }

}
