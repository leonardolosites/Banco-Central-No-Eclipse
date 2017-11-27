package model;

public class Casa {
	private String cor;
	private int totalDePortas;
	private Porta portas[];
	
	public Casa() {
		super();
	}

	public Casa(String cor, int totalDePortas, Porta[] portas) {
		super();
		this.cor = cor;
		this.totalDePortas = totalDePortas;
		this.portas = portas;
	}

	public String getCor() {
		return cor;
	}
	
	public void setCor(String cor) {
		this.cor = cor;
	}
	
	public int getTotalDePortas() {
		return totalDePortas;
	}
	
	public void setTotalDePortas(int totalDePortas) {
		this.totalDePortas = totalDePortas;
	}
	
	public Porta[] getPortas() {
		return portas;
	}
	
	public void setPortas(Porta[] portas) {
		this.portas = portas;
	}
	
	public void pinta(String cor) {
		setCor(cor);
	}
	
	public int quantasPortasEstaoAbertas() {
		int contador = 0;
		for(int i = 0;i < portas.length; i++){
			if(portas[i].isAberta()) {
				contador += 1;
			}
		}
		
		return contador;
	}
	
	public int totalDePortas() {
		return portas.length;
	}
	
	public void adicionaPorta(Porta porta) {
		portas[portas.length+1] = porta;
	}
	
}
