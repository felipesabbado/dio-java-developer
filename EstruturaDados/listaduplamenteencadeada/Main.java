package listaduplamenteencadeada;

public class Main {
    public static void main(String[] args) {
        ListaDuplamenteEncadeada<String> minhaLista = new ListaDuplamenteEncadeada<>();
        String div = "----------------------------";

        System.out.println(div);
        System.out.print("minhaLista => ");
        System.out.println(minhaLista);
        System.out.println("tamanho = " + minhaLista.size());
        System.out.println(div);

        minhaLista.add("No1");
        minhaLista.add("No2");
        minhaLista.add("No3");

        System.out.print("minhaLista => ");
        System.out.println(minhaLista);
        System.out.println("tamanho = " + minhaLista.size());
        System.out.println(div);

        minhaLista.add(0, "No4");
        minhaLista.add(2, "No5");
        minhaLista.add(5, "No6");

        System.out.print("minhaLista => ");
        System.out.println(minhaLista);
        System.out.println("tamanho = " + minhaLista.size());
        System.out.println(div);

        minhaLista.remove(3);
        minhaLista.remove(4);

        System.out.print("minhaLista => ");
        System.out.println(minhaLista);
        System.out.println("tamanho = " + minhaLista.size());
        System.out.println(div);

        minhaLista.add("No99");
        System.out.print("minhaLista => ");
        System.out.println(minhaLista);
        System.out.println("tamanho = " + minhaLista.size());
        System.out.println(div);
    }
}
