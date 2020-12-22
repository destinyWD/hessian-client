package util;

/**
 * @ClassName: ArrayQueue
 * @Author: WangD
 * @Description:
 * @Date: 2020/7/28 15:32
 * @Version: 1.0
 */
public class ArrayQueue {
    private Object[] item;
    private int n = 0;
    private int head = 0;
    private int tail = 0;

    public ArrayQueue(int n) {
        this.item = new Object[n];
        this.n = n;
    }

    public boolean enqueue(Object obj) {
        if (tail == n) {
            if (head == 0) {
                return false;
            } else {
                for (int i = head; i < tail; i++) {
                    item[i - head] = item[i];
                }
                tail = tail - head;
                head = 0;
            }
        }
        item[tail] = obj;
        ++tail;
        return true;
    }

    public Object dequeue() {
        if (head == tail) return null;
        Object obj = item[head];
        ++head;
        return obj;
    }
}
