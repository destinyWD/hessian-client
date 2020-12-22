package algorithm.sort;

import java.util.Arrays;

/**
 * @ClassName: Sort2
 * @Author: WangD
 * @Description: 插入排序O(n ^ 2)
 * @Date: 2020/8/4 15:28
 * @Version: 1.0
 */
public class Sort2 {
    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 3, 2, 1};
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int tmp = arr[i];
            int j = i - 1;
            for (; j >= 0; j--) {
                if (arr[j] > tmp) {
                    arr[j + 1] = arr[j];
                } else {
                    break;
                }
            }
            arr[j + 1] = tmp;
        }
        System.out.println(Arrays.toString(arr));
    }

}
