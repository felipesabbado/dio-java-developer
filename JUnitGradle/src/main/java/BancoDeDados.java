import java.util.logging.Logger;

public class BancoDeDados {

    private static final Logger LOGGER = Logger.getLogger(BancoDeDados.class.getName());

    public static void iniciarConexao() {
        // Fez algo
        LOGGER.info("Iniciou conexão");
    }

    public static void finalizarConexao() {
        // Fez algo
        LOGGER.info("Finalizou conexão");
    }

    public static void insereDados(Pessoa pessoa) {
        // Insere Pessoa no banco de dados
        LOGGER.info("Inseriu pessoa no BD");
    }

    public static void removeDados(Pessoa pessoa) {
        // Remove Pessoa do banco de dados
        LOGGER.info("Removeu pessoa do BD");
    }
}
