/*
 Autor: Salvador Elioenai Antonio Pérez
 Fecha de creación: 05 de abril del 2022
 Fecha de actualización: 06 de abril del 2022
 Descripción: Realiza un conversor de euros a pesetas
 */
package Ejercicio2;

import java.util.Scanner;

public class Principal {
	private static Scanner scanner;
	private static Convertidor conversor;

	public static void main(String[] args) {
		scanner = new Scanner(System.in);
		System.out.println("Euros : ");
		double euros = scanner.nextDouble();
		conversor = new Convertidor(euros);
		conversor.getEuros();
		conversor.getResultado();
		conversor.imprimirResultado();
	}
}
