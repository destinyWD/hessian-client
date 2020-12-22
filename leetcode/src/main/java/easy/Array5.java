package easy;

/**
 * @ClassName: Array5
 * @Author: WangD
 * @Description: 出现一次数据
 * @Date: 2020/8/18 14:15
 */
public class Array5 {
    public int singleNumber(int[] nums) {
        int single = 0;
        for (int num : nums) {
            single ^= num;
        }
        return single;
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 1, 2, 1};
        System.out.println(new Array5().singleNumber(arr));
    }
}
