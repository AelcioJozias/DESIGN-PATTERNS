import br.com.designpaterns.imposto.CalculadoraDeImposto;
import br.com.designpaterns.imposto.ICMS;
import br.com.designpaterns.imposto.ISS;
import br.com.designpaterns.orcamento.Orcamento;

import java.math.BigDecimal;

public class TestesImpostos {
    public static void main(String[] args) {
        var orcamento = new Orcamento(new BigDecimal("100"));
        var calculadora = new CalculadoraDeImposto();
        System.out.println(calculadora.calcular(orcamento, new ISS()));
        System.out.println(calculadora.calcular(orcamento, new ICMS()));
    }
}