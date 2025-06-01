package IOBytes.IOObject;

import java.io.*;

public class IOObjectExercise1 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Gato gato = new Gato("Simba", 6, "amarelado", false, true);
        File file = new File("InputOutput/assets/gato");

        serialize(gato, file);
        deserialize(file);
    }

    public static void serialize(Object object, File file) throws IOException {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file.getPath()));

        // Escrever objetos no arquivo
        oos.writeObject(object);

        // Também é possivel escrever tipos primitivos
        oos.writeInt(42);
        oos.writeDouble(3.14);
        oos.writeUTF("Olá, mundo!");
        oos.writeBoolean(true);

        System.out.printf("Arquivo %s, de %d bytes, salvo com sucesso no caminho %s", file.getName(), file.length(), file.getParent());

        oos.close();
    }

    public static void deserialize(File file) throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file.getPath()));

        Gato gato = (Gato) ois.readObject();
        var number = ois.readInt();
        var PI = ois.readDouble();
        var greeting = ois.readUTF();
        var isReal = ois.readBoolean();

        System.out.println(" --- Dados do Arquivo ---");
        System.out.println("Caminho: " + file.getPath());
        System.out.println("Tamanho: " + file.length() + " bytes");
        System.out.println("Objeto: " + gato);
        System.out.println("Inteiro: " + number);
        System.out.println("Double: " + PI);
        System.out.println("String: " + greeting);
        System.out.println("Boolean: " + isReal);

        ois.close();
    }
}
