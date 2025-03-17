package implementacoesjava;

import java.util.Stack;

public class MainStack {
    public static void main(String[] args) {
        String div = "\n------------------------------\n";
        Stack<Carro> stackCarros = new Stack<>();

        stackCarros.push(new Carro("Ford"));
        stackCarros.push(new Carro("Volvo"));
        stackCarros.push(new Carro("Fiat"));

        System.out.println(div);
        System.out.println(stackCarros);
        System.out.println(div);

        // Retirar o elemento do topo da pilha
        System.out.println(stackCarros.pop());
        System.out.println(stackCarros);
        System.out.println(div);

        // Mostrar o elemento do topo da pilha
        System.out.println(stackCarros.peek());
        System.out.println(stackCarros);
        System.out.println(div);

        // Diz se a pilha está vazia
        System.out.println(stackCarros.empty());
        System.out.println(div);

        stackCarros.pop();
        stackCarros.pop();
        System.out.println(stackCarros.empty());
    }
}
