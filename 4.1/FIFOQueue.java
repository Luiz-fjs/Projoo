interface FIFOQueue {
    Object dequeue();
    void enqueue(Object o);
    boolean isEmpty();
    int size();
}