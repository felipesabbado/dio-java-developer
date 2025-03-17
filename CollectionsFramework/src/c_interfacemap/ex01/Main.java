package c_interfacemap.ex01;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> estadosNE = new HashMap<>(){{
            put("PE", 9_616_621);
            put("AL", 3_351_543);
            put("CE", 9_187_103);
            put("RN", 3_534_265);
        }};

        System.out.println(estadosNE);

        estadosNE.put("RN", 3_534_165);
        System.out.println(estadosNE);

        System.out.println("O estado da PB está no dicionário: " + estadosNE.containsKey("PB"));
        if (!estadosNE.containsKey("PB")) {
            estadosNE.put("PB", 4_039_277);
        }
        System.out.println(estadosNE);

        System.out.println("Exiba a população de PE: " + estadosNE.get("PE"));

        System.out.println("Exiba todos os estados e suas populações na ordem em que foram informados:");
        Map<String, Integer> estadosNE1 = new LinkedHashMap<>(){{
            put("PE", 9_616_621);
            put("AL", 3_351_543);
            put("CE", 9_187_103);
            put("RN", 3_534_165);
            put("PB", 4_039_277);
        }};
        System.out.println(estadosNE1);

        System.out.println("Exiba os estados e suas populações em ordem alfabética:");
        Map<String, Integer> estadosNE2 = new TreeMap<>(estadosNE);
        System.out.println(estadosNE2);

        System.out.println("Exiba o estado com a menor população e sua quantidade:");
        Integer menorPopulacao = Collections.min(estadosNE.values());
        for (Map.Entry<String, Integer> estado : estadosNE.entrySet()) {
            if (estado.getValue().equals(menorPopulacao)) {
                System.out.println(estado.getKey() + " - " + estado.getValue());
            }
        }

        System.out.println("Exiba o estado com a maior população e sua quantidade:");
        Integer maiorPopulacao = Collections.max(estadosNE.values());
        for (Map.Entry<String, Integer> estado : estadosNE.entrySet()) {
            if (estado.getValue().equals(maiorPopulacao))
                System.out.println(estado.getKey() + " - " + estado.getValue());
        }

        int soma = 0;
        for (int populacao : estadosNE.values())
            soma += populacao;

        System.out.println("Exiba a soma da população destes estados: " + soma);

        System.out.println("Exiba a média da população destes estados: " + (soma/estadosNE.size()));

        System.out.println("Remova os estados com a população menor que 4.000.000:");
        System.out.println(estadosNE);
        estadosNE.values().removeIf(populacao -> populacao < 4_000_000);
        System.out.println(estadosNE);

        estadosNE.clear();
        System.out.println("Apague o dicionário de estados: " + estadosNE);

        System.out.println("Confira se o dicionário está vazio: " + estadosNE.isEmpty());
    }
}
