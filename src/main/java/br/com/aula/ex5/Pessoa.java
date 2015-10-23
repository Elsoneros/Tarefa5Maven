package br.com.aula.ex5;

public class Pessoa {
	private String nome;
	private String CPF;

	public Pessoa(String nome, String cpf) {
		this.nome = nome;
		if(cpf.equals("INVALIDO")){
			throw new IllegalArgumentException("CPF INVALIDO");
		}
		this.CPF = cpf;

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCPF() {
		return CPF;
	}

	public void setCPF(String cPF) {
		CPF = cPF;
	}

}