package br.com.design.pattern.alura.descontos;

import br.com.design.pattern.alura.Orcamento;

public class SemDesconto implements Desconto {

          public double desconta(Orcamento orcamento) {
              return 0;
          }

          public void setProximo(Desconto desconto) {
              // nao tem!
          }
      }