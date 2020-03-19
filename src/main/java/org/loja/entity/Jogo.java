package org.loja.entity;

public class Jogo {

	private Integer idJogo;
	private String value;
	private boolean disponivel;
	public Integer getIdJogo() {
		return idJogo;
	}
	public String getValue() {
		return value;
	}
	public boolean isDisponivel() {
		return disponivel;
	}
	public void setIdJogo(Integer idJogo) {
		this.idJogo = idJogo;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public void setDisponivel(boolean disponivel) {
		this.disponivel = disponivel;
	}
	@Override
	public String toString() {
		return "Jogo [idJogo=" + idJogo + ", value=" + value + ", disponivel=" + disponivel + "]";
	}
	
}
