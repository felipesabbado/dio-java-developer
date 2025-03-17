package implementacoesjava;

import java.util.ArrayList;
import java.util.List;

public class MainEqualsHashCode {
    public static void main(String[] args) {
        List<Carro> carros = new ArrayList<>();

        carros.add(new Carro("Ford"));
        carros.add(new Carro("Chevrolet"));
        carros.add(new Carro("Toyota"));
        carros.add(new Carro("Volkswagen"));
        carros.add(new Carro("Peugeot"));
        carros.add(new Carro("Renault"));

        System.out.println(carros.contains(new Carro("Ford")));

        System.out.println(new Carro("Ford").hashCode());
        System.out.println(new Carro("Ford").hashCode());
        System.out.println(new Carro("Ford1").hashCode());

        Carro primeiro = carros.getFirst();

        System.out.println(primeiro.equals(new Carro("Ford")));
    }
}
