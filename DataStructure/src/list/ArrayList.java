package list;

public class ArrayList<T> {
    private T[] arr;
    private int size;
    private int capacity;

    public ArrayList() {
        size = 0;
        capacity = 10;
        arr = (T[]) new Object[capacity];
    }
    public T get(int index) {
        return arr[index];
    }
    public int size() {
        return size;
    }
    public void add(T t) {
        arr[size++] = t;
        if (size == arr.length) {
            capacity *= 2;
            T[] newArr = (T[]) new Object[capacity];
            for (int i = 0; i < size; i++) {
                newArr[i] = arr[i];
            }
            arr = newArr;
        }
    }
    public void remove(int index) {
        for (int i = index; i < size - 1; i++) {
            arr[i] = arr[i + 1];
        }
        size--;
    }
    public T pop(int index) {
        T t = arr[index];
        this.remove(index);
        return t;
    }
    public T pop() {
        return this.pop(size-1);
    }
    public int find(T t) {
        for (int i = 0; i < size; i++) {
            if (arr[i].equals(t)) {
                return i;
            }
        }
        return -1;
    }
    public void remove(T t) {
        int index = this.find(t);
        if (index != -1) remove(index);
    }
    public void print() {
        System.out.print("[");
        for (int i = 0; i < size-1; i++) {
            System.out.print(arr[i] + ", ");
        }
        System.out.print(arr[size-1] + "]\n");
    }
}
