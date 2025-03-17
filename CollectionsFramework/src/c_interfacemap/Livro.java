package c_interfacemap;

import java.util.Comparator;
import java.util.Map;
import java.util.Objects;

public class Livro {
    private String nome;
    private int paginas;

    public Livro(String nome, int paginas) {
        this.nome = nome;
        this.paginas = paginas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Livro livro = (Livro) o;
        return paginas == livro.paginas && Objects.equals(nome, livro.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, paginas);
    }

    @Override
    public String toString() {
        return "{livro=" + nome +
                ", páginas=" + paginas +
                '}';
    }
}

class ComparatorNome implements Comparator<Map.Entry<String, Livro>> {

    @Override
    public int compare(Map.Entry<String, Livro> l1, Map.Entry<String, Livro> l2) {
        int nome = l1.getValue().getNome().compareToIgnoreCase(l2.getValue().getNome());

        if (nome != 0) return nome;

        return Integer.compare(l1.getValue().getPaginas(), l2.getValue().getPaginas());
    }
}

class ComparatorPagina implements Comparator<Map.Entry<String, Livro>> {

    @Override
    public int compare(Map.Entry<String, Livro> l1, Map.Entry<String, Livro> l2) {
        int paginas = Integer.compare(l1.getValue().getPaginas(), l2.getValue().getPaginas());

        if (paginas != 0) return paginas;

        return l1.getKey().compareToIgnoreCase(l2.getKey());
    }
}
