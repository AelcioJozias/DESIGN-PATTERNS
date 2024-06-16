package br.com.designpaterns.orcamento.situacao;

import java.math.BigDecimal;

import br.com.designpaterns.orcamento.Orcamento;

public abstract class SituacaoOrcamento {

    public BigDecimal calcularValorDescontoExtra(Orcamento orcamento) {
        throw new DomainException("Não é possível aplicar um descontro extra");
    }
    
    public void aprovar(Orcamento orcamento) {
        throw new DomainException("Orçamento não pode ser aprovado");
    }

    public void reprovar(Orcamento orcamento) {
        throw new DomainException("Orçamento não pode ser reprovado");
    }

    public void finalizar(Orcamento orcamento) {
        throw new DomainException("Orçamento não pode ser finalizado");
    }
    
}
