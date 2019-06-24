package br.edu.ctup.controller;

import java.io.IOException;
import java.util.List;

import javax.faces.context.FacesContext;

import br.edu.ctup.DAOimpl.ClienteDAOimpl;
import br.edu.ctup.bean.Cliente;

public class ClienteController {
	private Cliente cliente;
	private List<Cliente> listaClientes;
	ClienteDAOimpl clienteDAOimpl = new ClienteDAOimpl();

	public ClienteController(){
		cliente = new Cliente();
	}

	public void salvar() throws IOException {
		clienteDAOimpl.salvar(cliente);
		cliente = new Cliente();

		//FacesContext.getCurrentInstance().getExternalContext().redirect("Login.xhtml");
	}

	public void listarTodos() {
		ClienteDAOimpl clienteDAOimpl = new ClienteDAOimpl();
		listaClientes = clienteDAOimpl.listarTodos();
	}

	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public List<Cliente> getListaClientes() {
		//verificar console
		return clienteDAOimpl.listarTodos();
	}

	public void excluir() {// pega o valor do id que esta atrelado ao link ao
		
		Integer id = Integer.parseInt(
				(String) FacesContext.getCurrentInstance().getExternalContext().getRequestParameterMap().get("codigo"));
		clienteDAOimpl.excluir(id);
		cliente = new Cliente();
	}
	public void editar() {// pega o valor do id que esta atrelado ao link ao
		Integer id = Integer.parseInt(
				(String) FacesContext.getCurrentInstance().getExternalContext().getRequestParameterMap().get("codigo"));
		cliente = clienteDAOimpl.selecionarPorId(id);
	}

	public void setListaClientes(List<Cliente> listaClientes) {
		this.listaClientes = listaClientes;
	}


}