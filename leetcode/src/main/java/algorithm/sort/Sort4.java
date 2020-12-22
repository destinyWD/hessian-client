package algorithm.sort;

import java.util.Arrays;

/**
 * @ClassName: Sort4
 * @Author: WangD
 * @Description: 并归排序O(nlogn)
 * @Date: 2020/8/4 16:39
 * @Version: 1.0
 */
public class Sort4 {

    public static void main(String[] args) {
        int[] arr = {17, 5, 6, 3, 2, 9, 1};
        new Sort4().mergeSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    public void merge(int[] arr, int left, int mid, int right) {
        int[] tmp = new int[arr.length];
        int i = left, j = mid + 1, k = left;//i、j是检测指针，k是存放指针
        while (i <= mid && j <= right) {
            if (arr[i] <= arr[j]) {
                tmp[k++] = arr[i++];
            } else {
                tmp[k++] = arr[j++];
            }
        }

        while (i <= mid) tmp[k++] = arr[i++];//如果第一个序列未检测完，直接将后面所有元素加到合并的序列中
        while (j <= right) tmp[k++] = arr[j++];//同上

        //复制回原素组
        for (int m = left; m <= right; m++)
            arr[m] = tmp[m];

    }

    public void mergeSort(int[] arr, int left, int right) {
        // 递归终止条件
        if (left < right) {
            // 取p到r之间的中间位置q
            int mid = (left + right) / 2;
            // 分治递归
            mergeSort(arr, left, mid); //对左侧子序列进行递归排序
            mergeSort(arr, mid + 1, right); //对右侧子序列进行递归排序
            // 将A[p...q]和A[q+1...r]合并为A[p...r]
            merge(arr, left, mid, right); //合并
        }
    }
}
