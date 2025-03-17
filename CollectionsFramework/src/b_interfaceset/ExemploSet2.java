package b_interfaceset;

import java.util.*;

public class ExemploSet2 {
    public static void main(String[] args) {
        // Exemplos de Ordenação em Coleções (Set)
        System.out.println("--\tOrdem aleatória\t--");
        Set<Serie> series1 = new HashSet<>(){{
            add(new Serie("Game of Thrones", "Fantasia", 60));
            add(new Serie("Dark", "Drama", 60));
            add(new Serie("Brooklyn 99", "Comédia", 25));
        }};

        for (Serie serie : series1) {
            System.out.println(serie);
        }

        System.out.println("--\tOrdem de inserção\t--");
        Set<Serie> series2 = new LinkedHashSet<>(){{
            add(new Serie("Game of Thrones", "Fantasia", 60));
            add(new Serie("Dark", "Drama", 60));
            add(new Serie("Brooklyn 99", "Comédia", 25));
        }};
        for (Serie serie : series2) {
            System.out.println(serie);
        }

        System.out.println("--\tOrdem natural (Tempo de Episódio)\t--");
        Set<Serie> series3 = new TreeSet<>(series2);
        for (Serie serie : series3) {
            System.out.println(serie);
        }

        System.out.println("--\tOrdem de Nome/Gênero/TempoEpisodio\t--");
        Set<Serie> series4 = new TreeSet<>(new ComparatorNomeGeneroTempoEpisodio());
        series4.addAll(series3);

        for (Serie serie : series4) {
            System.out.println(serie);
        }

        System.out.println("--\tOrdem de gênero\t--");
        Set<Serie> series5 = new TreeSet<>(new ComparatorGenero());
        series5.addAll(series1);

        for (Serie serie : series5) {
            System.out.println(serie);
        }

        System.out.println("--\tOrdem de tempo de episódio\t--");
        Set<Serie> series6 = new TreeSet<>(new ComparatorTempoEpisodio());
        series6.addAll(series1);

        for (Serie serie : series6) {
            System.out.println(serie);
        }
    }
}
