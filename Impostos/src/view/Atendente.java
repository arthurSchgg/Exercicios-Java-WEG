package view;

import java.util.Scanner;

public class Atendente {
    Scanner sc = new Scanner(System.in);

    public int Menu(){
        System.out.println("+=====================================+");
        System.out.println("|         CENTRAL DE IMPOSTOS         |");
        System.out.println("+=====================================+");
        System.out.println("|[1] Produto para simular os impostos |");
        System.out.println("|[2] Impostos                         |");
        System.out.println("|[0] Sair                             |");
        System.out.println("+=====================================+");
        System.out.print("Escolha uma opção: ");
        int op = sc.nextInt();
        sc.nextLine();
        return op;
    }

    public String nomeProduto(){
        System.out.print("Escreva o nome do produto: ");
        return sc.nextLine();
    }

    public double valorProduto(){
        System.out.print("Escreva o valor do produto: R$");
        return sc.nextDouble();
    }

    public int subMenuImpostos(){
        System.out.println("Escolha um imposto: ");
        System.out.println("[1] ICMS");
        System.out.println("[2] IPI");
        System.out.print("Escolha uma opção: ");
        return sc.nextInt();
    }

    public void mensagemSaida(){
        System.out.println("Saindo...");
    }

    public void mensagemErro(){
        System.out.println("Opção incorreta!");
    }

    public void valorFinalICMS(double valor){
        System.out.printf("O valor final do produto com o ICMS é: R$ %.2f\n", valor);
    }

    public void valorFinalIPI(double valor){
        System.out.printf("O valor final do produto com o IPI é: R$ %.2f\n", valor);
    }


}
