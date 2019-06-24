package br.edu.ctup.DAOimpl;

import java.util.List;
import java.util.Scanner;

import br.edu.ctup.DAO.LivroDAO;
import br.edu.ctup.bean.Livro;

public class LivroDAOimpl implements LivroDAO {
	static Livro livro = new Livro();
	static Scanner    sc = new Scanner(System.in);
	
	@Override
	public void cadastrarLivro(Livro livro) {
		System.out.println("Digite o nome do livro: ");
		livro.setNome_livro(sc.next());
		System.out.println("Digite o nome do autor: ");
		livro.setNome_autor(sc.next());
		System.out.println("Digite o código: ");
		livro.setCode(sc.nextInt());
		System.out.println("Digite o número de páginas: ");
		livro.setNum_pgs(sc.nextInt());
	}

	@Override
	public Livro buscarCodigo(int code) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Livro> listartodosLivros() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Livro> buscanomeLivro(String nome_livro) {
		// TODO Auto-generated method stub
		return null;
	}

	public void salvar(Livro livro2) {
		// TODO Auto-generated method stub
		
	}

	public List<Livro> listarTodos() {
		// TODO Auto-generated method stub
		return null;
	}

	public void excluir(Integer id) {
		// TODO Auto-generated method stub
		
	}

	public Livro selecionarPorId(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

}
