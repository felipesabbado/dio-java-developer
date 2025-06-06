import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ExceptionsTeste {

    @Test
    void validarCenarioDeExcecaoNaTransferencia() {
        Conta origem = new Conta("123456", 100);
        Conta destino = new Conta("654321", 0);

        TranferenciaEntreContas tranferenciaEntreContas = new TranferenciaEntreContas();

        Assertions.assertThrows(IllegalArgumentException.class, () -> tranferenciaEntreContas.transfere(origem, destino, -1));

        Assertions.assertThrows(RuntimeException.class, () -> tranferenciaEntreContas.transfere(origem, destino, 200));

        Assertions.assertDoesNotThrow(() -> tranferenciaEntreContas.transfere(origem, destino, 50));
    }
}
