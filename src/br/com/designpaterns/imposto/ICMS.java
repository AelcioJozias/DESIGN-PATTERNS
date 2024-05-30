package br.com.designpaterns.imposto;

import br.com.designpaterns.orcamento.Orcamento;

import java.math.BigDecimal;

public class ICMS implements Imposto {
    @Override
    public BigDecimal calcularImposto(Orcamento orcamento) {
        return orcamento.getValor().multiply(new BigDecimal("0.06"));
    }
}
