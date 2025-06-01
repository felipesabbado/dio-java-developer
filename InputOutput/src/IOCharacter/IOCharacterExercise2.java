package IOCharacter;

import java.io.*;
import java.util.Scanner;

public class IOCharacterExercise2 {
    public static void main(String[] args) throws IOException {
        PrintWriter pw = new PrintWriter(System.out);
        pw.println("Digite 3 recomendações de filme: ");
        pw.flush();

        Scanner teclado = new Scanner(System.in);
        String line = teclado.nextLine();

        File f = new File("InputOutput/assets/recomendacoes.txt");

        BufferedWriter bw = new BufferedWriter(new FileWriter(f.getPath()));

        do {
            bw.write(line);
            bw.newLine();
            bw.flush();
            line = teclado.nextLine();
        } while (!line.equalsIgnoreCase("fim"));

        bw.close();

        pw.printf("Arquivo \"%s\" foi criado com sucesso!", f.getName());

        pw.close();
        teclado.close();
    }
}
