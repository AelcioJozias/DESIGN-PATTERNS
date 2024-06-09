import br.com.designpaterns.descontos.CalculadoraDeDescontos;
import br.com.designpaterns.imposto.CalculadoraDeImposto;
import br.com.designpaterns.imposto.ICMS;
import br.com.designpaterns.imposto.ISS;
import br.com.designpaterns.orcamento.Orcamento;

import java.math.BigDecimal;

public class TestesDescontos {
    public static void main(String[] args) {
        var orcamento1 = new Orcamento(new BigDecimal("100"), 6);
        var orcamento2 = new Orcamento(new BigDecimal("1000"), 1);
        var calculadora = new CalculadoraDeDescontos();
        System.out.println("descontos orçamento 1: " + calculadora.calcularDescontos(orcamento1));
        System.out.println("descontos orçamento 2: " + calculadora.calcularDescontos(orcamento2));
    }
}