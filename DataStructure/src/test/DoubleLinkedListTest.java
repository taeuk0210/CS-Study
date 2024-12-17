package test;

import list.DoubleLinkedList;
import list.LinkedList;

public class DoubleLinkedListTest {
    public void run() {
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>();
        System.out.println("[DoubleLinkedList]");
        System.out.print("1~10까지 삽입 : ");
        for (int i=1; i<=10; i++) {
            list.add(i);
        }
        list.print();
        System.out.print("index 7 삭제 : ");
        list.remove(7);
        list.print();
        System.out.print("value 7 삭제 : ");
        Integer data = 7;
        list.remove(data);
        list.print();
        System.out.print("7~10까지 삽입 : ");
        for (int i=7; i<=10; i++) {
            list.add(i);
        }
        list.print();
        System.out.print("리스트 크기 : ");
        System.out.println(list.size());
        System.out.print("index 7 조회 : ");
        System.out.println(list.get(7));
        System.out.print("value 7 조회 : ");
        System.out.println(list.find(data));
        System.out.print("마지막 값 추출 : ");
        System.out.println(list.pop());
    }
}
