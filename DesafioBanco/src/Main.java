public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.setNome("Felipe");

        Conta corrente = new ContaCorrente(cliente);
        Conta poupanca = new ContaPoupanca(cliente);

        corrente.depositar(100);

        corrente.transferir(25, poupanca);

        corrente.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}
