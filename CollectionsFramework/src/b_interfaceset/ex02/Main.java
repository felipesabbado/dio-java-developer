package b_interfaceset.ex02;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    /* Crie uma classe LinguagemFavorita que possua
     * os atributos, nome, anoDeCriação e ide.
     * Em seguida, crie um conjunto com 3 linguagens e faça um programa que ordene esse conjunto por:
     */
    public static void main(String[] args) {
        Set<LinguagemFavorita> linguagensFavoritas = new LinkedHashSet<>(){{
            add(new LinguagemFavorita("Java", 1995, "IntelliJ"));
            add(new LinguagemFavorita("Python", 1991, "PyCharm"));
            add(new LinguagemFavorita("JavaScript", 2005, "VS Code"));
        }};

        System.out.println("--- Ordem de Inserção ---");
        for (LinguagemFavorita l : linguagensFavoritas) {
            System.out.println(l);
        }

        System.out.println("--- Ordem de Natural (nome) ---");
        Set<LinguagemFavorita> linguagensFavoritas1 = new TreeSet<>(linguagensFavoritas);
        for (LinguagemFavorita l : linguagensFavoritas1) {
            System.out.println(l);
        }

        System.out.println("--- Ordem de IDE ---");
        Set<LinguagemFavorita> linguagensFavoritas2 = new TreeSet<>(new ComparatorIde());
        linguagensFavoritas2.addAll(linguagensFavoritas);
        for (LinguagemFavorita l : linguagensFavoritas2) {
            System.out.println(l);
        }

        System.out.println("--- Ordem de Ano de Criação e Nome ---");
        Set<LinguagemFavorita> linguagensFavoritas3 = new TreeSet<>(new ComparatorAnoDeCriacaoNome());
        linguagensFavoritas3.addAll(linguagensFavoritas);
        for (LinguagemFavorita l : linguagensFavoritas3) {
            System.out.println(l);
        }

        System.out.println("--- Ordem de Nome, Ano de Criação e IDE ---");
        Set<LinguagemFavorita> linguagensFavoritas4 = new TreeSet<>(new ComparatorNomeAnoDeCriacaoIde());
        linguagensFavoritas4.addAll(linguagensFavoritas);

        for (LinguagemFavorita l : linguagensFavoritas4) {
            System.out.println(l);
        }
    }
}
