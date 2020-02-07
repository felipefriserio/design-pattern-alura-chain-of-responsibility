package br.com.design.pattern.alura;

public class TestaDescontos {
    public static void main(String[] args) {

        CalculadorDeDescontos calculador = new CalculadorDeDescontos();

        // sem desconto
        Orcamento orcamento = new Orcamento(500.0);
        orcamento.adicionaItem(new Item("CANETA", 250.0));
        orcamento.adicionaItem(new Item("LAPIS", 250.0));

        double desconto = calculador.calcula(orcamento);
        System.out.println("1- sem desconto = " + desconto);

        // desconto mais de 5 itens
        Orcamento orcamentoMaisDeCincoItens = new Orcamento(500.0);
        orcamentoMaisDeCincoItens.adicionaItem(new Item("CANETA", 250.0));
        orcamentoMaisDeCincoItens.adicionaItem(new Item("LAPIS", 250.0));
        orcamentoMaisDeCincoItens.adicionaItem(new Item("CANETA", 250.0));

        orcamentoMaisDeCincoItens.adicionaItem(new Item("LAPIS", 250.0));
        orcamentoMaisDeCincoItens.adicionaItem(new Item("CANETA", 250.0));
        orcamentoMaisDeCincoItens.adicionaItem(new Item("CANETA", 250.0));

        double descontoCincoItens = calculador.calcula(orcamentoMaisDeCincoItens);
        System.out.println("2- mais de cinco itens = " + descontoCincoItens);

        // desconto mais de 500 reais
        Orcamento orcamentoMaisDeQuinhentosReais = new Orcamento(600.0);
        orcamentoMaisDeQuinhentosReais.adicionaItem(new Item("CANETA", 600.0));

        double descontoMaisdeQuinhentos = calculador.calcula(orcamentoMaisDeQuinhentosReais);
        System.out.println("3- Orcamento mais de quinhentos reais = " + descontoMaisdeQuinhentos);


    }
}
