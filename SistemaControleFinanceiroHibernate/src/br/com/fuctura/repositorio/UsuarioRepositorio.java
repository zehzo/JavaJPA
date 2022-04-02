package br.com.fuctura.repositorio;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import br.com.fuctura.entidades.Usuario;
import br.com.fuctura.util.BancoUtil;

public class UsuarioRepositorio {
	
	public void salvar(Usuario usuario) {
		EntityManagerFactory fabrica = BancoUtil.getFabrica();
		EntityManager em = fabrica.createEntityManager();
		EntityTransaction transacao = em.getTransaction();
		transacao.begin();
		em.persist(usuario);
		transacao.commit();
		em.close();
	}
	
	public Usuario buscar(Usuario usuario) {
		EntityManagerFactory fabrica = BancoUtil.getFabrica();
		EntityManager em = fabrica.createEntityManager();
		Usuario usu = em.find(Usuario.class, usuario.getCodigo());
		em.close();
		return usu;
	}
	
	public List<Usuario> listarTodos(){
		EntityManagerFactory fabrica = BancoUtil.getFabrica();
		EntityManager em = fabrica.createEntityManager();
		Query consulta = em.createQuery("select u from Usuario u");
		List<Usuario> lista = consulta.getResultList();
		em.close();
		return lista;
	}
	
	public List<Usuario> listarTodos(int primeiro, int maxResultados){
		EntityManagerFactory fabrica = BancoUtil.getFabrica();
		EntityManager em = fabrica.createEntityManager();
		Query consulta = em.createQuery("select u from Usuario u");
		
		consulta.setFirstResult(primeiro);
		consulta.setMaxResults(maxResultados);
		
		List<Usuario> lista = consulta.getResultList();
		em.close();
		return lista;
	}
	
	public List<Usuario> buscarPorIdade(int idade){
		EntityManagerFactory fabrica = BancoUtil.getFabrica();
		EntityManager em = fabrica.createEntityManager();
		TypedQuery<Usuario> consulta = em.createNamedQuery("Usuario.buscarPorIdade", Usuario.class);
		List<Usuario> lista = consulta.getResultList();
		em.close();
		return lista;
	}
}
