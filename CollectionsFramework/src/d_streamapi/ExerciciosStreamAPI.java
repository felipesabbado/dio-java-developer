package d_streamapi;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ExerciciosStreamAPI {
    public static void main(String[] args) {
        List<String> numerosAleatorios = Arrays.asList("1", "0", "4", "1", "2", "3", "9", "9", "6", "5");

        System.out.println("\nImprima todos os elementos dessa lista de String:");
        // Utilizando Classe Anônima
        /*numerosAleatorios.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });*/

        // Utilizando Lambda Expression
        /*numerosAleatorios.forEach(numero -> System.out.println(numero));*/

        //Utilizando Method Reference
        /*numerosAleatorios.forEach(System.out::println);*/

        /*System.out.println("\nPegue os primeiros 5 números e os coloque dentro de um Set:");
        numerosAleatorios.stream()
                .limit(5)
                .collect(Collectors.toSet())
                .forEach(System.out::println);*/

        /*System.out.println("\nTransforme esta lista de String em uma lista de números inteiros: ");*/
        List<Integer> numerosAleatoriosInteiros =
                numerosAleatorios.stream()
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        /*System.out.println(listNumeros);*/

        /*System.out.println("\nPegue os números pares e maiores que 2 e coloque em uma lista:");
        List<Integer> paresMaioresQue2 = numerosAleatorios.stream()
                .map(Integer::parseInt)
                .filter(i -> i > 2 && i % 2 == 0)
                .toList();
        System.out.println(paresMaioresQue2);*/

        /*System.out.println("\nMostre a média dos números: ");
        numerosAleatorios.stream()
                .mapToInt(Integer::parseInt)
                .average()
                .ifPresent(System.out::println);*/

        System.out.println("\nRemova os valores ímpares:");
        numerosAleatoriosInteiros.removeIf(i -> i % 2 != 0);
        System.out.println(numerosAleatoriosInteiros);

        System.out.println("\nIgnore os 3 primeiros elementos da lista e imprima o restante:");
        List<String> skip = numerosAleatorios
                .stream()
                .skip(3)
                .toList();
        System.out.println(skip);

        long countNumerosUnicos = numerosAleatorios
                .stream()
                .distinct()
                .count();
        System.out.println("\nRetirando os números repetidos da lista, quantos números ficam? " + countNumerosUnicos);

        System.out.println("\nMostre o menor valor da lista: ");
        numerosAleatorios.stream()
                .mapToInt(Integer::parseInt)
                .min()
                .ifPresent(System.out::println);

        System.out.println("\nMostre o maior valor da lista: ");
        numerosAleatorios.stream()
                .mapToInt(Integer::parseInt)
                .max()
                .ifPresent(System.out::println);

        int somaPares = numerosAleatoriosInteiros
                .stream()
                .filter(i -> i % 2 == 0)
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println("\nSome apenas os números pares: " + somaPares);

        System.out.println("\nMostre a lista na ordem numérica: ");
        List<Integer> numerosOrdemNatural = numerosAleatoriosInteiros.stream()
                .sorted()
                .toList();
        System.out.println(numerosOrdemNatural);

        System.out.println("\nAgrupe os valores ímpares múltiplos de 3 ou de 5: ");
        Map<Boolean, List<Integer>> multiplosDe3E5 =
                numerosAleatoriosInteiros.stream()
                .collect(Collectors.groupingBy(i -> i % 3 == 0 || i % 5 == 0));
        System.out.println(multiplosDe3E5);
    }
}
