package model;

public class Gerente extends Funcionario{
	private int senha;
	private int numeroDeFuncionariosGerenciados;
	
	public Gerente() {
		super();
	}

	public Gerente(int senha, int numeroDeFuncionariosGerenciados, String nome, Departamento departamento, double salario, String dataEntrada, String RG) {
		super(nome, departamento, salario, dataEntrada, RG);
		this.senha = senha;
		this.numeroDeFuncionariosGerenciados = numeroDeFuncionariosGerenciados;
	}

	public boolean autentica(int senha) {
		if (this.senha == senha) {
			System.out.println("Acesso Permitido!");
			return true;
		} else {
			System.out.println("Acesso Negado!");
			return false;
		}
	}

	public void setSenha(int senha) {
		this.senha = senha;
	}
	
	@Override
	public double getBonificacao() {
		return this.getSalario() * 0.15;
	}
	
}
