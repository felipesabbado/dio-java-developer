package IOCharacter;

import java.io.*;

public class IOCharacterExercise3 {
    public static void main(String[] args) throws IOException {
        copyFile();
    }

    public static void copyFile() throws IOException {
        String path = "InputOutput/assets/recomendacoes.txt";
        File f = new File(path);

        String pathCopy = path.replace(".txt", "-copy.txt");
        File fCopy = new File(pathCopy);

        BufferedWriter bw = new BufferedWriter(new FileWriter(fCopy.getPath()));

        BufferedReader br = new BufferedReader(new FileReader(f.getPath()));
        String line = br.readLine();

        do {
            bw.write(line);
            bw.newLine();
            bw.flush();
            line = br.readLine();
        } while (line != null);

        System.out.printf("Arquivo \"%s\" copiado com sucesso! Com o tamanho de %d bytes.\n", f.getName(), f.length());
        System.out.printf("Arquivo \"%s\" criado com sucesso! Com o tamanho de %d bytes.\n", fCopy.getName(), fCopy.length());

        PrintWriter pw = new PrintWriter(System.out);
        pw.println("Recomende 3 livros: ");
        pw.flush();

        addInfoFile(fCopy.getPath());

        pw.printf("Informação adicionada com sucesso. Tamanho do arquivo %d bytes.\n", fCopy.length());

        br.close();
        bw.close();
        pw.close();
    }

    public static void addInfoFile(String file) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();

        BufferedWriter bw = new BufferedWriter(new FileWriter(file, true));

        do {
            bw.write(line);
            bw.flush();
            bw.newLine();
            line = br.readLine();
        } while (!line.equalsIgnoreCase("fim"));

        bw.close();
        br.close();
    }
}
