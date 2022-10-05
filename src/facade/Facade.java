package facade;

import java.util.Date;

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

    public String criarProduto(String nome, String fabricante, double preco) {
        return produtoService.criarProduto(nome, fabricante, preco);
    }

    public String criarLote(Produto p, int quantidade, Date dataVal) {
        return loteService.criarLote(p, quantidade, dataVal);
    }

    public void listarProdutos() {
        produtoService.listarProdutos();
    }

    public void listarLotes() {
        loteService.listarLotes();
    }

}
