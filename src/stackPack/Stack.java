package stackPack;


public interface Stack<E> {
    void push(E value);

    // throws NoSuchElementException if stack is empty
    E pop();

    int size();

    E peek();
}
