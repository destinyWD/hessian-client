package easy;

/**
 * @ClassName: Array2
 * @Author: WangD
 * @Description: 买卖股票的最佳时机 II
 * 给定一个数组，它的第 i 个元素是一支给定股票第 i 天的价格。
 * <p>
 * 设计一个算法来计算你所能获取的最大利润。你可以尽可能地完成更多的交易（多次买卖一支股票）。
 * @Date: 2020/8/18 10:38
 */
public class Array2 {
    public int maxProfit(int[] prices) {
        int sum = 0;
        for (int j = 1; j < prices.length; j++) {
            if (prices[j - 1] < prices[j]) {
                sum += prices[j] - prices[j - 1];
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] arr = {7, 1, 5, 3, 6, 4};
        System.out.println(new Array2().maxProfit(arr));
    }
}
