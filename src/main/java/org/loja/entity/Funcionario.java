package org.loja.entity;

public class Funcionario {

	private long idFuncionario;
	private String login;
	private String senha;
	public long getIdFuncionario() {
		return idFuncionario;
	}
	public String getLogin() {
		return login;
	}
	public String getSenha() {
		return senha;
	}
	public void setIdFuncionario(long idFuncionario) {
		this.idFuncionario = idFuncionario;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	
}
