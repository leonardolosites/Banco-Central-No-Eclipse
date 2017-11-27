package model;

public class Conta {
	private int numero;
	private String tipo;
	private Cliente titular;
	private double saldo;
	private double limite;
	
	public Conta() {
		super();
	}
	
	public Conta(int numero, String tipo, Cliente dono, double saldo, double limite) {
		super();
		this.numero = numero;
		this.tipo = tipo;
		this.titular = dono;
		this.saldo = saldo;
		this.limite = limite;
	}
	
	@Override
	public String toString() {
		return "Conta [numero=" + numero + ", tipo=" + tipo + ", titular=" + titular.getNome() + ", saldo=" + saldo + ", limite="
				+ limite + "]";
	}

	public int getNumero() {
		return numero;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Cliente getTitular() {
		return titular;
	}

	public void setTitular(Cliente dono) {
		this.titular = dono;
	}

	public double getSaldo() {
		return saldo;
	}

	public boolean saca(double valor) {
		if(saldo+limite >= valor) {
			if(valor > saldo) {
				limite -= valor - saldo;
				saldo -= valor;
				return true;
			}else {
				saldo -= valor;
				return true;
			}
		}else {
			return false;
		}
	}
	
	public boolean deposita(double valor) {
		if(valor <= 0) {
			return false;
		}else {
			saldo += valor;
			return true;
		}
	}
	
	public boolean tranferePara(Conta destino, double valor) {
		if(this.saca(valor)) {
			destino.deposita(valor);
			return true;
		}else {
			return false;
		}
	}
	
	public double saldoDisponivel() {
		if(saldo > 0 || limite > 0) {
			if(saldo > 0 && limite > 0) {
				return saldo+limite;
			}else if(saldo < 0 && limite > 0) {
				return limite;
			}else {
				return saldo+limite;
			}
		}else{
			return 0;
		}
	}
}
