package data;

import java.util.Date;
import java.util.UUID;
import java.util.Objects;

public class Lote {

    private Produto produto;

    private Date dataVal;

    private int quantidade;

    private final String id;

    public Lote(Produto produto, int quantidade, Date dataVal) {
        this.produto = produto;
        this.quantidade = quantidade;
        this.dataVal = dataVal;
        this.id = UUID.randomUUID().toString();
    }

    public Produto getProduto() {
        return produto;
    }

    public Date getDataVal() {
        return dataVal;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public String getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (!(o instanceof Lote))
            return false;
        Lote oLote = (Lote) o;
        return id.equals(oLote.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    public String toString() {

        return "ID LOTE: " + id + '\n'
                + "Produto: " + produto.toString()
                + "Validade: " + dataVal.toString() + '\n'
                + "quantidade: " + quantidade;

    }

}
