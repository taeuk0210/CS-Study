import test.ArrayListTest;
import test.DoubleLinkedListTest;
import test.LinkedListTest;

public class Main {
    public static void main(String[] args) {
        ArrayListTest test1 = new ArrayListTest();
        test1.run();
        LinkedListTest test2 = new LinkedListTest();
        test2.run();
        DoubleLinkedListTest test3 = new DoubleLinkedListTest();
        test3.run();

    }
}