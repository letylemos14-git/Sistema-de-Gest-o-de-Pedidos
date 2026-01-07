package pagamento;

public class PagamentoCartao extends Pagamento {

    @Override
    public boolean processarPagamento(double valor) {
        System.out.println("Pagamento via Cartão no valor de R$ " + valor);
        return valor > 0;
    }
}