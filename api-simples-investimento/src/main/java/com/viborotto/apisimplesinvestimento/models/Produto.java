package com.viborotto.apisimplesinvestimento.models;

public class Produto {
	private int id;
	private double rendimento;
	private String nome;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getRendimento() {
		return rendimento;
	}
	public void setRendimento(double rendimento) {
		this.rendimento = rendimento;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
}
