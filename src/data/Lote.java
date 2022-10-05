package data;

import java.util.Date;

public class Lote {

    private Produto produto;

    private Date dataVal;

    private int quantidade;

    public Lote(Produto produto, int quantidade, Date dataVal) {
        this.produto = produto;
        this.quantidade = quantidade;
        this.dataVal = dataVal;
    }

}
