import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class PessoaTest {

    @Test
    void validarCalculoDeIdade() {
        Pessoa julia = new Pessoa("Julia", LocalDate.of(2020, 1, 1));
        Assertions.assertEquals(5, julia.getIdade());
    }

    @Test
    void deveCalcularIdadeCorretamente() {
        Pessoa jessica = new Pessoa("Jéssica", LocalDate.of(2000, 1, 1));
        Assertions.assertEquals(25, jessica.getIdade());
    }

    @Test
    void deveRetornarSeEhMaiorDeIdade() {
        Pessoa pedro = new Pessoa("Pedro", LocalDate.of(2000, 1, 1));
        Assertions.assertTrue(pedro.ehMaiorDeIdade());

        Pessoa joao = new Pessoa("João", LocalDate.now());
        Assertions.assertFalse(joao.ehMaiorDeIdade());
    }
}
