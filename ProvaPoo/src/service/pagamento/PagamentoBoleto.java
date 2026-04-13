package service.pagamento;

public class PagamentoBoleto extends PagamentoMulta{

	@Override
	public double processarPagamento(double valor) {
		return valor * 1.03;
	}
}
