Estudo de Designs patterns ALURA - Chain of Responsibility

Quando temos uma determinada regra/processo que tem uma dependência entre objetos em hierarquia ou sequência, utilizamos o pattern de modo a encadear o processamento entre vários objetos, onde cada um recebe a solicitação, trata, e se necessário envia a um novo objeto para continuar o processamento

Utilizamos quando vemos que mais de um objeto pode tratar uma solicitação e o objeto que a tratará não é conhecido inicialmente. O objeto que trata a solicitação deve ser escolhido automaticamente

Diferença para o Strategy : No chain você não sabe quem vai atender a solicitação, escolher quem vai executar não é algo "fácil". Diferentemente do strategy onde voce ja instancia quem precisa e manda bala.


