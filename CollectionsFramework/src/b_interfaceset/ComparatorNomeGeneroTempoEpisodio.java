package b_interfaceset;

import java.util.Comparator;

public class ComparatorNomeGeneroTempoEpisodio implements Comparator<Serie> {

    @Override
    public int compare(Serie s1, Serie s2) {
        int nome = s1.getNome().compareTo(s2.getNome());
        if (nome != 0)
            return nome;

        int genero = s1.getGenero().compareTo(s2.getGenero());
        if (genero != 0)
            return genero;

        return Integer.compare(s1.getTempoEpisodio(), s2.getTempoEpisodio());
    }
}

class ComparatorGenero implements Comparator<Serie> {

    @Override
    public int compare(Serie s1, Serie s2) {
        int genero = s1.getGenero().compareTo(s2.getGenero());
        if (genero != 0) return genero;

        return s1.getNome().compareTo(s2.getNome());
    }
}

class ComparatorTempoEpisodio implements Comparator<Serie> {

    @Override
    public int compare(Serie s1, Serie s2) {
        int tempoEpisodio = Integer.compare(s1.getTempoEpisodio(), s2.getTempoEpisodio());

        if (tempoEpisodio != 0) return tempoEpisodio;

        return s1.getNome().compareTo(s2.getNome());
    }
}
