package a_interfacelist;

import java.util.*;

public class ExemploList1 {
    public static void main(String[] args) {
        System.out.println("Crie uma lista e adicione sete notas: ");

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

        System.out.println("Exiba a posição da nota 5.0: " + notas.indexOf(5.0) + '\n');

        System.out.println("Adicione a nota 8.0 na posição 4: ");
        notas.add(4, 8d);
        System.out.println(notas);
        System.out.println();

        System.out.println("Substitua a nota 5.0 pela nota 6.0: ");
        notas.set(notas.indexOf(5d), 6d);
        System.out.println(notas + "\n");

        System.out.println("Confira se a nota 5.0 está na lista: " + notas.contains(5d) + '\n');

        System.out.println("Exiba todas as notas na ordem em que foram informadas:");
        System.out.println(notas + "\n");

        System.out.println("Exiba a terceira nota adicionada: " + notas.get(2) + '\n');

        System.out.println("Exiba a menor nota: " + Collections.min(notas) + '\n');

        System.out.println("Exiba a maior nota: " + Collections.max(notas) + '\n');
    }
}
