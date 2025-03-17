package b_interfaceset.ex02;

import java.util.Comparator;

public class ComparatorLinguagemFavorita {
}

class ComparatorIde implements Comparator<LinguagemFavorita> {

    @Override
    public int compare(LinguagemFavorita o1, LinguagemFavorita o2) {
        int ide = o1.getIde().compareTo(o2.getIde());

        if (ide != 0) return ide;

        return o1.compareTo(o2);
    }
}

class ComparatorAnoDeCriacaoNome implements Comparator<LinguagemFavorita> {

    @Override
    public int compare(LinguagemFavorita o1, LinguagemFavorita o2) {
        int ano = Integer.compare(o1.getAnoDeCriacao(), o2.getAnoDeCriacao());
        if (ano != 0) return ano;

        return o1.compareTo(o2);
    }
}

class ComparatorNomeAnoDeCriacaoIde implements Comparator<LinguagemFavorita> {

    @Override
    public int compare(LinguagemFavorita o1, LinguagemFavorita o2) {
        int nome = o1.compareTo(o2);

        if (nome != 0) return nome;

        return o1.getIde().compareTo(o2.getIde());
    }
}
