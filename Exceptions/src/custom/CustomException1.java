package custom;

import javax.swing.*;
import java.io.*;

public class CustomException1 {

    public static void main(String[] args) {
        String nomeDoArquivo = "Exceptions/src/";
        nomeDoArquivo += JOptionPane.showInputDialog("Nome do arquivo a ser exibido: ");

        imprimirArquivoNoConsole(nomeDoArquivo);
        System.out.println("\nCom exception ou não, o programa continua...");
    }

    public static void imprimirArquivoNoConsole(String nomeDoArquivo) {

        try {
            BufferedReader br = lerArquivo(nomeDoArquivo);
            String line = br.readLine();
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

            do {
                bw.write(line);
                bw.newLine();
                line = br.readLine();
            } while (line != null);

            bw.flush();
            br.close();
        } catch (ImpossivelAberturaDeArquivoException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro não esperado, por favor, fale com o suporte.\n" + e.getMessage());
        }
    }

    public static BufferedReader lerArquivo(String nomeDoArquivo) throws ImpossivelAberturaDeArquivoException {
        File file = new File(nomeDoArquivo);

        try {
            return new BufferedReader(new FileReader(nomeDoArquivo));
        } catch (FileNotFoundException e) {
            throw new ImpossivelAberturaDeArquivoException(file.getName(), file.getPath());
        }
    }
}

class ImpossivelAberturaDeArquivoException extends Exception {
    private String nomeDoArquivo;
    private String diretorio;

    public ImpossivelAberturaDeArquivoException(String nomeDoArquivo, String diretorio) {
        super("O arquivo " + nomeDoArquivo + " não foi encontrado no diretório " + diretorio);
        this.nomeDoArquivo = nomeDoArquivo;
        this.diretorio = diretorio;
    }

    public String getNomeDoArquivo() {
        return nomeDoArquivo;
    }

    public String getDiretorio() {
        return diretorio;
    }
}
