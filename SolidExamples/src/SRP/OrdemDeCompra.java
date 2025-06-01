package SRP;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/*
 * As CLASSES estão num único arquivo para fins didáticos,
 * mas no caso real devem cada uma estar em um arquivo
 * separado
 */

/**
 * CLASSE OrdemDeCompra
 */
public class OrdemDeCompra {

    private List<Produto> produtos = new ArrayList<>();

    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
    }

    public void removerProduto(Produto produto) {
        produtos.remove(produto);
    }

    public BigDecimal calcularTotal() {
        return produtos.stream()
                .map(Produto::getValor)
                .reduce(BigDecimal.ZERO, BigDecimal::add);
    }
}

/**
 * CLASSE OrdemDeCompraRepository
 */
class OrdemDeCompraRepository {
    public List<OrdemDeCompra> buscarOrdensDeCompra() {
        // retorna a lista de ordens de compra da base de dados
        return new ArrayList<>();
    }

    public void salvarOrdemCompra() {
        // salva lista de produtos na base de dados
    }

    public void alterarOrdemCompra() {
        // alterar a ordem de compra na base de dados
    }
}

/**
 * CLASSE OrdemDeCompraMail
 */
class OrdemDeCompraMail {
    public void enviarEmail(OrdemDeCompra ordemDeCompra, String email) {
        // envia email da ordem de compra
    }
}

/**
 * CLASSE OrdemDeCompraPrint
 */
class OrdemDeCompraPrint {
    public void imprimirOrdemDeCompra(OrdemDeCompra ordemDeCompra) {
        // imprime a ordem de compra
    }
}
