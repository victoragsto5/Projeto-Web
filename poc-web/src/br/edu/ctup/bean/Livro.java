package br.edu.ctup.bean;

public class Livro {
	private String nome_livro, nome_autor;
	private int code, estoque_inicial, num_pgs;
	private float preco;
	
	public String getNome_livro() {
		return nome_livro;
	}
	public void setNome_livro(String nome_livro) {
		this.nome_livro = nome_livro;
	}
	public String getNome_autor() {
		return nome_autor;
	}
	public void setNome_autor(String nome_autor) {
		this.nome_autor = nome_autor;
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public int getEstoque_inicial() {
		return estoque_inicial;
	}
	public void setEstoque_inicial(int estoque_inicial) {
		this.estoque_inicial = estoque_inicial;
	}
	public int getNum_pgs() {
		return num_pgs;
	}
	public void setNum_pgs(int num_pgs) {
		this.num_pgs = num_pgs;
	}
	public float getPreco() {
		return preco;
	}
	public void setPreco(float preco) {
		this.preco = preco;
	}
	
	
}
