package org.loja.entity;

public class Carro {
	
	private int index;
	private String value;
	private int qtd;
	
	public void setQtd(int qtd) {
		this.qtd = qtd;
	}
	public int getQtd() {
		return qtd;
	}
	
	public String getValue() {
		return value;
	}
	
	public void setIndex(int index) {
		this.index = index;
	}
	public int getIndex() {
		return index;
	}
	public void setValue(String value) {
		this.value = value;
	}
	
	public Carro() {
		// TODO Auto-generated constructor stub
	}
	public Carro(String value) {
		super();
		this.value = value;
	}
	@Override
	public String toString() {
		return "Carro [index=" + index + ", value=" + value + ", qtd=" + qtd + "]";
	}
	

}
