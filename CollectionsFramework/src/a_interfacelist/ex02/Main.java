package a_interfacelist.ex02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> perguntas = new ArrayList<>();
        perguntas.add("Telefonou para a vítima?");
        perguntas.add("Esteve no local do crime?");
        perguntas.add("Mora perto da vítima?");
        perguntas.add("Devia para a vítima?");
        perguntas.add("Já trabalhou com a vítima?");

        System.out.println("Responda as seguintes questões com sim ou não.");

        int respostasAfirmativas = 0;
        for (String pergunta : perguntas) {
            System.out.println(pergunta);
            String reposta = scanner.nextLine().toLowerCase();
            while (!(reposta.startsWith("s") || reposta.startsWith("n"))) {
                System.out.println("Por favor, responda com sim ou não.");
                reposta = scanner.nextLine().toLowerCase();
            }
            if (reposta.startsWith("s")) {
                respostasAfirmativas++;
            }
        }

        System.out.println("Calculando resultado...");
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.print("A pessoa é ");
        if (respostasAfirmativas < 2) {
            System.out.println("Inocente");
        } else if (respostasAfirmativas < 3) {
            System.out.println("Suspeita");
        } else if (respostasAfirmativas < 5) {
            System.out.println("Cúmplice");
        } else {
            System.out.println("Assassina");
        }
    }
}
