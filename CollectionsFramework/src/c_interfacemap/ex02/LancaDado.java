package c_interfacemap.ex02;

import java.util.Map;
import java.util.Random;
import java.util.TreeMap;

public class LancaDado {
    public static void main(String[] args) {
        Random random = new Random();
        Map<Integer, Integer> dados = new TreeMap<>();

        for (int i = 0; i < 100; i++) {
            int dice = random.nextInt(6) + 1;
            if (dados.containsKey(dice))
                dados.put(dice, dados.get(dice) + 1);
            else
                dados.put(dice, 1);
        }
        
        System.out.println(dados);

        int total = 0;
        for (int qtd : dados.values())
            total += qtd;
        System.out.println("Total de jogadas: " + total);
    }
}
