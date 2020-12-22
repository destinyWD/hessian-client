package algorithm.sort;

import java.util.Arrays;

/**
 * @ClassName: Sort5
 * @Author: WangD
 * @Description: quick快速排序
 * @Date: 2020/8/5 17:00
 * @Version: 1.0
 */
public class Sort5 {

    public static void main(String[] args) {
        int[] arr = {8, 5, 9, 1, 8, 7, 2, 6, 3};
        new Sort5().quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    /**
     * 非原地排序
     *
     * @param arr
     * @param left
     * @param right
     */
    public void quickSort(int[] arr, int left, int right) {
        if (left > right) {
            return;
        }
        int pivot = arr[left];
        int i = left, j = right;
        while (i < j) {
            //先从右边开始往左找，直到找到比pivot值小的数
            while (arr[j] >= pivot && i < j) {
                j--;
            }
            //再从左往右边找，直到找到比pivot值大的数
            while (arr[i] <= pivot && i < j) {
                i++;
            }
            if (i < j) {
                int tmp = arr[i];
                arr[i] = arr[j];
                arr[j] = tmp;
            }
        }
        // 将基准数放到中间的位置（基准数归位）
        arr[left] = arr[i];
        arr[i] = pivot;
        quickSort(arr, left, i - 1);
        quickSort(arr, i + 1, right);
    }


    /**
     * 原地排序
     *
     * @param arr
     * @param left
     * @param right
     */
    public void quickSort2(int[] arr, int left, int right) {
        if (left < right) {
            int pivot = arr[right];
            int i = left;
            for (int j = left; j < right; ++j) {
                if (arr[j] < pivot) {
                    if (i == j) {
                        ++i;
                    } else {
                        int tmp = arr[i];
                        arr[i++] = arr[j];
                        arr[j] = tmp;
                    }
                }
            }
            int tmp = arr[i];
            arr[i] = arr[right];
            arr[right] = tmp;
            quickSort(arr, left, i - 1);
            quickSort(arr, i + 1, right);
        }
    }
}
