package br.com.fuctura.entidades;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "senha")
public class Senha {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long codigo;
	private String valor;

	
	public Senha() {
		super();
	}

	public Senha(String valor) {
		this.valor = valor;
	}

	public long getCodigo() {
		return codigo;
	}

	public void setCodigo(long codigo) {
		this.codigo = codigo;
	}

	public String getValor() {
		return valor;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}

}
