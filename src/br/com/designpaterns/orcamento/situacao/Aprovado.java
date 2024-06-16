package br.com.designpaterns.orcamento.situacao;

import java.math.BigDecimal;

import br.com.designpaterns.orcamento.Orcamento;

public class Aprovado extends SituacaoOrcamento {

    @Override
    public BigDecimal calcularValorDescontoExtra(Orcamento orcamento) {
        return orcamento.getValor().multiply(new BigDecimal("0.02"));
    }
}
