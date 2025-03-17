package b_interfaceset.ex01;

import java.util.*;

public class ArcoIris {
    /* Crie um conjunto (set) contendo todas
     * as cores do arco-íris e:
     */
    public static void main(String[] args) {
        Set<String> arcoIris1 = new LinkedHashSet<>(Arrays.asList("Violeta", "Anil", "Azul", "Verde", "Amarelo", "Laranja", "Vermelho"));

        System.out.println("Exiba todas as cores uma abaixo da outra:");
        for (String cor : arcoIris1)
            System.out.println(cor);

        System.out.println("A quantidade de cores do arco-íris: " + arcoIris1.size());

        System.out.println("Exiba as cores em ordem alfabética:");
        Set<String> arcoIris2 = new TreeSet<>(arcoIris1);
        System.out.println(arcoIris2);

        System.out.println("Exiba as cores na ordem inversa da que foi informada:");
        List<String> arcoIris3 = new ArrayList<>(arcoIris1);
        System.out.println(arcoIris3.reversed());

        System.out.println("Exiba todas as cores que começam com a letra 'v':");
        for (String cor : arcoIris2) {
            if (cor.toLowerCase().startsWith("v"))
                System.out.println(cor);
        }

        System.out.println("Remova todas as cores que começam com a letra 'v':");
        arcoIris2.removeIf(cor -> cor.toLowerCase().startsWith("v"));
        System.out.println(arcoIris2);

        System.out.println("Limpe o conjunto");
        arcoIris2.clear();

        System.out.println("Confira se o conjunto está vazio: " + arcoIris2.isEmpty());
        System.out.println(arcoIris2);
    }
}
