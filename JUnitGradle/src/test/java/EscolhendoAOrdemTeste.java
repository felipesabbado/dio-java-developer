import org.junit.jupiter.api.*;

//@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
/* Escolhe a ordem dos testes por meio da anotação
 * @Order(n), onde o n é o número da ordem em que os
 * testes serão executados */

//@TestMethodOrder(MethodOrderer.MethodName.class)
/* Executa os testes em ordem alfabética */

//@TestMethodOrder(MethodOrderer.Random.class)
/* Executa os testes aleatoriamente */

@TestMethodOrder(MethodOrderer.DisplayName.class)
/* Executa os testes na ordem alfabética do nome
 * contido na anotação @DisplayName() */
public class EscolhendoAOrdemTeste {

    @DisplayName("A")
    @Test
    void validaFluxoA() {
        System.out.println("Fluxo A");
        Assertions.assertTrue(true);
    }

    @DisplayName("B")
    @Test
    void validaFluxoB() {
        System.out.println("Fluxo B");
        Assertions.assertTrue(true);
    }

    @DisplayName("C")
    @Test
    void validaFluxoC() {
        System.out.println("Fluxo C");
        Assertions.assertTrue(true);
    }

    @DisplayName("D")
    @Test
    void validaFluxoD() {
        System.out.println("Fluxo D");
        Assertions.assertTrue(true);
    }
}
