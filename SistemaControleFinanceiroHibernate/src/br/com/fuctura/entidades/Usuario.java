package br.com.fuctura.entidades;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@NamedQueries({
	@NamedQuery(name = "Usuario.buscarPorIdade", query="select u from Usuario u where u.idade = :idade"),
	@NamedQuery(name = "Usuario.buscarPorNome", query="select u from Usuario u where LOWER(u.nome) like LOWER(:nome)")
})
@Entity
@Table(name = "usuario")	
public class Usuario {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long codigo;
	private String nome;
	private String email;
	private int idade ;
	@OneToOne
	private Senha senha;
	
	public Usuario(String nome, String email, int idade, Senha senha) {
		super();
		this.nome = nome;
		this.email = email;
		this.idade = idade;
		this.senha = senha;
	}
	

	public Usuario() {
	}


	public Usuario(long codigo) {
		super();
		this.codigo = codigo;
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
				+ senha.getValor() + "]";
	}
	
	

}
