package br.com.udemy.Telefonia;

public class Operadora {

	private double valor = 50.00;
	private double adicional = 2.00;
	private double minutos = this.minutos;
	
	public double minutosGastos(int minutos) {
		if(minutos <= 100) {
			return valor;
		}
		else {
			int variavel = minutos - 100;
			adicional = variavel * adicional;
		}
		return valor + adicional;
	}
	
	
	
}
