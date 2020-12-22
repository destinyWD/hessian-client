package algorithm.recursion;

/**
 * @ClassName: demo1
 * @Author: WangD
 * @Description:
 * @Date: 2020/8/3 16:30
 * @Version: 1.0
 */
public class Recursion1 {
    public static void main(String[] args) {
        System.out.println(new Recursion1().f(7));
    }

    int f(int n) {
        if (n == 1) return 1;
        if (n == 2) return 2;
        return f(n - 1) + f(n - 2);
    }
}

