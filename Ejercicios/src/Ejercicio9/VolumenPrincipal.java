/*
 Autor: Salvador Elioenai Antonio Pérez
 Fecha de creación: 05 de abril del 2022
 Fecha de actualización: 06 de abril del 2022
 Descripción: Calcula el volumen de un cono a partir de la formula V= 1/3*PI*R^2*H
 */
package Ejercicio9;

import java.util.Scanner;


public class VolumenPrincipal {
	private static Scanner scanner;
	private static Volumen volumen;
	public static void main(String[] args) {
		scanner = new Scanner(System.in);
		System.out.println("Altura: ");
		double altura = scanner.nextDouble();
		scanner = new Scanner(System.in);
		System.out.println("Radio: ");
		double radio = scanner.nextDouble();
		volumen = new Volumen(altura, radio);
		volumen.setAltura(altura);
		volumen.setRadio(radio);
		volumen.imprimirResultado();

	}

}
