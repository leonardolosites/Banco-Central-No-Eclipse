package model;

public class Funcionario {
	private String nome;
	private Departamento departamento;
	private double salario;
	private String dataEntrada;
	private String RG;

	public Funcionario() {
		super();
	}

	public Funcionario(String nome, Departamento departamento, double salario, String dataEntrada, String RG) {
		super();
		this.nome = nome;
		this.departamento = departamento;
		this.salario = salario;
		this.dataEntrada = dataEntrada;
		this.RG = RG;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String getDataEntrada() {
		return dataEntrada;
	}

	public String getRG() {
		return RG;
	}

	public void setRG(String RG) {
		this.RG = RG;
	}

	@Override
	public String toString() {
		return "Funcionario [nome=" + nome + ", departamento=" + departamento.getNome() + ", salario=" + salario
				+ ", dataEntrada=" + dataEntrada + ", RG=" + RG + "]";
	}

	public String toString(int t) {
		return "Funcionario:"+nome;
	}

	public boolean recebeAumento(double valor) {
		salario += valor;
		return true;
	}

	public double calculaGanhoAnual() {
		return salario * 12;
	}

	public void print() {
		String dados = "Novo Funcionário\n";
		dados += "\nNome: "+nome;
		dados += "\nDepartamento: "+departamento.getNome();
		dados += "\nSalário: R$"+salario;
		dados += "\nAdmissão: "+dataEntrada;
		dados += "\nRG: "+RG;

		System.out.println(dados);
	}

	public double getBonificacao() {
		return salario * 0.10;
	}

}
