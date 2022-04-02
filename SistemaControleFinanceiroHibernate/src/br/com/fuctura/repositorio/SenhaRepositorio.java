package br.com.fuctura.repositorio;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import br.com.fuctura.entidades.Senha;
import br.com.fuctura.util.BancoUtil;

public class SenhaRepositorio {
	
	public void salvar(Senha senha) {
		EntityManagerFactory fabrica = BancoUtil.getFabrica();
		EntityManager em = fabrica.createEntityManager();
		EntityTransaction transacao = em.getTransaction();
		transacao.begin();
		em.persist(senha);
		transacao.commit();
		em.close();
	}
}
