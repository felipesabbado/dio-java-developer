package c_interfacemap;

import java.util.*;

public class ExemploMap2 {
    public static void main(String[] args) {
        Livro livro1 = new Livro("Uma Breve História do Tempo", 256);
        Livro livro2 = new Livro("O Poder do Hábito", 408);
        Livro livro3 = new Livro("21 Lições Para o Século 21", 432);

        Map<String, Livro> livros = new HashMap<>(){{
            put("Hawking, Stephen", livro1);
            put("Duhigg, Charles", livro2);
            put("Harari, Yuval Noah", livro3);
        }};

        System.out.println("-- Ordem aleatória --");
        for (Map.Entry<String, Livro> livro : livros.entrySet()) {
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());
        }

        System.out.println("-- Ordem de inserção --");
        Map<String, Livro> livros1 = new LinkedHashMap<>(){{
            put("Hawking, Stephen", livro1);
            put("Duhigg, Charles", livro2);
            put("Harari, Yuval Noah", livro3);
        }};

        for (Map.Entry<String, Livro> livro : livros1.entrySet()) {
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());
        }

        System.out.println("-- Ordem alfabética de autores --");
        Map<String, Livro> livros2 = new TreeMap<>(livros);

        for (Map.Entry<String, Livro> livro : livros2.entrySet()) {
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());
        }

        System.out.println("-- Ordem alfabética de nome dos livros --");
        Set<Map.Entry<String, Livro>> livros3 = new TreeSet<>(new ComparatorNome());
        livros3.addAll(livros.entrySet());
        for (Map.Entry<String, Livro> livro : livros3) {
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());
        }

        System.out.println("-- Ordem do número de páginas --");
        Set<Map.Entry<String, Livro>> livros4 = new TreeSet<>(new ComparatorPagina());
        livros4.addAll(livros.entrySet());
        for (Map.Entry<String, Livro> livro : livros4) {
            System.out.println(livro);
        }
    }
}
