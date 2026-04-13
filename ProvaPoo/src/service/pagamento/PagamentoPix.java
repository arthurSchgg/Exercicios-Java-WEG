package service.pagamento;

public class PagamentoPix extends PagamentoMulta {
	
	@Override
	public double processarPagamento(double valor) {
		return valor * 1.01;
	}

}
