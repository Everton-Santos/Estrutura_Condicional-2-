package br.com.udemy.Telefonia;

import java.util.Scanner;

public class Usuario {
			
	private String nomeCompleto;
	private int idade;
	
	public void nome(String nomeSobrenome) {
		this.nomeCompleto = nomeSobrenome;
	}
	
	public Integer idade(int idade) {
		return this.idade = idade;
	}

	@Override
	public String toString() {
		return "Usuário: " + nomeCompleto + "\nIdade: " + idade + " anos";
	}
	
	
}
