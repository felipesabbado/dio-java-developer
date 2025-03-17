package a_interfacelist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenarList1 {
    public static void main(String[] args) {
        List<Gato> listaGatos = new ArrayList<>() {{
            add(new Gato("Jon", 18, "preto"));
            add(new Gato("Simba", 6, "tigrado"));
            add(new Gato("Jon", 12, "amarelo"));
        }};

        System.out.println();

        System.out.println("\n--- Ordem de Inserção ---");
        System.out.println(listaGatos);

        System.out.println("\n--- Ordem Aleatória ---");
        Collections.shuffle(listaGatos);
        System.out.println(listaGatos);

        System.out.println("\n--- Ordem Natural (Nome) ---");
        Collections.sort(listaGatos);
        System.out.println(listaGatos);

        System.out.println("\n--- Ordem Idade ---");
        //Collections.sort(listaGatos, new ComparatorIdade());
        listaGatos.sort(new ComparatorIdade().reversed());
        System.out.println(listaGatos);

        System.out.println("\n--- Ordem Cor ---");
        listaGatos.sort(new ComparatorCor());
        System.out.println(listaGatos);

        System.out.println("\n--- Ordem Nome/Cor/Idade ---");
        listaGatos.sort(new ComparatorNomeCorIdade());
        System.out.println(listaGatos);
    }
}
