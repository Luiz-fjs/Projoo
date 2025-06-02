public class Main2 {
    public static void main(String[] args) {
        ListImplementation impl = new LinkedListQueue();

        ListQueue fila = new ListQueue(impl);

        System.out.println("Fila vazia? " + fila.isEmpty());

        fila.queue("A");
        fila.queue("B");
        fila.queue("C");
        fila.queue("D");

        System.out.println("Tamanho da fila: " + fila.size());
        System.out.println("Fila vazia? " + fila.isEmpty());
        System.out.println("Removendo: " + fila.dequeue(3));
        System.out.println("Tamanho atual: " + fila.size());
        System.out.println("Removendo: " + fila.dequeue(0));
        System.out.println("Tamanho atual: " + fila.size());
        System.out.println("Removendo: " + fila.dequeue(1));
        System.out.println("Tamanho atual: " + fila.size());
        System.out.println("Removendo: " + fila.dequeue(0));
        System.out.println("Tamanho atual: " + fila.size());

        System.out.println("Fila vazia? " + fila.isEmpty());
    }
}
