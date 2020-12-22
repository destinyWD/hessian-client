package search;

/**
 * @ClassName: BinarySearch
 * @Author: WangD
 * @Description: 二分查找
 * @Date: 2020/8/6 17:28
 * @Version: 1.0
 */
public class BinarySearch {

    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 5, 6, 7, 8, 8, 8, 9};
        BinarySearch search = new BinarySearch();
        int index = search.searchSpecial(arr, arr.length, 8);
        System.out.println(index);
    }

    /**
     * 基本二分
     *
     * @param arr
     * @param len
     * @param value
     * @return
     */
    public int search(int[] arr, int len, int value) {
        int start = 0;
        int end = len - 1;
        while (start <= end) {
            int mid = start + ((end - start) >> 1);
            if (arr[mid] == value) {
                return mid;
            } else if (arr[mid] < value) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }


    /**
     * 递归实现
     *
     * @param arr
     * @param start
     * @param end
     * @param value
     * @return
     */
    public int search(int[] arr, int start, int end, int value) {
        if (start > end) return -1;
        int mid = start + ((end - start) >> 1);
        if (arr[mid] == value) {
            return mid;
        } else if (arr[mid] < value) {
            return search(arr, mid + 1, end, value);
        } else {
            return search(arr, start, mid - 1, value);
        }
    }

    /**
     * 获取第一个指定
     *
     * @param arr
     * @param len
     * @param value
     * @return
     */
    public int searchSpecial(int[] arr, int len, int value) {
        int start = 0;
        int end = len - 1;
        while (start <= end) {
            int mid = start + ((end - start) >> 1);
            if (arr[mid] > value) {
                end = mid - 1;
            } else if (arr[mid] < value) {
                start = mid + 1;
            } else {
                if ((mid == 0 || arr[mid - 1] != value)) {
                    return mid;
                } else {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }
}
