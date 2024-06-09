package br.com.designpaterns.descontos;

import br.com.designpaterns.orcamento.Orcamento;

import java.math.BigDecimal;

public class SemDesconto extends Desconto {

    public SemDesconto() {
        super(null);
    }

    @Override
    public BigDecimal efetuarCalculo(Orcamento orcamento) {
        return new BigDecimal("0");
    }

    @Override
    public boolean deveAplicarDesconto(Orcamento orcamento) {
        return true;
    }
}
