package service;


import model.Pedido;
import pagamento.Pagamento;
import model.ItemPedido;

public class SistemaPedidos {

    public void finalizarPedido(Pedido pedido, Pagamento pagamento) {

        double total = pedido.calcularTotal();

        try {
            if (pagamento.processarPagamento(total)) {
                System.out.println("\nPedido pago com sucesso!\n");

                for (ItemPedido item : pedido.getItens()) {
                    System.out.println("Cliente: " + pedido.getCliente().getNome());
                    System.out.println("Produto: " + item.getDescricao());
                    System.out.println("Preço: R$ " + item.getPreco());
                    System.out.println("Quantidade: " + item.getQuantidade());
                    System.out.println("Subtotal: R$ " + item.getSubtotal());
                    System.out.println("==================================\n");
                }

                System.out.println(pagamento.processarPagamento(total));

            } else {
                throw new IllegalArgumentException("Pagamento recusado.");
            }
        } catch (Exception e) {
            System.out.println("Erro ao processar pagamento: " + e.getMessage());
        }
    }
}
