package br.com.design.pattern.alura.descontos;

import br.com.design.pattern.alura.Orcamento;

public interface Desconto {
        double desconta(Orcamento orcamento);
        void setProximo(Desconto proximo);
      }