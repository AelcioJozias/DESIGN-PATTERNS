package br.com.designpaterns.imposto;

import br.com.designpaterns.orcamento.Orcamento;

import java.math.BigDecimal;

public interface Imposto {
    BigDecimal calcularImposto(Orcamento orcamento);
}
