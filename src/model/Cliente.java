package model;

public class Cliente {
	private String nome;
	private String sobrenome;
	private String cpf;
	private String endereco;
	
	public Cliente() {
		super();
	}

	public Cliente(String nome, String sobrenome, String cpf, String endereco) {
		super();
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.cpf = cpf;
		this.endereco = endereco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		if(validaCpf(cpf)) {
			this.cpf = cpf;
		}else {
			System.out.println("CPF Inválido!");
		}
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	@Override
	public String toString() {
		return "Cliente [nome=" + nome + ", sobrenome=" + sobrenome + ", cpf=" + cpf + ", endereco=" + endereco + "]";
	}
	
	private boolean validaCpf(String cpf) {
		if(cpf.length() != 11) {
			return true;
		}else {
			return false;
		}
	}
}
