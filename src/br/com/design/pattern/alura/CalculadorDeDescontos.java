package br.com.design.pattern.alura;

import br.com.design.pattern.alura.descontos.Desconto;
import br.com.design.pattern.alura.descontos.DescontoPorMaisDeCincoItens;
import br.com.design.pattern.alura.descontos.DescontoPorMaisDeQuinhentosReais;
import br.com.design.pattern.alura.descontos.SemDesconto;

public class CalculadorDeDescontos {

    public double calcula(Orcamento orcamento) {
        Desconto d1 = new DescontoPorMaisDeCincoItens();
        Desconto d2 = new DescontoPorMaisDeQuinhentosReais();
        Desconto d3 = new SemDesconto();

        d1.setProximo(d2);
        d2.setProximo(d3);

        return d1.desconta(orcamento);
    }

}