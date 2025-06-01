package IOBytes;

import java.io.*;

public class IOBytesExercise1 {
    public static void main(String[] args) throws IOException {
        File f = new File("InputOutput/assets/recomendacoes-copy.txt");
        String filePath = f.getPath();

        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(filePath));

        String filePathCopy = filePath.replace(".txt", "2.txt");
        File fCopy = new File(filePathCopy);

        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(filePathCopy));

        int line = 0;
        while ((line = bis.read()) != -1) {
            bos.write((char) line);
            bos.flush();
        }

        bis.close();
        bos.close();

        PrintStream ps = new PrintStream(System.out);
        ps.printf("Arquivo %s copiado com sucesso e está no diretório %s com %d bytes.\n", fCopy.getName(), fCopy.getParent(), fCopy.length());
    }
}
