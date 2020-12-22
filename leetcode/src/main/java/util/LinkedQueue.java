package util;

/**
 * @ClassName: LinkedQueue
 * @Author: WangD
 * @Description:
 * @Date: 2020/7/28 15:43
 * @Version: 1.0
 */
public class LinkedQueue {

    Node head = null;
    Node tail = null;

    public LinkedQueue() {
    }

    public void enqueue(Object obj) {
        if (tail == null) {
            Node node = new Node(obj, null);
            tail.next = node;
            head.next = node;
        } else {
            tail.next = new Node(obj, null);
            tail = tail.next;
        }
    }

    public Object dequeue() {
        if (head == null) return null;
        Object obj = head.getData();
        head = head.next;
        if (head == null) {
            tail = null;
        }
        return obj;
    }

    class Node {
        Object data;
        Node next;

        public Object getData() {
            return data;
        }

        public Node(Object data) {
            this.data = data;
        }

        public Node(Object data, Node next) {
            this.data = data;
            this.next = next;
        }
    }
}
