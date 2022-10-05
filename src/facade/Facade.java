package facade;

import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.ArrayList;

import data.Produto;
import data.Lote;
import services.LoteService;
import services.ProdutoService;

public class Facade {

    private ProdutoService produtoService;
    private LoteService loteService;

    public Facade() {
        this.produtoService = new ProdutoService();
        this.loteService = new LoteService();
    }

    public Produto criarProduto(String nome, String fabricante, double preco) {
        return produtoService.criarProduto(nome, fabricante, preco);
    }

    public Lote criarLote(Produto p, int quantidade, Date dataVal) {
        return loteService.criarLote(p, quantidade, dataVal);
    }

    public Collection<Produto> listarProdutos() {
        return produtoService.listarProdutos();
    }

    public Collection<Lote> listarLotes() {
        return loteService.listarLotes();
    }

}
