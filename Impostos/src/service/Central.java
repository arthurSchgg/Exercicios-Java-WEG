package service;

import model.ICMS;
import model.IPI;
import model.Produto;
import view.Atendente;

import java.util.ArrayList;
import java.util.List;

public class Central {
    private List<Produto> ListaProdutos;

    public Central(){
        ListaProdutos = new ArrayList<>();
    }

    public void gerenciarEstoque(int opcao, Atendente atendente){
        switch (opcao){
            case 1 -> {
                String nome = atendente.nomeProduto();
                double valor = atendente.valorProduto();

                Produto produto = new Produto(nome, valor);
                ListaProdutos.add(produto);
            }
            case 2 -> {
                opcao = atendente.subMenuImpostos();

                if(!ListaProdutos.isEmpty()){
                    double valorBase = ListaProdutos.get(ListaProdutos.size() -1).getValor();

                    if(opcao == 1){
                        ICMS icms = new ICMS();
                        double imposto = icms.calcular(valorBase);
                        atendente.valorFinalICMS(valorBase + imposto);
                    } else if(opcao == 2){
                        IPI ipi = new IPI();
                        double imposto = ipi.calcular(valorBase);
                        atendente.valorFinalIPI(valorBase + imposto);
                    }
                }
            }
            case 0 -> {
                atendente.mensagemSaida();
            }
        }
    }
}
