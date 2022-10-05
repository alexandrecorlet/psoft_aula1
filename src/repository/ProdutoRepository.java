package repository;

import java.util.Map;
import java.util.HashMap;
import java.util.Collection;

import data.Produto;

public class ProdutoRepository {

    private Map<String, Produto> produtos;

    public ProdutoRepository() {
        produtos = new HashMap<>();
    }

    public String add(Produto p) {
        String id = p.getId();
        produtos.put(id, p);
        return id;
    }

    public boolean containsProduto(Produto p) {
        return produtos.containsValue(p);
    }

    public Collection<Produto> getAll() {
        return produtos.values();
    }

}
