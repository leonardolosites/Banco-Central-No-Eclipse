package view;

import model.Conta;

public class TestaClasses {

	public static void main(String[] args) {
		Conta c = new Conta();
		
		double saque = 3650;
		
		c.setSaldo(3000);
		c.setLimite(2000);
		System.out.println("Saldo atual: "+c.getSaldo());
		System.out.println("Limite atual: "+c.getLimite());
		System.out.println("Total disponível para saque: R$"+c.saldoDisponivel());
		System.out.println();
		System.out.println("Sacar R$"+saque);
		System.out.println();
		if(c.saca(saque)) {
			System.out.println("Transação realizada com sucesso!");
			System.out.println("Saldo atual: "+c.getSaldo());
			System.out.println("Limite atual: "+c.getLimite());
			System.out.println("Total disponível para saque: R$"+c.saldoDisponivel());
		}else {
			System.out.println("Saldo insuficiente para realizar este saque!");
			System.out.println("Saldo atual: "+c.getSaldo());
			System.out.println("Limite atual: "+c.getLimite());
		}
	}	

}