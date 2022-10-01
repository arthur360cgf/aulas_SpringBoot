package br.com.cod3r.exerciciossb.models;

public class Cliente {
	
	
	private int id;
	private String nome;
	private String cpf;	
	
	public Cliente(int i, String string, String string2) {
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
}
