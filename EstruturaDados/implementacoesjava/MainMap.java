package implementacoesjava;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainMap {
    public static void main(String[] args) {
        Map<String, String> aluno01 = new HashMap<>();
        Map<String, String> aluno02 = new HashMap<>();

        aluno01.put("Nome", "João");
        aluno01.put("Idade", "17");
        aluno01.put("Media", "8.5");
        aluno01.put("Turma", "3a");

        aluno02.put("Nome", "Maria");
        aluno02.put("Idade", "16");
        aluno02.put("Media", "9");
        aluno02.put("Turma", "2b");

        System.out.println();
        System.out.println(aluno01);

        System.out.println(aluno01.keySet());
        System.out.println(aluno01.values());

        List<Map<String, String>> listaAlunos = new ArrayList<>();

        listaAlunos.add(aluno01);
        listaAlunos.add(aluno02);

        System.out.println(listaAlunos);

        System.out.println(aluno01.containsKey("Nome"));
    }
}
