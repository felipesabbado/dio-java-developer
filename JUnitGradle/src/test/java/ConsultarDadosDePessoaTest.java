import org.junit.jupiter.api.*;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

public class ConsultarDadosDePessoaTest {
    // Executa uma vez antes de todos os testes
    @BeforeAll
    static void configuraConexao() {
        BancoDeDados.iniciarConexao();
    }

    // Executa antes de cada um dos testes
    @BeforeEach
    void insereDadosParaTeste() {
        BancoDeDados.insereDados(new Pessoa("João", LocalDate.of(2000, 1, 1)));
    }

    // Executa depois de cada um dos testes
    @AfterEach
    void removeDadosDoTeste() {
        BancoDeDados.removeDados(new Pessoa("João", LocalDate.of(2000, 1, 1)));
    }

    @Test
    void validarDadosDeRetorno() {
        assertTrue(true);
        System.out.println("Validou dados");
    }

    @Test
    void validarDadosDeRetorno2() {
        assertNull(null);
        System.out.println("Validou dados 2");
    }

    // Executa uma vez depois de todos os testes
    @AfterAll
    static void finalizarConexao() {
        BancoDeDados.finalizarConexao();
    }
}
