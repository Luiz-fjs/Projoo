class ListQueue {
    ListImplementation imp;
    
    public ListQueue(ListImplementation impl) {
        this.imp = impl;
    }

    public void queue(Object o) { 
        imp.queue(o);
    }

    public Object dequeue(int index) {
        return imp.dequeue(index);
    }

    public boolean isEmpty() {
        return imp.isEmpty();
    }

    public int size() {
        return imp.size();
    }
}

