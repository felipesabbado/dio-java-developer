package c_interfacemap.ex03;

import java.util.*;

public class Agenda {
    /* Dadas as seguintes informações  de id e contato,
     * crie um dicionário e ordene este dicionário
     * exibindo (Nome id - Nome contato);
     * id = 1 - Contato = nome: Simba, numero: 2222;
     * id = 4 - Contato = nome: Cami, numero: 5555;
     * id = 3 - Contato = nome: Jon, numero: 1111;
     */
    public static void main(String[] args) {
        Contato contato1 = new Contato("Simba", 2222);
        Contato contato2 = new Contato("Cami", 5555);
        Contato contato3 = new Contato("Jon", 1111);

        System.out.println("\n-- Ordem aleatória --");
        Map<Integer, Contato> agenda = new HashMap<>(){{
            put(1, contato1);
            put(4, contato2);
            put(3, contato3);
        }};

        for (Map.Entry<Integer, Contato> contato : agenda.entrySet()) {
            System.out.println(contato.getKey() + " - " + contato.getValue());
        }

        System.out.println("\n-- Ordem Inserção --");
        Map<Integer, Contato> agenda1 = new LinkedHashMap<>(){{
            put(1, contato1);
            put(4, contato2);
            put(3, contato3);
        }};

        for (Map.Entry<Integer, Contato> contato : agenda1.entrySet()) {
            System.out.println(contato.getKey() + " - " + contato.getValue());
        }

        System.out.println("\n-- Ordem id --");
        Map<Integer, Contato> agenda2 = new TreeMap<>(agenda);

        for (Map.Entry<Integer, Contato> contato : agenda2.entrySet()) {
            System.out.println(contato.getKey() + " - " + contato.getValue());
        }

        System.out.println("\n-- Ordem número telefone --");
        Set<Map.Entry<Integer, Contato>> agenda3 = new TreeSet<>(new ComparatorTelefone());
        agenda3.addAll(agenda.entrySet());

        for (Map.Entry<Integer, Contato> contato : agenda3) {
            System.out.println(contato.getKey() + " - " + contato.getValue());
        }

        System.out.println("\n-- Ordem nome contato --");
        Set<Map.Entry<Integer, Contato>> agenda4 = new TreeSet<>(new ComparatorNomeContato());
        agenda4.addAll(agenda.entrySet());

        for (Map.Entry<Integer, Contato> contato : agenda4) {
            System.out.println(contato.getKey() + " - " + contato.getValue());
        }
    }
}
