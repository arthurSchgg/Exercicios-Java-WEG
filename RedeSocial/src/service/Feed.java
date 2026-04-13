package service;

import model.RedeSocial;
import model.Instagram;
import model.Facebook;
import view.Atendente;

public class Feed {
    Instagram instagram = new Instagram();
    Facebook facebook = new Facebook();

    public void gerenciarFeed(int opcao, Atendente atendente){
        switch (opcao){
            case 1 -> {
                instagram.Postar("Post do Vinicius JR");
            }
            case 2 -> {
                facebook.Postar("Post da vovó");
            }
            case 0 -> {
                atendente.mensagemEncerramento();
            }
            default -> {
                atendente.mensagemErro();
            }

        }

    }
}
