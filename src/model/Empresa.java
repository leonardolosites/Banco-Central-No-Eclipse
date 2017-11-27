package model;

public class Empresa {
	private String nome;
	private String cnpj;
	private Funcionario[] empregados;
	private String endereco;
	private String telefone;
	
	public Empresa() {
		super();
	}

	public Empresa(String nome, String cnpj, Funcionario[] empregados, String endereco, String telefone) {
		super();
		this.nome = nome;
		this.cnpj = cnpj;
		this.empregados = empregados;
		this.endereco = endereco;
		this.telefone = telefone;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public Funcionario[] getEmpregados() {
		return empregados;
	}

	public void setEmpregados(Funcionario[] funcionarios) {
		this.empregados = funcionarios;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	public void adiciona(Funcionario f) {
		for(int x = 0; x < empregados.length; x++) {
			empregados[x] = f;
		}
	}
	
	public void mostraEmpregados() {
		for(int x = 0; x < empregados.length; x++) {
			System.out.println("Salário: "+empregados[x].getSalario());
		}
	}
}
