package pagamento;

public class PagamentoPix extends Pagamento {

    @Override
    public boolean processarPagamento(double valor) {
        System.out.println("Pagamento via PIX no valor de R$ " + valor);
        return valor > 0;
    }
}
