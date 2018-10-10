package listPack;

public class LinkedList implements List {

    private int size;
    private Node head;
    private Node tail;

    @Override
    public void add(Object value) {
        Node newNode = new Node(value);
        if(size == 0){
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        size++;
    }

    @Override
    public void add(Object value, int index) {
        checkPosition(index);

    }

    @Override
    public Object remove(int index) {
        return null;
    }

    @Override
    public Object get(int index) {
        checkPosition(index);
        Node currentNode = head;
        if (size == 1){
            return head;
        }else {
            for (int i = 0; i < index; i++) {
                currentNode = tail.next;

            }
            return currentNode;
        }
        //return currentNode;
    }

    private void checkPosition(int index){
        if (index < 0 || index > size){
            throw new IndexOutOfBoundsException();
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
        return size;
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



    private static class Node{

        private Object value;

        private Node next;
        private Node prev;

        public Node(Object value) {
            this.value = value;
        }

        public Node(Object value, Node next, Node prev) {
            this.value = value;
            this.next = next;
            this.prev = prev;
        }

        public Node() {
        }

        @Override
        public String toString() {
            return "Node{" +
                    "value=" + value +
                    '}';
        }
    }
}
