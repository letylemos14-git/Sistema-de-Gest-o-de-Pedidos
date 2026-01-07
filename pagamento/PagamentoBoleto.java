package pagamento;

public class PagamentoBoleto extends Pagamento {

    @Override
    public boolean processarPagamento(double valor) {
        System.out.println("Pagamento via Boleto no valor de R$ " + valor);
        return valor > 0;
    }
}