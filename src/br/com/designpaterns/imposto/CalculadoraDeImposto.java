package br.com.designpaterns.imposto;

import br.com.designpaterns.orcamento.Orcamento;

import java.math.BigDecimal;

public class CalculadoraDeImposto {

    public BigDecimal calcular(Orcamento orcamento, Imposto imposto) {
        return imposto.calcularImposto(orcamento);
    }

}
