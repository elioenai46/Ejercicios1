/*
 Autor: Salvador Elioenai Antonio Pérez
 Fecha de creación: 05 de abril del 2022
 Fecha de actualización: 06 de abril del 2022
 Descripción: Cálcula el area de un tringulo
 */
package Ejercicio6;

import java.util.Scanner;

import Ejercicio5.Rectangulo;


public class TrianguloPrincipal {

	private static Scanner scanner;
	private static Triangulo triangulo;
	public static void main(String[] args) {
		scanner = new Scanner(System.in);
		System.out.println("Ingresa la base: ");
		double base = scanner.nextDouble();
		System.out.println("Ingresa la altura: ");
		double altura = scanner.nextDouble();
		triangulo = new Triangulo(altura, base);
		triangulo.setBase(base);
		triangulo.setAltura(altura);
		triangulo.imprimirArea();

	}

}
