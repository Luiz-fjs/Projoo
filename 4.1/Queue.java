class Queue {
    FIFOQueue imp;
    
    public Queue(FIFOQueue impl) {
        this.imp = impl;
    }

    public void enqueue(Object o) { 
        imp.enqueue(o);
    }

    public Object dequeue() {
        return imp.dequeue();
    }

    public boolean isEmpty() {
        return imp.isEmpty();
    }

    public int size() {
        return imp.size();
    }
}