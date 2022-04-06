/*
 Autor: Salvador Elioenai Antonio Pérez
 Fecha de creación: 05 de abril del 2022
 Fecha de actualización: 06 de abril del 2022
 Descripción: Conversor de Mb a Kb
 */
package Ejercicio10;
import java.util.Scanner;


public class ConversorMbaKbPrincipal {
	private static Scanner scanner;
	private static Conversor mega;
	public static void main(String[] args) {
		scanner = new Scanner(System.in);
		System.out.println("Digite los megabytes que desea convertir: ");
		double megabyte= scanner.nextDouble();
		mega = new Conversor(megabyte);
		mega.setMegabyte(megabyte);
		mega.imprimirResultado();

	}

}
