package LSP;

public class Main {
    /*
     * Este é um exemplo de como o Princípio da
     * Substituição de Liskov foi quebrado.
     * Nem toda a abstração funciona, a menos em que ela
     * possa ser feita com sua classe base também.
     * As soluções para o problema são diversas.
     * Poderíamos extrair da classe Retangulo o método
     * getArea e colocar numa abstração de uma interface,
     * em que cada um (retângulo ou quadrado) fosse
     * calcular sua própria área.
     * Outra solução seria fazer com que a classe Quadrado
     * não estendesse da classe Retangulo
     */

    public static void main(String[] args) {
        Retangulo retangulo = new Quadrado();

        retangulo.setAltura(10);
        retangulo.setLargura(5);

        System.out.println("Area: " + retangulo.getArea());
    }
}
