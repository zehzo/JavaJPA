package br.com.fuctura.entidades;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "usuario")
public class Usuario {
	@Id
	private long codigo;
	private String nome;
	private String email;
	private int idade ;
	@Transient
	private Senha senha;


	public Usuario(long codigo, String nome, String email, int idade, Senha senha) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.email = email;
		this.idade = idade;
		this.senha = senha;
	}
	
	public long getCodigo() {
		return codigo;
	}

	public void setCodigo(long codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public Senha getSenha() {
		return senha;
	}

	public void setSenha(Senha senha) {
		this.senha = senha;
	}

	@Override
	public String toString() {
		return "Usuario [codigo=" + codigo + ", nome=" + nome + ", email=" + email + ", idade=" + idade + ", senha="
				+ senha + "]";
	}
	
	

}
