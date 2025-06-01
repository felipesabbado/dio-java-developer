package IOCharacter;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileExemple {

    public static void main(String[] args) {
        File f = new File("InputOutput/assets/dica-para-ler-e-escrever-arquivo-java-IO.txt");

        System.out.println("Nome do arquivo: " + f.getName());
        System.out.println("Caminho: " + f.getPath());
        System.out.println("Caminho absoluto: " + f.getAbsolutePath());
        System.out.println("Diretório pai: " + f.getParent());
        System.out.println(f.exists() ? "Existe" : "Não existe");
        System.out.println(f.canWrite() ? "Pode ser gravado" : "Não pode ser gravado");
        System.out.println(f.canRead() ? "Pode ser lido" : "Não pode ser lido");
        System.out.println(f.isDirectory() ? "É diretório" : "Não é diretório");

        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        Date data = new Date(f.lastModified());
        System.out.println("Última modificação do arquivo: " + df.format(data));
        System.out.println("Tamanho do arquivo: " + f.length() + " bytes");
    }
}
