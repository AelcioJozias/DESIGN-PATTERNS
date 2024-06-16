package br.com.designpaterns.orcamento;

import java.math.BigDecimal;

import br.com.designpaterns.orcamento.situacao.EmAnalise;
import br.com.designpaterns.orcamento.situacao.SituacaoOrcamento;

public class Orcamento {

    public Orcamento(BigDecimal valor, int itens) {
        this.valor = valor;
        this.itens = itens;
        this.situacaoOrcamento = new EmAnalise();
    }

    private BigDecimal valor;
    private int itens;
    private SituacaoOrcamento situacaoOrcamento;

    public int getItens() {
        return itens;
    }

    public void setItens(int itens) {
        this.itens = itens;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public SituacaoOrcamento getSituacaoOrcamento() {
        return situacaoOrcamento;
    }

    public void setSituacaoOrcamento(SituacaoOrcamento situacaoOrcamento) {
        this.situacaoOrcamento = situacaoOrcamento;
    }

    public void aplicarDescontoExtra() {
        this.valor = this.getValor().subtract(situacaoOrcamento.calcularValorDescontoExtra(this));
    }

    public void aprovar() {
        this.situacaoOrcamento.aprovar(this);
    }

    public void reprovar() {
        this.situacaoOrcamento.reprovar(this);
    }
    
}
