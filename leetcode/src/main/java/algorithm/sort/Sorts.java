package algorithm.sort;

import java.util.Arrays;

/**
 * @ClassName: Sorts
 * @Author: WangD
 * @Description: 排序总结
 * @Date: 2020/8/6 16:55
 * @Version: 1.0
 */
public class Sorts {
    public static void main(String[] args) {
        int[] arr = {2, 5, 3, 0, 12, 7, 8, 23, 1, 2};
        Sorts sorts = new Sorts();
        sorts.selectionSort(arr, arr.length);
        System.out.println(Arrays.toString(arr));
    }

    /**
     * 冒泡排序法
     */
    public void bubbleSort(int[] arr, int len) {
        for (int i = 0; i < len - 1; i++) {
            for (int j = 0; j < len - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
    }

    /**
     * 插入排序法
     */
    public void insertionSort(int[] arr, int len) {
        for (int i = 1; i < len; i++) {
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
    }

    /**
     * 选择排序法
     */
    public void selectionSort(int[] arr, int len) {
        for (int i = 0; i < len - 1; i++) {
            int minIndex = i;
            for (int j = i; j < len; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int tmp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = tmp;
        }
    }
}
