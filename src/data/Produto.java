package data;

import java.util.Objects;
import java.util.UUID;

public class Produto {

    private String nome;

    private double preco;

    private String fabricante;

    private final String id;

    public Produto(String nome, String fabricante, double preco) {
        this.nome = nome;
        this.fabricante = fabricante;
        this.preco = preco;
        this.id = UUID.randomUUID().toString();
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public String getId() {
        return id;
    }

    public String getFabricante() {
        return fabricante;
    }

    @Override
    public String toString() {

        return "Produto: " + nome + '\n'
                + "ID: " + id + '\n'
                + "Fabricante: " + fabricante + '\n'
                + "Preco: R$ " + String.format("%.2f", preco) + '\n';

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Produto produto = (Produto) o;
        return id.equals(produto.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}
