package javier.casal;

import java.io.Serializable;

public class ProductoTransient implements Serializable {

    String nome;
    transient int num1;
    double num2;

    public ProductoTransient() {
    }

    public ProductoTransient(String nome, int num1, double num2) {
        this.nome = nome;
        this.num1 = num1;
        this.num2 = num2;
    }
}