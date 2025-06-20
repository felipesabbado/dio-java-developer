package checked;

import javax.swing.*;
import java.io.*;

public class CheckedException {

    public static void main(String[] args) {

        String nomeDoArquivo = "Exceptions/src/romances-blake-crouch.txt";

        try {
            imprimirArquivoNoConsole(nomeDoArquivo);
        } catch (FileNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Revise o nome do arquivo que você deseja imprimir!");
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro inesperado! Entre em contato com o suporte!");
        } finally {
            System.out.println("Chegou no finally!");
        }

        System.out.println("Apesar da exception ou não, o programa continua...");
    }

    public static void imprimirArquivoNoConsole(String nomeDoArquivo) throws IOException {

        BufferedReader br = new BufferedReader(new FileReader(nomeDoArquivo));

        String line = br.readLine();

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        do {
            bw.write(line);
            bw.newLine();
            line = br.readLine();
        } while (line != null);

        bw.flush();
        br.close();
    }
}
