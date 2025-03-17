package b_interfaceset;

import java.util.*;

public class ExemploSet1 {
    public static void main(String[] args) {
        System.out.println("Crie um conjunto (Set) e adicione as notas:");
        Set<Double> notas = new HashSet<>(Arrays.asList(7d, 8.5, 9.3, 5.0, 7d, 0.1, 3.6));
        System.out.println(notas);
        // Elementos repetidos foram eliminados
        // Não é possível trabalhar com posições em um set
        // Ex.: Adicionar elemento na posição x,
        // exibir a posição de elemento y, etc.

        System.out.println("Confira se a nota 5.0 está no conjunto: " + notas.contains(5d));

        System.out.println("Exiba a menor nota: " + Collections.min(notas));
        System.out.println("Exiba a maior nota: " + Collections.max(notas));

        double soma = 0.0;
        for (double nota : notas) {
            soma += nota;
        }

        System.out.println("Exiba a soma dos valores: " + soma);

        System.out.println("Exiba a média das notas: " + (soma/notas.size()));

        System.out.println("Remova a nota 0.1: " + notas.remove(0.1));
        System.out.println(notas);

        System.out.println("Remova as  notas menores que 7 e exiba a lista:");
        /*Iterator<Double> iterator = notas.iterator();
        while (iterator.hasNext()) {
            double next = iterator.next();
            if (next < 7) {
                iterator.remove();
            }
        }*/
        notas.removeIf(next -> next < 7);
        System.out.println(notas);

        System.out.println("Exiba todas as notas na ordem em que foram informadas: ");
        // Como o HashSet não mantém a ordem em que os
        // elementos são adicionados, é preciso usar o
        // LinkedHashSet
        Set<Double> notas2 = new LinkedHashSet<>(Arrays.asList(7d, 8.5, 9.3, 5.0, 7.1, 0.0, 3.6));
        System.out.println(notas2);

        System.out.println("Exiba todas as notas na ordem crescente:");
        // Neste caso é preciso utilizar o TreeSet
        Set<Double> notas3 = new TreeSet<>(notas2);
        System.out.println(notas3);

        System.out.println("Apague todo o conjunto:");
        notas.clear();

        System.out.println("Confira se o conjunto está vazio: " + notas.isEmpty());
        System.out.println(notas);
        System.out.println("Confira se o conjunto 2 está vazio: " + notas2.isEmpty());
        System.out.println(notas2);
    }
}
