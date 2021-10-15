package br.com.udemy.Preco;

public class App {

	public static void main(String[] args) {
		
		Demo de = new Demo();
		
		double preco = 34.5;
		
		de.desconto(preco);
		System.out.println(de.toString());

	}

}
