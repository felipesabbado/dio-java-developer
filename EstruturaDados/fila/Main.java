package fila;

public class Main {
    public static void main(String[] args) {
        Fila minhaFila = new Fila();

        System.out.println(minhaFila);

        minhaFila.enqueue(new No("primeiro"));
        minhaFila.enqueue(new No("segundo"));
        minhaFila.enqueue(new No("terceiro"));
        minhaFila.enqueue(new No("quarto"));
        minhaFila.enqueue(new No("quinto"));

        System.out.println(minhaFila);

        System.out.println(minhaFila.dequeue());
        System.out.println(minhaFila.dequeue());
        System.out.println(minhaFila.dequeue());

        minhaFila.enqueue(new No("novo objeto"));

        System.out.println(minhaFila);

        System.out.println(minhaFila.first());

        System.out.println(minhaFila);
    }
}
