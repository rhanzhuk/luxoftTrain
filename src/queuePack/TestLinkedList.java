package queuePack;

public class TestLinkedList {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.add("1");
        linkedList.add("2");
        linkedList.add("3");
        System.out.println(linkedList.size());

//        System.out.println(linkedList.get(1));
//
//
        System.out.println(linkedList.get(0));
        System.out.println(linkedList.get(1));
        System.out.println(linkedList.get(2));
        linkedList.add("100",3);
        System.out.println();
        System.out.println(linkedList.get(0));
        System.out.println(linkedList.get(1));
        System.out.println(linkedList.get(2));
        System.out.println(linkedList.get(3));
        System.out.println(linkedList.size);
//        //System.out.println(linkedList.get(6));
//        linkedList.add("4",3);
//        System.out.println(linkedList.get(0));
//        System.out.println(linkedList.get(1));
//        System.out.println(linkedList.get(2));
//        System.out.println(linkedList.get(3));
//        System.out.println(linkedList.size);
    }
}
