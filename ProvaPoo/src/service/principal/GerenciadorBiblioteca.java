package service.principal;

import java.util.ArrayList;
import java.util.List;
import view.FullView;
import model.livro.Livro;
import model.usuario.Bibliotecario;
import model.usuario.NivelAcesso.nivelAcesso;
import model.usuario.Usuario;
import view.InputView;
import view.OutputView;

public class GerenciadorBiblioteca {
	private List<Livro> listaLivros;
	private List<Usuario> listaUsuarios;
	private InputView mensagemEntrada;
	private OutputView mensagemSaida;
	private String email;
	private String senha;
	
	public GerenciadorBiblioteca() {
		listaLivros = new ArrayList<>();
		listaUsuarios = new ArrayList<>();
		mensagemEntrada = new InputView();
		mensagemSaida = new OutputView();
	}
	
	public void gerenciarBiblioteca(int opcao, FullView atendente) {
		switch(opcao) {
		case 1 -> {
			opcao = mensagemEntrada.subMenuCadastrar();
			
			if(opcao == 1) {
				String nome = mensagemEntrada.nomeUsuario();
				String CPF = mensagemEntrada.cpfUsuario();
				while(!CPF.matches("\\d{11}")) {
					mensagemSaida.cpfIncorreto();
					CPF = mensagemEntrada.cpfUsuario();
				}
				email = mensagemEntrada.emailUsuario();
				while(!email.contains("@")) {
					mensagemSaida.emailIncorreto();
					email = mensagemEntrada.emailUsuario();
				}
				senha = mensagemEntrada.senhaUsuario();
				while(!senha.matches(".{7,}")) {
					mensagemSaida.senhaCurtaDemais();
					senha = mensagemEntrada.senhaUsuario();
				}
				nivelAcesso nivelAcesso = mensagemEntrada.escolherNivelAcesso();
				
				Usuario cadastroUsuario = new Bibliotecario(nome, CPF, email, senha, nivelAcesso);
				listaUsuarios.add(cadastroUsuario);
			} else if(opcao == 2) {
				String emailLogin = mensagemEntrada.emailConfirmacao();
				if(emailLogin.equalsIgnoreCase(email)) {
				} else {
					while(!emailLogin.equalsIgnoreCase(email)) {
						mensagemSaida.emailIncorreto();
						emailLogin = mensagemEntrada.emailConfirmacao();
					}
				}
				String senhaLogin = mensagemEntrada.senhaConfirmacao();
				if(senhaLogin.equalsIgnoreCase(senha)) {
					mensagemSaida.loginConcluido();
				} else {
					while(!senhaLogin.equalsIgnoreCase(senha)) {
						mensagemSaida.senhaIncorreta();
						senhaLogin = mensagemEntrada.senhaConfirmacao();
					}
				}
			}
		}
		
		case 0 -> {
			mensagemSaida.encerrandoPrograma();
		}
		}
	}


}
