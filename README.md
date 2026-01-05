# Sistema de Gestão de Pedidos

## Objetivo

O Sistema de Gestão de Pedidos tem como objetivo simular o processo de criação, cálculo e pagamento de pedidos, aplicando corretamente os conceitos de POO.

### Funções do sistema

- cadastrar clientes
- criar pedidos com vários itens
- calcular o valor total do pedido
- processar pagamentos com diferentes métodos

### Divisão do projeto

- model → classes de domínio (dados e regras de negócio)
- pagamento → regras de pagamento
- service → coordenação das operações
- main → ponto de entrada do sistema

### Conceitos aplicados

| Conceito              | Aplicação no Projeto             |
| --------------------- | -------------------------------- |
| Classe                | Cliente, Pedido, ItemPedido      |
| Encapsulamento        | Atributos privados               |
| Abstração             | Classe Pagamento                 |
| Herança               | PagamentoPix, PagamentoCartao, PagamentoBoleto     |
| Polimorfismo          | Uso do tipo Pagamento            |
| Interface             | (pode ser adicionada facilmente) |
| Tratamento de exceção | try/catch no pagamento           |
