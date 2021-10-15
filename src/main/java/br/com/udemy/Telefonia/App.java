package br.com.udemy.Telefonia;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.MissingFormatArgumentException;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Operadora op = new Operadora();
		
		try {
			
			System.out.print("Quantidade de minutos gastos: ");
			int minutos = sc.nextInt();
			
			System.out.printf("Minutos gastos: %dmin \n", minutos);
			System.out.printf("Valor a pagar: %.2f$ \n", op.minutosGastos(minutos));
			
		} catch (NullPointerException n) {
			System.err.println("*** O valor não pode ser nulo! ***");
		} catch (InputMismatchException i) {
			System.err.println("*** Catacter inválido! ***");
		} catch (MissingFormatArgumentException m) {
			System.err.println("*** Formato de valor (%.2f ou %d) no código inválido ***");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			sc.close();
			System.out.println("\nPrograma encerrado com sucesso!");
		}
		
		
	}

}
