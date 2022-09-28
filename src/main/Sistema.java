package main;

import data.Produto;
import data.Lote;

public class Sistema {

    public static void main(String[] args) {
        Produto p = new Produto("Bike", "Caloi", 1000.00);
        Lote lote = new Lote(p, 1000);
    }

}
