package DIP;

import SRP.Produto;

import java.util.ArrayList;
import java.util.List;

public class ProdutoRepository {

    private DBConnection dbConnection;

    public ProdutoRepository(DBConnection dbConnection) {
        this.dbConnection = dbConnection;
    }

    public List<Produto> buscarProdutos() {
        // retorna a lista de produto da base de dados
        return new ArrayList<>();
    }

    public void salvarProduto(Produto produto) {
        // salva lista de produtos na base de dados
    }
}
