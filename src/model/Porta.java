package model;

public class Porta {
	private boolean aberta;

	public Porta(boolean aberta) {
		super();
		this.aberta = aberta;
	}

	public Porta() {
		super();
	}

	public boolean isAberta() {
		return aberta;
	}

	public void abrir() {
		aberta = true;
	}
	
	public void fechar() {
		aberta = false;
	}
	
}
