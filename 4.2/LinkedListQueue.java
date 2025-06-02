import java.util.LinkedList;
import java.util.List;

public class LinkedListQueue implements ListImplementation {
    private List<Object> list = new LinkedList<>();

    public void queue(Object o) {
        list.add(o);
    }

    public Object dequeue(int index) {
        return list.remove(index);
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public int size() {
        return list.size();
    }
}