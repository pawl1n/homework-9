package stack;

public interface Stackable<E> {
    E peek();
    E pop();
    void push(E element);
    boolean isEmpty();
    boolean isFull();

}
