package IOCharacter;

import java.io.*;

public class IOCharacterExercise1 {

    public static void main(String[] args) throws IOException {
        System.out.println("Recomende 3 filmes: ");
        /*
        // Recebendo do teclado
        InputStream is = System.in;
        // Convertendo para caractere
        InputStreamReader isr = new InputStreamReader(is);
        // Armazenando em um buffer
        BufferedReader br = new BufferedReader(isr);
        */

        // Padrão Decorator para simplificar o código acima
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String line = br.readLine();

        /*
        // Fluxo de saída análogo ao fluxo de entrada
        OutputStream os = System.out;
        OutputStreamWriter osw = new OutputStreamWriter(os);
        BufferedWriter bw = new BufferedWriter(osw);
        */

        // Padrão Decorator
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        do {
            bw.write(line);
            bw.newLine();
            line = br.readLine();
        } while (!line.isEmpty());

        bw.flush();
        br.close();
        bw.close();
    }
}
