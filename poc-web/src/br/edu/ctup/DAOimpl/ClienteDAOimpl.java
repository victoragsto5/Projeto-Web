package br.edu.ctup.DAOimpl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.edu.ctup.DAO.ClienteDAO;
import br.edu.ctup.DAO.DAO;
import br.edu.ctup.bean.Cliente;

public class ClienteDAOimpl extends DAO implements ClienteDAO{
	Cliente cliente = new Cliente();
	@Override
	public void salvar(Cliente cliente) {
		EntityManager em = getEntityManager();
		try{
			if(cliente.getCode()==null){
				em.getTransaction().begin();
				em.persist(cliente);
				em.getTransaction().commit();	
			}else{
				em.getTransaction().begin();
				em.merge(cliente);
				em.getTransaction().commit();
			}
		}catch(Exception e){
			e.getStackTrace();
			em.getTransaction().rollback();
		}finally {
			em.close();
			
		}
		
	}

	@Override
	public void excluir(Integer codigo) {
		EntityManager em = getEntityManager();
		try{
			//inicia o processo de transacao
			em.getTransaction().begin();
			//faz a persistencia
			Cliente cliente = em.find(Cliente.class, codigo);
			em.remove(cliente);
			//manda bala para o BD
			em.getTransaction().commit();
		}catch (Exception e) {
			//se der algo de errado vem parar aqui, onde eh cancelado
			em.getTransaction().rollback();
		}
		
	}
	
	public Cliente selecionarPorId(Integer id) {
		 EntityManager em = getEntityManager();
		  //  if (id != null) {
		      cliente = getEntityManager().find(Cliente.class, id);
		  //  }
		    
		    return cliente;
	}

	@Override
	public List<Cliente> listarTodos() {
		EntityManager em = getEntityManager();
		Query q = em.createQuery("select object(c) from Cliente as c");
		return q.getResultList();
	}

	@Override
	public Cliente autenticar(Cliente cliente) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void cadastrarCliente(Cliente cliente) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Cliente> listartodosClientes() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Cliente> buscanomeCliente(String nome) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Cliente autenticacao(String login, String senha) {
		// TODO Auto-generated method stub
		return null;
	}

}
