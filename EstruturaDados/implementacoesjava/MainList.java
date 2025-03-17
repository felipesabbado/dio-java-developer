package implementacoesjava;

import java.util.ArrayList;
import java.util.List;

public class MainList {
    public static void main(String[] args) {
        String div = "\n------------------------------\n";
        List<Carro> listCarros = new ArrayList<>();

        listCarros.add(new Carro("Ford"));
        listCarros.add(new Carro("Fiat"));
        listCarros.add(new Carro("Volvo"));
        listCarros.add(new Carro("BYD"));

        System.out.println(div + listCarros);

        System.out.println(div + listCarros.contains(new Carro("Ford")));

        System.out.println(div + listCarros.get(2));

        System.out.println(div + listCarros.indexOf(new Carro("Fiat")));

        System.out.println(div + listCarros.indexOf(new Carro("Mercedes")));

        System.out.println(div + listCarros.remove(2));
        System.out.println(listCarros);

        System.out.println(div + listCarros.size());
    }
}
