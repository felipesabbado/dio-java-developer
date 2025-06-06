public class TranferenciaEntreContas {
    public void transfere(Conta origem, Conta destino, double valor) {
        if (valor <= 0) {
            throw new IllegalArgumentException("Valor deve ser maior que zero");
        }

        if (origem.getSaldo() < valor) {
            throw new RuntimeException("Saldo Insuficiente");
        }
    }
}
