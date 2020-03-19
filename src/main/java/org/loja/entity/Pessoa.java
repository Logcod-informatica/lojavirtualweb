package org.loja.entity;

public class Pessoa {
    private int idPessoa;
	private String nome;
	private String email;
	private String contact;
	private Localizacao localizacao;
	public void setLocalizacao(Localizacao localizacao) {
		this.localizacao = localizacao;
	}
	public Localizacao getLocalizacao() {
		return localizacao;
	}
	public String getNome() {
		return nome;
	}
	public String getEmail() {
		return email;
	}
	public String getContact() {
		return contact;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	
	public Pessoa() {
		// TODO Auto-generated constructor stub
	}
	public Pessoa(String nome, String email, String contact) {
		super();
		this.nome = nome;
		this.email = email;
		this.contact = contact;
	}
	
	@Override
	public String toString() {
		return "Pessoa [idPessoa=" + idPessoa + ", nome=" + nome + ", email=" + email + ", contact=" + contact
				+ ", localizacao=" + localizacao + "]";
	}
	public void setIdPessoa(int idPessoa) {
		this.idPessoa = idPessoa;
	}
	public int getIdPessoa() {
		return idPessoa;
	}
}
