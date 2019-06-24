package br.edu.ctup.controller;

import java.io.IOException;
import java.util.List;

import br.edu.ctup.DAOimpl.LivroDAOimpl;
import br.edu.ctup.bean.Livro;

public class LivroController {
	private Livro livro;
	private List<Livro> listaLivros;
	LivroDAOimpl livroDAOimpl = new LivroDAOimpl();

	public LivroController(){
		livro = new Livro();
	}

	public void salvar() throws IOException {
		livroDAOimpl.salvar(livro);
		livro = new Livro();

		//FacesContext.getCurrentInstance().getExternalContext().redirect("Login.xhtml");
	}

	public void listarTodos() {
		LivroDAOimpl livroDAOimpl = new LivroDAOimpl();
		listaLivros = livroDAOimpl.listarTodos();
	}

	public Livro getLivro() {
		return livro;
	}
	public void setLivro(Livro livro) {
		this.livro = livro;
	}
	public List<Livro> getListaLivros() {
		//verificar console
		return livroDAOimpl.listarTodos();
	}

	public void excluir() {// pega o valor do id que esta atrelado ao link ao
		
		Integer id = Integer.parseInt(
				(String) FacesContext.getCurrentInstance().getExternalContext().getRequestParameterMap().get("codigo"));
		livroDAOimpl.excluir(id);
		livro = new Livro();
	}
	public void editar() {// pega o valor do id que esta atrelado ao link ao
		Integer id = Integer.parseInt(
				(String) FacesContext.getCurrentInstance().getExternalContext().getRequestParameterMap().get("codigo"));
		livro = livroDAOimpl.selecionarPorId(id);
	}

	public void setListaClientes(List<Livro> listaLivros) {
		this.listaLivros = listaLivros;
	}


}