package data;

import java.util.Date;

public class Lote {

    private Produto produto;

    private Date dataFab;

    private Date dataVal;

    private int quantidade;

    public Lote(Produto produto, int quantidade) {
        this.produto = produto;
        this.quantidade = quantidade;
    }

}
