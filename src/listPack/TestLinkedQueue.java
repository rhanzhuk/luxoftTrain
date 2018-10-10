package listPack;

import listPack.LinkedList;

/**
 * Created by dsk15 on 10/9/2018.
 */
public class TestLinkedQueue {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.add("1");
        linkedList.add("2");
        linkedList.add("3");
        System.out.println(linkedList.size());
        System.out.println(linkedList.get(1));


    }
}
