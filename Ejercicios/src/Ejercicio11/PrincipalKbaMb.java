/*
 Autor: Salvador Elioenai Antonio Pérez
 Fecha de creación: 05 de abril del 2022
 Fecha de actualización: 06 de abril del 2022
 Descripción: Conversor de Kb a Mb
 */
package Ejercicio11;
import java.util.Scanner;


public class PrincipalKbaMb {
	private static Scanner scanner;
	private static Conversor kilo;
	public static void main(String[] args) {
		scanner = new Scanner(System.in);
		System.out.println("Digite los megabytes que desea convertir: ");
		double megabyte= scanner.nextDouble();
		kilo = new Conversor(megabyte);
		kilo.setKilobyte(megabyte);
		kilo.imprimirResultado();
		// TODO Auto-generated method stub

	}

}
