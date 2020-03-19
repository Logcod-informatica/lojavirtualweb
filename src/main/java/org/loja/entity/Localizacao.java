package org.loja.entity;

public class Localizacao {

	private long idLocalizacao;
	private String descricao;
	private String cidade;
	
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getCidade() {
		return cidade;
	}
	public long getIdLocalizacao() {
		return idLocalizacao;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setIdLocalizacao(long idLocalizacao) {
		this.idLocalizacao = idLocalizacao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
}
