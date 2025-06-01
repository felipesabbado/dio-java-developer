public class Recursivo {
    public static void main(String[] args) {
        System.out.println("Começo da função main");
        recursivo(5);
//        a();
        System.out.println("Fim da função main");
    }

    static void recursivo(int x) {
        if (x == 0) {
            System.out.println("Finalizando execução recursiva");
        } else {
            System.out.println("Recursivo nº" + x);
            recursivo(x - 1);
            System.out.println("Fim da recursiva nº" + x);
        }
    }

    static void a() {
        System.out.println("Início da função a");
        b();
        System.out.println("Fim da função a");
    }

    static void b() {
        System.out.println("Início da função b");
        for (int i = 0; i < 4; i++) {
            System.out.println(i);
        }
        c();
        System.out.println("Fim da função b");
    }

    static void c() {
        System.out.println("Início da função c");
        System.out.println("Fim da função c");
    }
}
