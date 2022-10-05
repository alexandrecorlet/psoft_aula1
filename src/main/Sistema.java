package main;

import data.Produto;
import data.Lote;
import facade.Facade;

import java.util.Date;

public class Sistema {

    public static void main(String[] args) {
        Facade fac = new Facade();

        // Produto
        Produto dell = fac.criarProduto("Dell XPS", "Dell", 5000.00d);
        Produto macPro = fac.criarProduto("MacBook Pro 2020", "Apple", 20000.00d);
        for (Produto p: fac.listarProdutos())
            System.out.println(p.toString());

        System.out.println();

        // Lote
        fac.criarLote(dell, 10000, null);
        fac.criarLote(macPro, 100, null);
        for (Lote l : fac.listarLotes())
            System.out.println(l.toString() + '\n');
    }

}
