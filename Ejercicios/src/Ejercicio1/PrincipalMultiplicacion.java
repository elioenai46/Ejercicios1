/*
 Autor: Salvador Elioenai Antonio Pérez
 Fecha de creación: 05 de abril del 2022
 Fecha de actualización: 06 de abril del 2022
 Descripción: El siguiente programa hace la multiplicacion de dos numeros 
 */
package Ejercicio1;

import java.util.Scanner;

public class PrincipalMultiplicacion {
	private static Scanner scanner;
	private static Multiplicación multiplicacion;

	public static void main(String[] args) {
		scanner = new Scanner(System.in);
		System.out.println("Digite el primer numero: ");
		double num1 = scanner.nextDouble();
		scanner = new Scanner(System.in);
		System.out.println("Digite el segundo numero: ");
		double num2 = scanner.nextDouble();
		multiplicacion = new Multiplicación();
		multiplicacion.setNum1(num1);
		multiplicacion.setNum2(num2);
		multiplicacion.imprimirMultiplicacion();

	}

}
