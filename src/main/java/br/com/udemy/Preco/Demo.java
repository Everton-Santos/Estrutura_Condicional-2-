package br.com.udemy.Preco;

public class Demo {
	
	private double desconto;
	private double preco = this.preco;
	private double valorFinal;
	
	public double desconto(double preco) {
		this.preco = preco;
		if(preco < 20) {
			desconto = preco * 0.1;
		}
		else {
			desconto = preco * 0.05;
		}
		valorFinal = preco - desconto;
		return desconto;
	}

	@Override
	public String toString() {
		return "Preço = " + this.preco + 
				"$\nDesconto = " + desconto +
				"$\nValor Final = " + valorFinal +
				"$";
	}

	
}
