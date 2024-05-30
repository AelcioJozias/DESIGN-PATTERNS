package br.com.designpaterns.orcamento;

import java.math.BigDecimal;

public class Orcamento {

    public Orcamento(BigDecimal valor) {
        this.valor = valor;
    }

    private BigDecimal valor;

    public BigDecimal getValor() {
        return valor;
    }
}