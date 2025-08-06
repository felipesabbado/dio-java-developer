import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.anyString;

@ExtendWith(MockitoExtension.class)
public class CadastrarPessoaTest {

    @Mock
    private ApiDosCorreios apiDosCorreios;

    @InjectMocks
    private CadastrarPessoa cadastrarPessoa;

    @Test
    void validarDadosDeCadastro() {
        DadosLocalizacao dadosLocalizacao = new DadosLocalizacao("MG", "Passos", "Rua do Carmo", "2", "Centro");

        Mockito.when(apiDosCorreios.buscaDadosComBaseNoCep(anyString())).thenReturn(dadosLocalizacao);

        Pessoa pessoa = cadastrarPessoa.cadastrarPessoa("Willyan", "72672637", LocalDate.now(), "12345-100");

        assertEquals("Willyan", pessoa.getNome());
        assertEquals("72672637", pessoa.getDocumento());

        DadosLocalizacao enderecoPessoa = pessoa.getEndereco();
        assertEquals(dadosLocalizacao.getUf(), enderecoPessoa.getUf());
        assertEquals(dadosLocalizacao.getComplemento(), enderecoPessoa.getComplemento());
        assertEquals(dadosLocalizacao.getCidade(), enderecoPessoa.getCidade());
        assertEquals(dadosLocalizacao.getBairro(), enderecoPessoa.getBairro());
    }

    @Test
    void lancarExceptionQuandoChamarApiDosCorreios() {

        /*Mockito.when(apiDosCorreios.buscaDadosComBaseNoCep(anyString())).thenThrow(IllegalArgumentException.class);*/

        // Outra forma de fazer o mesmo que o de cima
        Mockito.doThrow(IllegalArgumentException.class).when(apiDosCorreios).buscaDadosComBaseNoCep(anyString());

        assertThrows(IllegalArgumentException.class, () -> cadastrarPessoa.cadastrarPessoa("Willyan", "72672637", LocalDate.now(), "12345-100"));
    }
}
