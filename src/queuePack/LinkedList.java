package queuePack;

public class LinkedList implements List {

    int size;
    Node head;
    Node tail;

    @Override
    public void add(Object value) {
        Node newNode = new Node(value);
        if(size == 0){
            head = tail = newNode;
        }else{
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        size ++;
    }

    @Override
    public void add(Object value, int index) {
        checkIndex(index);


    }

    @Override
    public Object remove(int index) {
        return null;
    }

    @Override
    public Object get(int index) {
        checkIndex(index);
        //TODO если index > size 1/2 начать поиск с конца
        Node currentNode = head;
        for (int i = 0; i < index; i++){
            currentNode = currentNode.next;
        }

        return currentNode;
    }

    private void checkIndex(int index){
        if (index < 0 || index > size){
            throw new IndexOutOfBoundsException("Index: " + index + " size: " + size);
        }
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

    //TODO реализовать Iterator

    private static class Node {

        Object value;
        Node next;
        Node prev;

        Node (Object value){
            this.value = value;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "value=" + value +
                    '}';
        }
    }
}
