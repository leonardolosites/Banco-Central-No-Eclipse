package model;

public class Carro {
	private String cor;
	private String modelo;
	private double velocidadeAtual;
	private double velocidadeMaxima;
	private Motor motor;
	
	public Carro() {
		super();
	}

	public Carro(String cor, String modelo, double velocidadeAtual, double velocidadeMaxima, Motor motor) {
		super();
		this.cor = cor;
		this.modelo = modelo;
		this.velocidadeAtual = velocidadeAtual;
		this.velocidadeMaxima = velocidadeMaxima;
		this.motor = motor;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public double getVelocidadeAtual() {
		return velocidadeAtual;
	}

	public void setVelocidadeAtual(double velocidadeAtual) {
		this.velocidadeAtual = velocidadeAtual;
	}

	public double getVelocidadeMaxima() {
		return velocidadeMaxima;
	}

	public void setVelocidadeMaxima(double velocidadeMaxima) {
		this.velocidadeMaxima = velocidadeMaxima;
	}
	
	public Motor getMotor() {
		return motor;
	}

	public void setMotor(Motor motor) {
		this.motor = motor;
	}

	@Override
	public String toString() {
		return "Carro [cor=" + cor + ", modelo=" + modelo + ", velocidadeAtual=" + velocidadeAtual
				+ ", velocidadeMaxima=" + velocidadeMaxima + ", motor=" + motor + "]";
	}

	public void liga() {
		System.out.println("O carro está ligado!");
	}
	
	public void acelera(double quantidade) {
		if(velocidadeAtual + quantidade <= velocidadeMaxima) {
			velocidadeAtual += quantidade;
		}else {
			System.out.println("A velocidade informada excede o limite do carro!");
		}
	}
	
	public int pegaMarcha() {
		if(velocidadeAtual < 0){
			return -1;
		}
		if(velocidadeAtual >= 0 && velocidadeAtual < 40) {
			return 1;
		}
		if(velocidadeAtual >= 40 && velocidadeAtual < 80) {
			return 2;
		}
		return 3;
	}
}
