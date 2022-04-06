/*
 Autor: Salvador Elioenai Antonio Pérez
 Fecha de creación: 05 de abril del 2022
 Fecha de actualización: 06 de abril del 2022
 Descripción: Calcula el salario semanal de un empleado con base a las horas trabajadas a razon de 12 euros la hora 
 */
package Ejercicio8;

import java.util.Scanner;

public class PrincipalSalario {
	private static Scanner scanner;
	private static Salario salario;

	public static void main(String[] args) {
		scanner = new Scanner(System.in);
		System.out.println("Cuantas horas trabajo al dia: ");
		double horas = scanner.nextDouble();
		salario = new Salario(horas);
		salario.setHoras(horas);
		salario.imprimirPago();

	}

}
