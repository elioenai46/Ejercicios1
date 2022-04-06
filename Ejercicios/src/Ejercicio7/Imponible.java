/*
 Autor: Salvador Elioenai Antonio Pérez
 Fecha de creación: 05 de abril del 2022
 Fecha de actualización: 06 de abril del 2022
 Descripción: Cálcula el total de una factura a partir de la base imponente 
 */
package Ejercicio7;

public class Imponible {
	private double factura;

	public Imponible(double factura) {
		this.factura = factura;
	}
	
	public double getBase() {
		return this.factura/1.21;
	}
	public void imprimirImponible() {
		System.out.println("Base imponible al 21% de IVA = "+getBase());
	}

	public double getFactura() {
		return factura;
	}

	public void setFactura(double factura) {
		this.factura = factura;
	}
	
	
}
