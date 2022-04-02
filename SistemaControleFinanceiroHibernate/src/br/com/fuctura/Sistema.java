package br.com.fuctura;

import br.com.fuctura.entidades.Senha;
import br.com.fuctura.entidades.Usuario;
import br.com.fuctura.repositorio.SenhaRepositorio;
import br.com.fuctura.repositorio.UsuarioRepositorio;

public class Sistema {

	public static void main(String[] args) {
		SenhaRepositorio senhaRepo = new SenhaRepositorio();
		UsuarioRepositorio usuRepo = new UsuarioRepositorio();
		
		for (int i = 1; i <= 10; i++) {
			Senha senha = new Senha();
			senhaRepo.salvar(senha);
			
			Usuario usu = new Usuario("Usu " + i, "email" + i + "@gmail.com", 30 + i, senha);
			usuRepo.salvar(usu);
			
		}
		
		System.out.println("Usuário encontrado: " + usuRepo.buscar(new Usuario(6)));
		
		//Primeira pagina = 0
		for (Usuario usu2 : usuRepo.listarTodos(5, 5)) {
			System.out.println(usu2);
		}
	}
	
}
