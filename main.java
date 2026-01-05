import model.Cliente;
import model.ItemPedido;
import model.Pedido;
import pagamento.*;
import service.SistemaPedidos;

public class Main {

    public static void main(String[] args) {

        Cliente cliente = new Cliente("Laise Cavalcante", "laisesysprotec@gmail.com");

        Pedido pedido = new Pedido(cliente);
        pedido.adicionarItem(new ItemPedido("Notebook", 2679.00, 1));
        pedido.adicionarItem(new ItemPedido("Mouse", 146.00, 2));

        Pagamento pagamento = new PagamentoPix();

        SistemaPedidos sistema = new SistemaPedidos();
        sistema.finalizarPedido(pedido, pagamento);
    }
}
