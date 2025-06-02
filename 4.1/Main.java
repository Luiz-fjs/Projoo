public class Main {
    public static void main(String[] args) {
        FIFOQueue arrayImpl = new ArrayListQueue();
        Queue fila = new Queue(arrayImpl);

        System.out.println(fila.isEmpty());

        fila.enqueue("A");
        fila.enqueue("B");
        fila.enqueue("C");

        System.out.println(fila.isEmpty());
        System.out.println(fila.size());
        System.out.println(fila.dequeue()); // A
        System.out.println(fila.size());
        System.out.println(fila.dequeue()); // B
        System.out.println(fila.size());
        System.out.println(fila.dequeue()); // C
        System.out.println(fila.size());
        System.out.println(fila.isEmpty());
    }
}