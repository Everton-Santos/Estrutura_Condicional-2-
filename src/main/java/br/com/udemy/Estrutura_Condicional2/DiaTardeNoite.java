package br.com.udemy.Estrutura_Condicional2;

public class DiaTardeNoite {

	public void Cumprimento(int horasAtualRedondo) {
		if (horasAtualRedondo >= 6 && horasAtualRedondo < 12) {
			System.out.print("Bom dia!");
		} else if (horasAtualRedondo >= 12 && horasAtualRedondo < 18) {
			System.out.print("Boa tarde!");
		} else {
			System.out.print("Boa noite!");
		}
	}
}
