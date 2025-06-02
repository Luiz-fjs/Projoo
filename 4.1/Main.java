public class Main {
    public static void main(String[] args) {
        FIFOQueue arrayImpl = new ArrayListQueue();
        FIFOQueue vectorImpl = new VectorQueue();
        
        Queue fila = new Queue(arrayImpl);
        Queue fila2 = new Queue(vectorImpl);


        //Teste da fila com ArrayList
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


        //Teste da fila2 com VectorQueue
        System.out.println(fila2.isEmpty());

        fila2.enqueue("A");
        fila2.enqueue("B");
        fila2.enqueue("C");

        System.out.println(fila2.isEmpty());
        System.out.println(fila2.size());
        System.out.println(fila2.dequeue()); // A
        System.out.println(fila2.size());
        System.out.println(fila2.dequeue()); // B
        System.out.println(fila2.size());
        System.out.println(fila2.dequeue()); // C
        System.out.println(fila2.size());
        System.out.println(fila2.isEmpty());

    }
}