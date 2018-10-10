package queuePack;

import listPack.List;

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
        Node newNode = new Node(value);
//1.case if index == size
        if(index == size){
            add(value);
//2.case if in index == 0
        }else if (index == 0){
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
//3.case insert to middle
        }else {
            Node currentNode = (Node) get(index);
            Node prevNode = (Node) get(index - 1);
            prevNode.next = newNode;
            newNode.prev = prevNode;
            newNode.next = currentNode;
            currentNode.prev = newNode;
        }



        size++;
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
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
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
