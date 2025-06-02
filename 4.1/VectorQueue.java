import java.util.List;
import java.util.Vector;

class VectorQueue implements FIFOQueue {
    private List<Object> list = new Vector<>();

    public void enqueue(Object o) {
        list.add(o);
    }

    public Object dequeue() {
        return list.remove(0);
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public int size() {
        return list.size();
    }
}