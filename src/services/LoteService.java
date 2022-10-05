package services;

import java.util.Collection;
import java.util.List;

import data.Lote;
import data.Produto;
import repository.LoteRepository;
import repository.ProdutoRepository;


import java.util.Date;

public class LoteService {

    private LoteRepository loteRepo;
    private ProdutoRepository produtoRepo;

    public LoteService() {
        this.loteRepo = new LoteRepository();
        this.produtoRepo = new ProdutoRepository();
    }

    public Lote criarLote(Produto p, int quantidade, Date dataVal) {
        Lote lote = new Lote(p, quantidade, dataVal);
        loteRepo.add(lote);
        return lote;
    }

    public Collection<Lote> listarLotes() {
        return loteRepo.getAll();
    }
}
