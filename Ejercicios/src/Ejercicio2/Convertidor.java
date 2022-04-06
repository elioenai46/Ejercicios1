/*
 Autor: Salvador Elioenai Antonio Pérez
 Fecha de creación: 05 de abril del 2022
 Fecha de actualización: 06 de abril del 2022
 Descripción: Realiza un conversor de euros a pesetas
 */
package Ejercicio2;

public class Convertidor {
	private double euros;

	public Convertidor(double euros) {
		this.euros = euros;
	}

	public double getResultado() {
		return this.euros * 166386;
	}

	public void imprimirResultado() {
		System.out.println(this.euros + " Euros es igual a " + this.getResultado() + " Pesetas ");
	}

	public double getEuros() {
		return euros;
	}

	public void setEuros(double euros) {
		this.euros = euros;
	}

}
