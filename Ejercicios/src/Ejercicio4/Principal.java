/*
 Autor: Salvador Elioenai Antonio Pérez
 Fecha de creación: 05 de abril del 2022
 Fecha de actualización: 06 de abril del 2022
 Descripción: Este programa realiza la suma, resta, dicvisión y multiplicación de dos números introducidos por el teclado
 */
package Ejercicio4;

import java.util.Scanner;

public class Principal {
	private static Scanner scanner;
	private static Multiplicacion multiplicacion;
	private static Division division;
	private static Suma suma;
	private static Resta resta;

	public static void main(String[] args) {
		scanner = new Scanner(System.in);
		System.out.println("Digite el primer numero: ");
		double num1 = scanner.nextDouble();
		scanner = new Scanner(System.in);
		System.out.println("Digite el segundo numero: ");
		double num2 = scanner.nextDouble();
		// Multiplicacion
		multiplicacion = new Multiplicacion(num1, num2);
		multiplicacion.setNum1(num1);
		multiplicacion.setNum2(num2);
		multiplicacion.imprimirMultiplicacion();
		// Resta
		resta = new Resta(num1, num2);
		resta.setNum1(num1);
		resta.setNum2(num2);
		resta.imprimirResta();
		// Suma
		suma = new Suma(num1, num2);
		suma.setNum1(num1);
		suma.setNum2(num2);
		suma.imprimirSuma();
		// Division
		division = new Division(num1, num2);
		division.setNum1(num1);
		division.setNum2(num2);
		division.imprimirDivision();

	}

}
