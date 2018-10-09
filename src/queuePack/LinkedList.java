package queuePack;

public class LinkedList implements List {

    int size;
    Node head;
    Node tail;

    @Override
    public void add(Object value) {
        Node newNode = new Node(value);
        //System.out.println(newNode);
        if(size == 0){
            head = tail = newNode;
            //System.out.println(head + " " + tail);
        } else {
            tail.next = newNode;
            //System.out.println("tail.next " + tail.next);
            newNode.prev = tail;
            //System.out.println("newNode.prev "+ newNode.prev);
            tail = newNode;
            //System.out.println("tail " + tail);
        }
        size++;
    }

    @Override
    public void add(Object value, int index) {

    }

    @Override
    public Object remove(int index) {
        return null;
    }

    @Override
    public Object get(int index) {
        Node currentNode = head;
        

        return null;
    }

    @Override
    public Object set(Object value, int index) {
        return null;
    }

    @Override
    public void clear() {

    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean contains(Object value) {
        return false;
    }

    @Override
    public int indexOf(Object value) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object value) {
        return 0;
    }
}
