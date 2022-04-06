/*
 Autor: Salvador Elioenai Antonio Pérez
 Fecha de creación: 05 de abril del 2022
 Fecha de actualización: 06 de abril del 2022
 Descripción: Cálcula el total de una factura a partir de la base imponente 
 */
package Ejercicio7;
import java.util.Scanner;


public class Principal {
	private static Scanner scanner;
	private static Imponible imponible;
	public static void main(String[] args) {
		scanner = new Scanner(System.in);
		System.out.println("Ingrese el total de la factura: ");
		double factura = scanner.nextDouble();
		imponible= new Imponible(factura);
		imponible.setFactura(factura);
		imponible.imprimirImponible();
		// TODO Auto-generated method stub

	}

}
