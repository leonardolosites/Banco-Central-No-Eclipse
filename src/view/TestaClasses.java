package view;

import model.Departamento;
import model.Funcionario;
import model.Gerente;

public class TestaClasses {
	public static void main(String[] args) {
		Departamento dep = new Departamento("TI");
		Gerente g = new Gerente(1111, 2, "Leonardo Oliveira", dep, 6000, "01/02/2010", "1254585");
		System.out.println(g.getBonificacao());
		
		Funcionario f = g;
		System.out.println(f.getBonificacao());
	}	

}