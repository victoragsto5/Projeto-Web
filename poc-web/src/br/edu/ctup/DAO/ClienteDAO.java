package br.edu.ctup.DAO;

import java.util.List;

import br.edu.ctup.bean.Cliente;

public interface ClienteDAO {
	void cadastrarCliente (Cliente cliente);
	List<Cliente> listartodosClientes ();
	List<Cliente> buscanomeCliente (String nome);
	Cliente autenticacao (String login, String senha);
	void salvar(Cliente cliente);
	List<Cliente> listarTodos();
	void excluir(Integer id);
	Cliente selecionarPorId(Integer id);
	Cliente autenticar(Cliente cliente);
}