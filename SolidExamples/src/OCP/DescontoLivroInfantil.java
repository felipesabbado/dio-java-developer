package OCP;

public class DescontoLivroInfantil implements DescontoLivro {

    @Override
    public double valorDesconto() {
        return 0.3;
    }
}
