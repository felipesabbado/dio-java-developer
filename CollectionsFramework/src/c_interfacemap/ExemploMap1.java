package c_interfacemap;

import java.util.*;

public class ExemploMap1 {
    public static void main(String[] args) {
        System.out.println("Crie um dicionário que relacione os modelos e seus respectivos consumos:");
        Map<String, Double> carros = new HashMap<>(){{
            put("Gol", 14.4);
            put("Uno", 15.6);
            put("Mobi", 16.1);
            put("HB20", 14.5);
            put("Kwid", 15.6);
        }};

        System.out.println(carros);

        System.out.println("Substitua o consumo do gol por 15,2 km/l: ");
        carros.put("Gol", 15.2);

        System.out.println(carros);

        System.out.println("Confira se o modelo Tucson está no dicionário: " + carros.containsKey("Tucson"));
        System.out.println("Confira se o modelo HB20 está no dicionário: " + carros.containsKey("HB20"));

        System.out.println("Exiba o consumo do Uno: " + carros.get("Uno"));

        System.out.println("Exiba os modelos:");
        Set<String> modelos = carros.keySet();
        System.out.println(modelos);

        System.out.println("Exiba o consumo dos carros:");
        Collection<Double> consumos = carros.values();
        System.out.println(consumos);

        System.out.println("Exiba o modelo mais econômico e o seu consumo:");
        Double consumoMaisEficiente = Collections.max(carros.values());
        Set<Map.Entry<String, Double>> entries = carros.entrySet();

        // Funciona para quando existe mais de um modelo com o mesmo consumo
        for (Map.Entry<String, Double> e : entries) {
            if (e.getValue().equals(consumoMaisEficiente)) {
                System.out.println(e.getKey() + " - " + consumoMaisEficiente);
            }
        }

        System.out.println("Exiba o modelo menos econômico e o seu consumo:");
        Double consumoMenosEficiente = Collections.min(carros.values());

        // Funciona para quando existe mais de um modelo com o mesmo consumo
        for (Map.Entry<String, Double> e : carros.entrySet()) {
            if (e.getValue().equals(consumoMenosEficiente)) {
                System.out.println(e.getKey() + " - " + consumoMenosEficiente);
            }
        }

        double somaConsumos = 0;
        for (Double consumo : carros.values()) {
            somaConsumos += consumo;
        }

        System.out.println("Exiba a soma dos consumos: " + somaConsumos);

        System.out.println("Exiba a média dos consumos deste dicionário de carros: " + (somaConsumos/carros.size()));

        System.out.println("Remova os modelos com o consumo igual a 15,6 km/l:");
        System.out.println(carros);
        /*Iterator<Double> iterator = carros.values().iterator();
        while (iterator.hasNext()) {
            if (iterator.next().equals(15.6))
                iterator.remove();
        }*/
        carros.values().removeIf(consumo -> consumo.equals(15.6));

        System.out.println(carros);

        System.out.println("Exiba todos os carros na ordem em que foram informados:");
        Map<String, Double> carros1 = new LinkedHashMap<>(){{
            put("Gol", 14.4);
            put("Uno", 15.6);
            put("Mobi", 16.1);
            put("HB20", 14.5);
            put("Kwid", 15.6);
        }};
        System.out.println(carros1);

        System.out.println("Exiba o dicionário ordenado pelo modelo:");
        Map<String, Double> carros2 = new TreeMap<>(carros1);
        System.out.println(carros2);

        System.out.println("Apague o dicionário de carros:");
        carros.clear();
        System.out.println(carros);

        System.out.println("Confira se o dicionário está vazia: " + carros.isEmpty());
    }
}
