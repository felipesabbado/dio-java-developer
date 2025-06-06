import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledIfEnvironmentVariable;
import org.junit.jupiter.api.condition.EnabledIfEnvironmentVariable;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.OS;

public class CondicionaisTeste {

    @Test
    @EnabledIfEnvironmentVariable(named = "USER", matches = "willyan")
    void validarAlgoSomenteNoUsuarioWillyan() {
        Assertions.assertEquals(10, 5 + 5);
    }

    @Test
    @DisabledIfEnvironmentVariable(named = "USER", matches = "willyan")
    void validarAlgoNoUsuarioNaoWillyan() {
        Assertions.assertEquals(10, 5 + 5);
    }

    @Test
    @EnabledOnOs(OS.WINDOWS)
    void validarAlgoNoWindows() {
        Assertions.assertEquals(10, 5 + 5);
    }
}
