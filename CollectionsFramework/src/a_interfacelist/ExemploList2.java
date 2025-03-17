package a_interfacelist;

import java.util.ArrayList;
import java.util.List;

public class ExemploList2 {
    public static void main(String[] args) {
        List<Double> notas = new ArrayList<>();

        notas.add(7.0);
        notas.add(8.5);
        notas.add(9.3);
        notas.add(5.0);
        notas.add(7.0);
        notas.add(0.0);
        notas.add(3.6);

        System.out.println(notas);
        System.out.println();

        double soma = 0;
        for (double nota : notas) {
            soma += nota;
        }

        System.out.print("Exiba a soma dos valores: " + soma + '\n');

        System.out.println("Exiba a média das notas: " + soma/notas.size() + '\n');

        System.out.println("Remova a nota 0:");
        notas.remove(0d);
        System.out.println(notas + "\n");

        System.out.println("Remova a nota da posição 0: ");
        notas.removeFirst();
        System.out.println(notas + "\n");

        System.out.println("Remova as notas menores que 7:");
        /*Iterator<Double> iterator = notas.iterator();
        while (iterator.hasNext()) {
            Double next = iterator.next();
            if (next < 7)
                iterator.remove();
        }*/
        notas.removeIf(nota -> nota < 7);
        System.out.println(notas + "\n");

        System.out.println("Apague toda a lista: " + notas.isEmpty());
        notas.clear();
        System.out.println(notas + "\n");
    }
}
