package data;

import java.util.Date;

public class Produto {

    private String nome;

    private double preco;

    private String fabricante;

    private Date dataFab;

    private Date dataVal;

    public Produto(String nome, String fabricante, double preco) {
        this.nome = nome;
        this.fabricante = fabricante;
        this.preco = preco;
    }

}
