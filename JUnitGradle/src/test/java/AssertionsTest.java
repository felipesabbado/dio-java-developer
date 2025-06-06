import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

public class AssertionsTest {

    @Test
    void validarLancamentos() {
        int[] primeiroLancamento = {10, 20, 30, 40, 50};
        int[] segundoLancamento = {10, 20, 30, 40, 50};
        int[] terceiroLancamento = {10, 5, 2, 3, 10};

        // Verifica se o segundo array é igual ao primeiro
        assertArrayEquals(primeiroLancamento, segundoLancamento);

        // Verifica se o terceiro array é diferente do primeiro
        assertNotEquals(primeiroLancamento, terceiroLancamento);
    }

    @Test
    void validarSeObjetoEstaNulo() {
        Pessoa pessoa = null;

        assertNull(pessoa);

        pessoa = new Pessoa("Luciano", LocalDate.now());
        assertNotNull(pessoa);
    }

    @Test
    void validarNumerosDeTiposDiferentes() {
        double valor = 5.0;
        double outroValor = 5.0;

        assertEquals(valor, outroValor);
    }
}
