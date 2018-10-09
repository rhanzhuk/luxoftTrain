package queuePack;

public class LinkedQueue implements Queue {

    int size;
    Node tail;
    Node first;

    @Override
    public void enqueue(Object value) {
        Node newNode = new Node(value);
        if (size == 0){
            first = newNode;
            tail.next = first;
            System.out.println("in first iteration = " + tail.next);
            size++;
        }else {
            tail.next = newNode;
            tail = newNode;
            System.out.println("link on next" + newNode);
            size ++;
        }
    }

    @Override
    public Object dequeue() {
        return null;
    }

    @Override
    public Object peek() {
        return null;
    }

    @Override
    public int size() {
        return 0;
    }
}
