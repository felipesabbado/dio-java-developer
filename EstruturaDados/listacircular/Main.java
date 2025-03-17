package listacircular;

public class Main {
    public static void main(String[] args) {
        String div = "\n------------------------\n";
        ListaCircular<String> minhaLista = new ListaCircular<>();

        System.out.println(div);
        System.out.println("Lista vazia:");
        System.out.println(minhaLista);

        minhaLista.add("c0");

        System.out.println(div);
        System.out.println("Adicionando o c0:");
        System.out.println(minhaLista);

        minhaLista.add("c1");
        minhaLista.add("c2");
        minhaLista.add("c3");
        minhaLista.add("c4");
        minhaLista.add("c5");
        minhaLista.add("c6");
        minhaLista.add("c7");
        minhaLista.add("c8");

        System.out.println(div);
        System.out.println("Adicionando do c1 ao c8:");
        System.out.println(minhaLista);

        minhaLista.remove(0);

        System.out.println(div);
        System.out.println("Removendo o índice 0:");
        System.out.println(minhaLista);

        minhaLista.remove(1);

        System.out.println(div);
        System.out.println("Removendo o índice 1:");
        System.out.println(minhaLista);

        minhaLista.remove(3);

        System.out.println(div);
        System.out.println("Removendo o índice 3:");
        System.out.println(minhaLista);

        System.out.println(div);
        System.out.print("Tamanho da lista: ");
        System.out.println(minhaLista.size());
        for (int i = 0; i < 10; i++) {
            System.out.println("Pegando o item de índice " + i + ": " + minhaLista.get(i));
        }
    }
}
