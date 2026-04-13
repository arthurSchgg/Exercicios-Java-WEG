package service.pagamento;

public class PagamentoCartao extends PagamentoMulta{
	
	@Override
	public double processarPagamento(double valor) {
		return valor * 1.05;
	}

}
