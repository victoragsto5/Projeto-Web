package br.edu.ctup.DAO;

import java.util.List;

import br.edu.ctup.bean.Livro;

public interface LivroDAO {
	void cadastrarLivro (Livro livro);
	List<Livro> listartodosLivros ();
	List<Livro> buscanomeLivro (String nome_livro);
	Livro buscarCodigo(int code);
}
