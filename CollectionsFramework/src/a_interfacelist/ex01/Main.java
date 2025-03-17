package a_interfacelist.ex01;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String[] meses = {"Jan", "Fev", "Mar", "Abr", "Mai", "Jun", "Jul", "Ago", "Set", "Out", "Nov", "Dez"};

        List<Double> temperaturasMedias = new ArrayList<>(){{
            add(7.5);
            add(8.0);
            add(9.5);
            add(11.1);
            add(13.8);
            add(17.8);
            add(21.6);
            add(22.0);
            add(18.8);
            add(14.3);
            add(10.5);
            add(8.1);
        }};

        double somaMedias = 0;
        for (double temp : temperaturasMedias) {
            somaMedias += temp;
        }
        double mediaAnual = somaMedias / temperaturasMedias.size();

        System.out.println("Temperatura Média Anual: " + mediaAnual  + "ºC");

        System.out.println("Temperaturas acima da média (Mês/ºC)");
        for (int i = 0; i < 12; i++) {
            if (temperaturasMedias.get(i) > mediaAnual) {
                System.out.println(meses[i] + ": " + temperaturasMedias.get(i) + "ºC");
            }
        }

    }
}
