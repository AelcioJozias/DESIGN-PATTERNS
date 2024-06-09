package br.com.designpaterns.orcamento;

import java.math.BigDecimal;

public class Orcamento {

    public Orcamento(BigDecimal valor, int itens) {
        this.valor = valor;
        this.itens = itens;
    }

    private BigDecimal valor;
    private int itens;

    public int getItens() {
        return itens;
    }

    public void setItens(int itens) {
        this.itens = itens;
    }

    public BigDecimal getValor() {
        return valor;
    }
}
