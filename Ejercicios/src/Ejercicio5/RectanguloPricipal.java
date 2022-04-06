/*
 Autor: Salvador Elioenai Antonio Pérez
 Fecha de creación: 05 de abril del 2022
 Fecha de actualización: 06 de abril del 2022
 Descripción: Cálcula el area de un rectangulo
 */
package Ejercicio5;

import java.util.Scanner;

public class RectanguloPricipal {
	private static Scanner scanner;
	private static Rectangulo rectangulo;

	public static void main(String[] args) {
		scanner = new Scanner(System.in);
		System.out.println("Ingresa la base: ");
		double base = scanner.nextDouble();
		System.out.println("Ingresa la altura: ");
		double altura = scanner.nextDouble();
		rectangulo = new Rectangulo();
		rectangulo.setBase(base);
		rectangulo.setAltura(altura);
		rectangulo.imprimirArea();
	}
}
