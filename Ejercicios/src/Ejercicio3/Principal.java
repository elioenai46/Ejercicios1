/*
 Autor: Salvador Elioenai Antonio Pérez
 Fecha de creación: 05 de abril del 2022
 Fecha de actualización: 06 de abril del 2022
 Descripción: Conversor de pesetas a euros  
 */
package Ejercicio3;

import java.util.Scanner;

public class Principal {

	private static Scanner scanner;
	private static Convertidor conversor;

	public static void main(String[] args) {
		scanner = new Scanner(System.in);
		System.out.println("Pesetas : ");
		double euros = scanner.nextDouble();
		conversor = new Convertidor(euros);
		conversor.getPesetas();
		conversor.getResultado();
		conversor.imprimirResultado();

	}
}
