package br.edu.ctup.bean;

import javax.persistence.GeneratedValue;

import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.sun.javafx.beans.IDProperty;

public class Cliente {
	private String nome, login, senha;
	private long rg, cpf;
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private int code;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public long getRg() {
		return rg;
	}
	public void setRg(long rg) {
		this.rg = rg;
	}
	public long getCpf() {
		return cpf;
	}
	public void setCpf(long cpf) {
		this.cpf = cpf;
	}
	
	
}
