package service.usuario;

import model.usuario.NivelAcesso.nivelAcesso;

public class GerenciadorUsuario {

	public nivelAcesso lista(int opcao) {
		nivelAcesso[] niveis = nivelAcesso.values();

		if (opcao > 0 && opcao <= niveis.length) {
			return niveis[opcao - 1];
		} else {
			return null;
		}
	}
	

}
