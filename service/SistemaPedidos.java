package service;

import model.Pedido;
import pagamento.Pagamento;

public class SistemaPedidos {

    public void finalizarPedido(Pedido pedido, Pagamento pagamento) {

        double total = pedido.calcularTotal();

        try {
            if (pagamento.processarPagamento(total)) {
                System.out.println("Pedido pago com sucesso!");
            } else {
                throw new IllegalArgumentException("Pagamento recusado.");
            }
        } catch (Exception e) {
            System.out.println("Erro ao processar pagamento: " + e.getMessage());
        }
    }
}
