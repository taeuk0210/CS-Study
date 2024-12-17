package list;

public class DoubleLinkedList<T> {
    public class Node {
        private T t;
        private Node next;
        private Node prev;
        public Node(T t) {
            this.t = t;
        }
    }
    private Node head;
    private Node tail;
    private int size;

    public DoubleLinkedList() {
        head = null;
        tail = null;
        size = 0;
    }

    public Node getNode(int index) {
        Node node = head;
        for (int i=0; i<index; i++) {
            node = node.next;
        }
        return node;
    }
    public T get(int index) {
        return this.getNode(index).t;
    }
    public int size() {
        return size;
    }
    public void add(T t) {
        Node node = new Node(t);
        size++;
        if (size == 1) {
            head = node;
            tail = node;
            return;
        }
        tail.next = node;
        tail = node;
    }

    public void remove(int index) {
        if (index == 0) {
            this.head = head.next;
            return;
        }
        Node prevNode = this.getNode(index-1);
        prevNode.next = prevNode.next.next;
        size--;
    }
    public T pop(int index) {
        T t = this.get(index);
        this.remove(index);
        return t;
    }
    public T pop() {
        return this.pop(size-1);
    }
    public int find(T t) {
        Node node = head;
        for (int i = 0; i < size; i++) {
            if (node.t.equals(t)) {
                return i;
            }
            node = node.next;
        }
        return -1;
    }
    public void remove(T t) {
        int index = this.find(t);
        if (index != -1) remove(index);
    }
    public void print() {
        Node node = head;
        System.out.print("[");
        for (int i = 0; i < size-1; i++) {
            System.out.print(node.t + ", ");
            node = node.next;
        }
        System.out.print(tail.t + "]\n");
    }

}
