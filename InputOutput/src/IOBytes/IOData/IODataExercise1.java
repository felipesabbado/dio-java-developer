package IOBytes.IOData;

import java.io.*;
import java.util.Scanner;

public class IODataExercise1 {
    public static void main(String[] args) throws IOException {
        File file = new File("InputOutput/assets/peca-de-roupa.bin");
        incluirProduto(file);
    }

    public static void incluirProduto(File file) throws IOException {

        PrintStream ps = new PrintStream(System.out);
        ps.flush();

        DataOutputStream dos = new DataOutputStream(new FileOutputStream(file.getPath()));

        Scanner teclado = new Scanner(System.in);

        ps.print("Nome da peça: ");
        String nome = teclado.nextLine();
        dos.writeUTF(nome);

        ps.print("Tamanho da peça (P/M/G/U): ");
        char tamanho = (char) System.in.read();
        dos.writeChar(tamanho);

        ps.print("Quantidade: ");
        int quantidade = teclado.nextInt();
        dos.writeInt(quantidade);

        ps.print("Preço unitário: ");
        double preco = teclado.nextDouble();
        dos.writeDouble(preco);

        ps.printf("\nO arquivo %s foi criado com %d bytes no diretório %s.\n", file.getName(), file.length(), file.getAbsolutePath());

        lerProduto(file);

        dos.close();
        teclado.close();
        ps.close();
    }

    public static void lerProduto(File file) throws IOException {
        DataInputStream dis = new DataInputStream(new FileInputStream(file.getPath()));

        String nome = dis.readUTF();
        char tamanho = dis.readChar();
        int quantidade = dis.readInt();
        double preco = dis.readDouble();

        System.out.printf("\nNome.............: %s\n", nome);
        System.out.printf("Quantidade.......: %d\n", quantidade);
        System.out.printf("Tamanho..........: %s\n", tamanho);
        System.out.printf("Preço............: %.2f\n", preco);
        System.out.printf("Total do valor das peças: %.2f\n", quantidade * preco);

        dis.close();
    }
}
