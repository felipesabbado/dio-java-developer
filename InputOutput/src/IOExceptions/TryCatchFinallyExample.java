package IOExceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TryCatchFinallyExample {
    public static void main(String[] args) {
        // Arquivo existe
        String filePath1 = "InputOutput/assets/dica-para-ler-e-escrever-arquivo-java-IO.txt";
        File file1 = new File(filePath1);
        System.out.println(file1.getName() + " existe? " + file1.exists());

        // Arquivo não existe
        String filePath2 = "test.txt";
        File file2 = new File(filePath2);
        System.out.println(file2.getName() + " existe? " + file2.exists());

        FileReader fr = null;

        try {
            fr = new FileReader(file1.getPath());
            System.out.println("Stream recebida com sucesso! " + file1.getName());

            fr.close();

            fr = new FileReader(file2.getPath());
            System.out.println("Stream recebida com sucesso! " + file2.getName());

            fr.close();

        } catch (FileNotFoundException e) {
            System.out.println("Arquivo não encontrado, motivo: " + e.getCause());
            System.out.println("Por gentileza, confira se o arquivo existe " + e.getMessage());
            //e.printStackTrace();
        } catch (IOException | NullPointerException e) {
            System.out.println("Arquivo não pode ser fechado!" + e.getCause());
            System.out.println(e.getMessage());
        } finally {
            System.out.println("A execução do finally ocorre independente se houve exception ou não.");
        }

        System.out.println("** Programa continua normalmente! **");
    }
}
