package stackPack;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class LinkedList<E> implements List<E>, Iterable {

    @Override
    public Iterator iterator() {
        return new MyIterator();
    }

    private class MyIterator implements Iterator{
        private int count = 0;
        @Override
        public boolean hasNext() {
            return count != size;
        }

        @Override
        public E next() {
            count++;
            return get(count-1);
        }
    }

    private static class Node<E> {
        E value;
        Node next;
        Node previous;

        private Node(E value) {
            this.value = value;
        }
    }

    private Node head;
    private Node tail;
    private int size;

    @Override
    public void add(E value) {
        add(value,size);
    }

    @Override
    public void add(E value, int index) {
        if (index > size) {
            throw new IndexOutOfBoundsException();
        }
        Node newNode = new Node(value);
        if (index == size) {
            newNode.previous = getNodeByIndex(index - 1);
            tail = newNode;
        } else {
            Node shiftedNode = getNodeByIndex(index);
            newNode.previous = shiftedNode.previous;
            newNode.next = shiftedNode;
            shiftedNode.previous = newNode;
        }
        if (index == 0) {
            head = newNode;
        } else {
            newNode.previous.next = newNode;
        }
        size++;
    }

    @Override
    public E remove(int index) {
        Node<E> deletedNode = getNodeByIndex(index);
        if (index == 0) {
            head = deletedNode.next;
        } else if(index == size - 1) {
            tail = deletedNode.previous;
        } else {
            deletedNode.next.previous = deletedNode.previous;
            deletedNode.previous.next = deletedNode.next;
        }
        size--;
        return  deletedNode.value;
    }

    private Node<E> getNodeByIndex(int index) {
        checkIfIndexOutOfBound(index);
        Node currentNode = head;
        for (int i = 1; i < index + 1; i++) {
            currentNode = currentNode.next;
        }
        return currentNode;
    }
    @Override
    public E get(int index) {
        return getNodeByIndex(index).value;
    }

    private void checkIfIndexOutOfBound(int index) {
        if (index >= size) {
            throw new IndexOutOfBoundsException();
        }
    }

    @Override
    public E set(E value, int index) {
        checkIfIndexOutOfBound(index);
        Node<E> prevNode = getNodeByIndex(index);
        E result = prevNode.value;
        prevNode.value = value;
        return result;
    }

    @Override
    public void clear() {
        head = null;
        tail = null;
        size = 0;
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
    public boolean contains(E value) {
        return indexOf(value) != -1;
    }

    @Override
    public int indexOf(E value) {
        Node<E> currentNode = head;
        for(int i = 0; i < size; i++) {
            if(currentNode.value == value) {
                return i;
            }
            currentNode = currentNode.next;
        }
        return -1;
    }

    @Override
    public int lastIndexOf(E value) {
        int index = -1;
        Node<E> currentNode = head;
        for(int i = 0; i < size; i++) {
            if(currentNode.value == value) {
                index = i;
            }
            currentNode = currentNode.next;
        }
        return index;
    }

}