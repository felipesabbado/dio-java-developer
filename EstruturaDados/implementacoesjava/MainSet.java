package implementacoesjava;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class MainSet {
    public static void main(String[] args) {
        String div = "--------------------------------\n";
        Set<Carro> hashSetCarros = new HashSet<>();

        hashSetCarros.add(new Carro("Fiat"));
        hashSetCarros.add(new Carro("Volvo"));
        hashSetCarros.add(new Carro("Ford"));
        hashSetCarros.add(new Carro("BYD"));
        hashSetCarros.add(new Carro("Zip"));
        hashSetCarros.add(new Carro("Alfa Romeo"));

        System.out.println(div + hashSetCarros);

        Set<Carro> treeSetCarros = new TreeSet<>();

        treeSetCarros.add(new Carro("Fiat"));
        treeSetCarros.add(new Carro("Volvo"));
        treeSetCarros.add(new Carro("Ford"));
        treeSetCarros.add(new Carro("BYD"));
        treeSetCarros.add(new Carro("Chevrolet"));
        treeSetCarros.add(new Carro("Alfa Romeo"));

        System.out.println(div + treeSetCarros);
    }
}
