package services;

import java.util.Collection;
import java.util.List;
import java.util.ArrayList;

import data.Produto;
import repository.ProdutoRepository;

public class ProdutoService {

    private ProdutoRepository prodRepo;

    public ProdutoService() {
        prodRepo = new ProdutoRepository();
    }

    public Produto criarProduto(String nome, String fabricante, double preco) {
        Produto p = new Produto(nome, fabricante, preco);
        prodRepo.add(p);
        return p;
    }

    public Collection<Produto> listarProdutos() {
        return prodRepo.getAll();
    }
}
