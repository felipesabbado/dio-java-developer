package fila;

public class Main {
    public static void main(String[] args) {
        Fila<String> minhaFila = new Fila<>();

        System.out.println(minhaFila);

        minhaFila.enqueue("primeiro");
        minhaFila.enqueue("segundo");
        minhaFila.enqueue("terceiro");
        minhaFila.enqueue("quarto");
        minhaFila.enqueue("quinto");

        System.out.println(minhaFila);

        System.out.println(minhaFila.dequeue());
        System.out.println(minhaFila.dequeue());
        System.out.println(minhaFila.dequeue());

        minhaFila.enqueue("novo objeto");

        System.out.println(minhaFila);

        System.out.println(minhaFila.first());

        System.out.println(minhaFila);
    }
}
