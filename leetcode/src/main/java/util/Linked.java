package util;

/**
 * @ClassName: Link
 * @Author: WangD
 * @Description: 链表
 * @Date: 2020/7/28 11:37
 * @Version: 1.0
 */
public class Linked<T> {

    private Node<T> head;

    private int size = 0;

    public Linked() {
    }

    public void addFrist(T t) {
        Node node = new Node(t);
        this.head = node;
        size++;
    }

    public void add(T t) {
        if (head == null) {
            addFrist(t);
        } else {
            Node node = new Node(t);
            if (head.next == null) {
                head.next = node;
            } else {
                node.next = head.next;
                head.next = node.next;
            }
            ++size;
        }
    }

    public boolean remore(Object obj) {
        if (obj == null) {
            for (Node x = head; x != null; x = x.next) {
                if (x.data == null) {
                    x.next = x.next.next;
                    --size;
                    return true;
                }
            }
        } else {
            for (Node x = head; x != null; x = x.next) {
                if (obj.equals(x.data)) {
                    x.next = x.next.next;
                    --size;
                    return true;
                }
            }
        }
        return false;
    }

    private class Node<E> {
        private E data;
        private Node next;

        public Node(E obj) {
            this.data = obj;
        }
    }
}
