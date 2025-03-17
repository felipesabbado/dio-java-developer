package implementacoesjava;

import java.util.Arrays;
import java.util.Objects;

public class Carro implements Comparable<Carro>{
    private String marca;

    public Carro(String marca) {
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof Carro carro)) return false;
        return Objects.equals(getMarca(), carro.getMarca());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getMarca());
    }

    @Override
    public String toString() {
        return "Carro{" +
                "marca='" + marca + '\'' +
                '}';
    }

    @Override
    // Implementação por tamanho da string marca
    /*public int compareTo(Carro o) {
        *//*if (this.marca.length() < o.marca.length())
            return -1;

        if (this.marca.length() > o.marca.length())
            return 1;

        return 0;*//*

        return Integer.compare(this.marca.length(), o.marca.length());
    }*/
    // Implementação por ordem alfabética
    public int compareTo(Carro o) {
        return this.getMarca().compareTo(o.getMarca());
    }
}
