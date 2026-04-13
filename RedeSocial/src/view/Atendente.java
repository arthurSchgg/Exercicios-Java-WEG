package view;

import java.util.Scanner;

public class Atendente {
    Scanner sc = new Scanner(System.in);

    public int Menu() {
        System.out.println("+==================================+");
        System.out.println("|      FEED DAS REDES SOCIAIS      |");
        System.out.println("+==================================+");
        System.out.println("|[1] Intagram                      |");
        System.out.println("|[2] Facebook                      |");
        System.out.println("|[0] Sair                          |");
        System.out.println("+==================================+");
        System.out.print("Escolha uma rede social para postar: ");
        int op = sc.nextInt();
        sc.nextLine();
        return op;
    }

    public void mensagemEncerramento(){
        System.out.println("Saindo...");
    }

    public void mensagemErro(){
        System.out.println("Erro");
    }
}
