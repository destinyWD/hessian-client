package algorithm.sort;

import java.util.Arrays;

/**
 * @ClassName: Sort6
 * @Author: WangD
 * @Description: 计数排序
 * @Date: 2020/8/6 9:52
 * @Version: 1.0
 */
public class Sort6 {

    public static void main(String[] args) {
        int[] arr = {92, 95, 93, 90, 192, 97, 90, 293, 91, 92};
        new Sort6().countingSort(arr, arr.length);
        System.out.println(Arrays.toString(arr));
    }

    public void countingSort(int[] arr, int n) {

        // 计数排序，a是数组，n是数组大小。假设数组中存储的都是非负整数。
        if (n <= 1) return;

        // 查找数组中数据的范围
        int max = arr[0];
        int min = arr[0];
        for (int i = 1; i < n; ++i) {
            if (max < arr[i]) {
                max = arr[i];
            }
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        int d = max - min;

        int[] c = new int[d + 1]; // 申请一个计数数组c，下标大小[0,max]
        // 计算每个元素的个数，放入c中
        for (int i = 0; i < n; ++i) {
            c[arr[i] - min]++;
        }

        // 依次累加
        for (int i = 1; i <= d; ++i) {
            c[i] = c[i - 1] + c[i];
        }

        // 临时数组r，存储排序之后的结果
        int[] r = new int[n];
        // 计算排序的关键步骤，有点难理解
        for (int i = n - 1; i >= 0; --i) {
            int index = c[arr[i] - min] - 1;
            r[index] = arr[i];
            c[arr[i] - min]--;
        }

        // 将结果拷贝给a数组
        for (int i = 0; i < n; ++i) {
            arr[i] = r[i];
        }

    }

}
