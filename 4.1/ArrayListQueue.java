import java.util.List;
import java.util.ArrayList;

class ArrayListQueue implements FIFOQueue {
    private List<Object> list = new ArrayList<>();

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