package queuePack;

public class Node {
    Object value;
    Node next;
    Node prev;

    Node(Object value){
        this.value = value;
    }

    @Override
    public String toString() {
        return "Node{" +
                "value=" + value +
                '}';
    }
}
