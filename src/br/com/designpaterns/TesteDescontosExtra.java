package br.com.designpaterns;

import java.math.BigDecimal;

import br.com.designpaterns.orcamento.Orcamento;

public class TesteDescontosExtra {

    public static void main(String[] args) {
        Orcamento orcamento = new Orcamento(new BigDecimal(500), 4);
        // Given_UmOrcamentoComStatusFinalizado_When_AplicarDesconto_Should_LancarUmaExcecao(orcamento);
        System.out.println("Status antes: " + orcamento.getSituacaoOrcamento().getClass().getSimpleName());
        System.out.println("Valor do orçamento antes: " + orcamento.getValor());
        orcamento.aplicarDescontoExtra();
        System.out.println("Valor do orçamento antes: " + orcamento.getValor());
        orcamento.aprovar();
        System.out.println("Status depois: " + orcamento.getSituacaoOrcamento().getClass().getSimpleName());

    }
    

    public static void Given_UmOrcamentoComStatusFinalizado_When_AplicarDesconto_Should_LancarUmaExcecao(final Orcamento orcamento) {
        orcamento.reprovar();
        orcamento.aplicarDescontoExtra();
    }

    
}
