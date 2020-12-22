package util;

/**
 * @ClassName: ArrayStack
 * @Author: WangD
 * @Description: 栈
 * @Date: 2020/7/28 15:10
 * @Version: 1.0
 */
public class ArrayStack<T> {
    private Object[] ts;
    private int count;
    private int n;

    public ArrayStack(int n) {
        this.ts = new Object[n];
        this.n = n;
        this.count = 0;
    }

    public boolean push(Object obj) {
        if (count == n) return false;
        ts[count] = obj;
        ++count;
        return true;
    }

    public Object pop() {
        if (count == 0) return null;
        Object tmp = ts[count - 1];
        --count;
        return tmp;

    }
}
