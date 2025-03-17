package implementacoesjava;

import java.util.LinkedList;
import java.util.Queue;

public class MainQueue {
    public static void main(String[] args) {
        String div = "\n------------------------------\n";
        System.out.println(div);
        Queue<Carro> queueCarros = new LinkedList<>();

        queueCarros.add(new Carro("Ford"));
        queueCarros.add(new Carro("Volvo"));
        queueCarros.add(new Carro("Fiat"));

        System.out.println(queueCarros + div);

        System.out.println(queueCarros.add(new Carro("Peugeot")));
        System.out.println(queueCarros + div);

        System.out.println(queueCarros.offer(new Carro("Renault")));
        System.out.println(queueCarros + div);

        System.out.println(queueCarros.peek());
        System.out.println(queueCarros + div);

        System.out.println(queueCarros.poll());
        System.out.println(queueCarros + div);

        System.out.println(queueCarros.remove());
        System.out.println(queueCarros + div);
    }
}
